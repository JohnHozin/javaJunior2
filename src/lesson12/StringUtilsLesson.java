package lesson12;

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
        int startIndex = 0;
        int[] arrText = new int[100];
        int arrSize = 0;
        for (int i = 0; i < arrText.length; i++) {
            if (text.indexOf(word, startIndex) == -1) {
                break;
            } else {
                arrText[i] = text.indexOf(word, startIndex);
                startIndex = arrText[i] + 1;
                arrSize++;
            }
        }

        int [] arrText2= new int[arrSize];
        for (int j=0; j< arrText2.length;j++) {
            arrText2[j] = arrText[j];
        }

//        LinkedList linkedList= new LinkedList<>();
//        int startIndex = 0;
//        while (text.indexOf(word, startIndex)!=-1){
//            linkedList.add(text.indexOf(word, startIndex));
//            startIndex = text.indexOf(word, startIndex) + 1;
//        }
        return arrText2;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {

        double [] arrNumbers = new double[100];

        Matcher match = Pattern.compile("(?!=\\d\\.\\d\\.)([\\d.]+)").matcher(text);
        int arrNumSize = 0;
        for (int i=0;i< arrNumbers.length;i++) {
            while (match.find()) {
                arrNumbers[i] = Double.parseDouble(match.group(1));
                arrNumSize++;
                break;
            }

        }

        if (arrNumSize==0){
            throw new CustomException("Not found");
        }

        double [] arrNumbers2= new double[arrNumSize];
        for (int j=0; j< arrNumbers2.length;j++) {
            arrNumbers2[j] = arrNumbers[j];
        }

        return arrNumbers2;
    }
}
