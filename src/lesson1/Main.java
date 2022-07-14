package lesson1;

public class Main {
    public static void main(String[] args) {
        /**
         * напечатать на консоль какой вид треугольника у пользователя:
         * равнобедренный, равносторонний или разносторонний
         *
         * управляющая конструкция if else
         */

        int a = 9;
        int b = 9;
        int c = 9;

        if (a != b && b != c && c != a) {
            System.out.printf("Это разносторонний треугольник!!!");
        } else if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник!!!");
        } else {
            System.out.println("Это равнобедренный треугольник!!!");
        }

    }
}

/**
 * psvm public static void main(String[] args) {
 * sout System.out.println(
 * ctrl+/ выделенный участок закомментировать
 * ctrl+d копировать строчку
 *
 * запись массива
 * int[] numbers = new int[10]
 * int[] numbers = {2,4,7,4,7,5};
 * numbers[3]=4;
 *
 *
 *
 *
 */