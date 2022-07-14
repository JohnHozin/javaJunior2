package lesson11;

import java.util.ArrayList;
import java.util.Collection;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListA = new ArrayList<>();
        ArrayList<Integer> arrayListB = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayListA.add(i, i);
            arrayListB.add(i, i + 5);
        }
        arrayListA.add(8);
        arrayListA.add(9);

        CollectionUtils c = new CollectionUtils();
        Collection<Integer> intC = c.union(arrayListA, arrayListB);
        System.out.println(arrayListA);
        System.out.println(arrayListB);

        System.out.println("Объединение двух коллекций с дубликатами: \n" + intC);

        intC = c.intersection(arrayListA, arrayListB);
        System.out.println("Пересечение двух коллекций с дубликатами: \n" + intC);

        intC = c.unionWithoutDuplicate(arrayListA, arrayListB);
        System.out.println("Объединение двух коллекций без дубликатов: \n" + intC);

        intC = c.intersectionWithoutDuplicate(arrayListA, arrayListB);
        System.out.println("Пересечение двух коллекций без дубликатов: \n" + intC);

        intC = c.difference(arrayListA, arrayListB);
        System.out.println("Разность двух коллекций: \n" + intC);
    }
}
