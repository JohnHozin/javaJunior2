package lesson13;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main4 {
    public static void main(String[] args) {

        Animal animal1 = new Dog("Вася1", "Серый1", 2, 10);
        Animal animal2 = new Cat("Вася2", "Серый2", 3, 6);
        Cat animal3 = new Cat("Вася3", "Серый3", 4, 6);
        Dog animal4 = new Dog("Вася4", "Серый4", 5, 10);
        Animal animal5 = new Parrot("Вася5", "Серый5", 6, 5);
        Animal animal6 = new Parrot("Вася6", "Серый6", 7, 4);

        Map<String, Animal> mapAnimal = new LinkedHashMap<>();
        mapAnimal.put("Игривый", animal1);
        mapAnimal.put("Ленивый", animal2);
        mapAnimal.put("Ласковый", animal3);
        mapAnimal.put("Злой", animal4);
        mapAnimal.put("Говорливый", animal5);
        mapAnimal.put("Молчун", animal6);

        System.out.println(mapAnimal);
    }
}
