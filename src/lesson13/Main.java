package lesson13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Set<Integer> s = new HashSet<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(123,"asdf");
        map.put(124,"asdf");
        map.put(125,"asdf");
        map.put(126,"asdf");
        map.put(126,"asdf");
        System.out.println(map);


    }
}
