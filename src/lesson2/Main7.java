package lesson2;

public class Main7 {
    public static void main(String[] args) {
        /**
         * Есть массив чисел, самостоятельно их заполните
         * Задача: напечатать то, что в массиве, через ячейку в обратном порядке
         */

        int numbers[] = {2, 5, 8, 54, 1, 34, 8, 45, 2, 8};

//        System.out.println(numbers[9]);
//        System.out.println(numbers[7]);
//        System.out.println(numbers[5]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[1]);

        for (int i = 9; i >= 0; i = i - 2) {
            System.out.println(numbers[i]);
        }

        for (int i = numbers.length - 1; i >= 0; i = i - 2) {
            System.out.println(numbers[i]);
        }
    }
}
