package lesson11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(3,33);
        arrayList.set(1,77);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(333);
        arrayList2.add(444);

        arrayList.addAll(arrayList2);
        System.out.println(arrayList);
        System.out.println();

        arrayList.removeAll(arrayList2);
        arrayList.clear();

        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(4);
        linkedList.add(8);

        System.out.println(linkedList);

        linkedList.addFirst(11);
        System.out.println(linkedList);
    }
}
