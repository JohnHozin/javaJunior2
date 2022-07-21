package lesson13;


import java.util.LinkedHashMap;
import java.util.Map;

public class Main4 {
    public static void main(String[] args) {


        Animal animal1 = new Animal("Вася1", "Серый1", 8, 10);
        Cat animal2 = new Cat("Вася2", "Серый2", 8, 10);
        Animal animal3 = new Cat("Вася3", "Серый3", 8, 10);
        Dog animal4 = new Dog("Вася4", "Серый4", 8, 10);


        Map<String, Animal> mapAnimal = new LinkedHashMap<>();
        mapAnimal.put("Игривый",animal1);
        mapAnimal.put("Ленивый",animal2);
        mapAnimal.put("Ласковый",animal3);
        mapAnimal.put("Злой",animal4);

        System.out.println(mapAnimal);
    }
}
