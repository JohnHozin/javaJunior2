package lesson12;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsLesson implements StringUtils {

    @Override
    public double div(String number1, String number2) throws NullPointerException,
            NumberFormatException, ArithmeticException {
        double ret;
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 == null || number2 == null");
        }
        double n1 = Double.parseDouble(number1);
        double n2 = Double.parseDouble(number2);

        if (n2 == 0) {
            throw new ArithmeticException("number2 = 0");
        }
        ret = n1 / n2;
        return ret;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null) {
            throw new NullPointerException("text == null || word == null");
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        int startIndex = 0;
        while (text.indexOf(word, startIndex) != -1) {
            arrayList.add(text.indexOf(word, startIndex));
            startIndex = text.indexOf(word, startIndex) + 1;
        }

        int[] arrText = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            arrText[i] = arrayList.get(i);
        }
        return arrText;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {


        ArrayList<Double> arrayListNum = new ArrayList<>();

        Matcher match = Pattern.compile("(?!=\\d\\.\\d\\.)([\\d.]+)").matcher(text);

        while (match.find()) {
            arrayListNum.add(Double.parseDouble(match.group(1)));
        }

        if (arrayListNum.isEmpty()) {
            throw new CustomException("Not found");
        }

        double[] arrNumbers = new double[arrayListNum.size()];
        for (int i = 0; i < arrayListNum.size(); i++) {
            arrNumbers[i] = arrayListNum.get(i);
        }
        System.out.println("1241");

        return arrNumbers;
    }
}
