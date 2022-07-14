package lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        /** Только четные от -100 до -50
         */
        for (int i = -100; i <= -50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("~~~~~~~~");

        /** Все числа в обратном порядке от 10 до 30
         */
        for (int i = 30; i >= 10; i--) {
            System.out.println(i);
        }
        System.out.println("~~~~~~~~");

        /** Кол-во четных чисел в диапазоне от 30 до 61
         */
        int chet = 0;
        for (int i = 30; i <= 61; i++) {
            if (i % 2 == 0) {
                chet++;
            }
        }
        System.out.println("Чётных: " + chet);

        System.out.println("~~~~~~~~");

        /** Посчитать сколько нужно лет, чтоб собрать сумму
         *   в 200т рублей, если откладывать ежемесячно по 9500
         */
        int month = 0;
        for (int i = 0; i <= 200000; i = i + 9500) {
            month++;
        }
        int years = month / 12;
        if (month % 12 != 0) {
            years++;
        }
        System.out.println("Нужно " + years + " года");

        System.out.println("~~~~~~~~");

        /** Вывести на консоль все числа от 20 до 60,
         * пропуская диапазон от 30 до 40 включительно
         */
        for (int i = 20; i <= 60; i++) {
            if (i < 30 || i > 40) {
                System.out.println(i);
            }
        }

        System.out.println("~~~~~~~~");

        /** В массив от 0 до 99 заполнить случайными числами
         * от 0 до 1000. Вывести значения в порядке возрастания
         * и посчитать сколько четных и нечетных.
         */
        int[] numbers = new int[100];
        int numChet = 0;                                   //Считаем четные и нечетные
        int numNeChet = 0;

        for (int i = 0; i < numbers.length; i++) {     //заполнили массив рандомными числами
            numbers[i] = (int) (Math.random() * 1000);
            if (numbers[i] % 2 == 0) {
                numChet++;
            } else numNeChet++;
        }

        int sort = 0;                                            //Вводим вспомогательную переменную
        for (int i = 0; i < numbers.length - 1; i++) {        //Сортируем массив по возрастанию
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    sort = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = sort;
                }
            }
            System.out.println(numbers[i]);
        }
        System.out.println("Чётных: " + numChet);
        System.out.println("Нечётных: " + numNeChet);
    }
}

