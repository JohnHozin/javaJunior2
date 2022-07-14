package lesson2;

public class Main8 {
    public static void main(String[] args) {
        /**
         * Есть массив символов, наполним его сами (10шт)
         * вывести на консоль только гласнные с массива
         */

        char[] chars = {'r', 'd', 'f', 't', 'o', 'i', 's', 'q', 'n',};

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'q' ||
                    chars[i] == 'y' || chars[i] == 'u' || chars[i] == 'i' ||
                    chars[i] == 'o') {
                System.out.println(chars[i]);

            }
        }
    }
}
