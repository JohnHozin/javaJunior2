package lesson11;

import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        HashSet<Money> monies = new HashSet<>();

        monies.add(new Money(1,2000,"Золото", 2.2));
        monies.add(new Money(2,2000,"Золото", 2.0));
        monies.add(new Money(1,2000,"Золото", 2.2));
        monies.add(new Money(1,2005,"Золото", 2.5));
        monies.add(new Money(10,2000,"Серебро", 1.2));

        System.out.println(monies);

    }
}
