package lesson13;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {


        Student student1 = new Student("Дамир", 22);
        Student student2 = new Student("Вася", 23);
        Student student3 = new Student("Дима", 24);
        Student student4 = new Student("Леша", 25);

        Map<Student, Integer> mapStudent = new HashMap<>();
        mapStudent.put(student1, 5);
        mapStudent.put(student2, 4);
        mapStudent.put(student3, 2);
        mapStudent.put(student4, 4);

        System.out.println(mapStudent.containsKey(student1));
        student1.setAge(23);
        System.out.println(mapStudent.containsKey(student1));

//        mapStudent.put(student1, 1);
//
//        mapStudent.putIfAbsent(student1, 4);
//        System.out.println(mapStudent);
//
//
//        for (Map.Entry<Student, Integer> m : mapStudent.entrySet()) {
//            System.out.println("Key = " + m.getKey() + "Value = " + m.getValue());
//        }

        System.out.println();
        System.out.println(mapStudent.get(student1));
    }
}
