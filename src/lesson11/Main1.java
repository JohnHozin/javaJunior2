package lesson11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        long allTimeStart = System.currentTimeMillis();
        for (int i=0; i<100000;i++){
            arrayList.add(0,"qwe"+i);

        }
        long allTimeEnd = System.currentTimeMillis();
        System.out.println(allTimeEnd-allTimeStart);
        System.out.println("==================");

        long allTimeStart1 = System.currentTimeMillis();
        for (int i=0; i<100000;i++){
            linkedList.add(0,"qwe"+i);

        }
        long allTimeEnd1 = System.currentTimeMillis();
        System.out.println(allTimeEnd1-allTimeStart1);


        long allTimeStart2 = System.currentTimeMillis();
        for (int i=0; i<100000;i++){
            arrayList.get(i);

        }
        long allTimeEnd2 = System.currentTimeMillis();
        System.out.println(allTimeEnd2-allTimeStart2);
        System.out.println("==================");

        long allTimeStart12 = System.currentTimeMillis();
        for (int i=0; i<100000;i++){
            linkedList.get(i);

        }
        long allTimeEnd12 = System.currentTimeMillis();
        System.out.println(allTimeEnd12-allTimeStart12);

        //1)
        for (int i=0; i<100000;i++){
            arrayList.add(0,"qwe"+i);

        }

        //2)
        for (String a : arrayList){
            System.out.println(a);
        }

        //3)
//        for (Iterable<String> str = (Iterable<String>) arrayList.iterator();
//             str.iterator().hasNext();){
//            str.toString();
//        }



    }
}
