package lesson12;

import default2.lesson10.Dealer;

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
        return new int[0];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }
}
