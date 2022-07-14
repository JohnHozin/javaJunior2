package lesson2;

public class Main6 {
    public static void main(String[] args) {
        /**
         * создать массив длиной в 10 элементов (с произв числами)
         * Задача: вывести на консоль сколько четных и сколько нечетных в нем чисел
         */

        int numbers[] = {3, 5, 7, 3, 7, 8, 2, 5, 1, 3};
        int chet = 0;
        int neСhet = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                chet++;
            } else neСhet++;

        }
        System.out.println("Чётных " + chet + ", Нечетных " + neСhet);

    }
}
