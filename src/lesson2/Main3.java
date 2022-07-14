package lesson2;

public class Main3 {
    public static void main(String[] args) {
        /**
         * Вывести на консоль только чётные в обратном порядке от 100 до 150
         */

        for (int i = 150; i >= 100; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
