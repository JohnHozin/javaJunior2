package lesson13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main5 {

    public static void main(String[] args) {

        Person person1 = new Person("Иван", "Иванов");
        Person person2 = new Person("Петя", "Петров");
        Person person3 = new Person("Ваня", "Иванцов");
        Person person4 = new Person("Саша", "Овечкин");

        Animal animal1 = new Animal("Вася1", "Серый1", 2, 10);
        Animal animal2 = new Cat("Вася2", "Серый2", 3, 6);
        Cat animal3 = new Cat("Вася3", "Серый3", 4, 6);
        Dog animal4 = new Dog("Вася4", "Серый4", 5, 10);
        Animal animal5 = new Parrot("Вася5", "Серый5", 6, 5);
        Animal animal6 = new Parrot("Вася6", "Серый6", 7, 4);

        Map<Person, Collection<Animal>> mapAnimal = new LinkedHashMap<>();
        Collection<Animal> colAnim1 = new ArrayList<>();
        colAnim1.add(animal1);
        mapAnimal.put(person1, colAnim1);
        Collection<Animal> colAnim2 = new ArrayList<>();
        colAnim2.add(animal2);
        colAnim2.add(animal3);
        mapAnimal.put(person2, colAnim2);
        Collection<Animal> colAnim3 = new ArrayList<>();
        colAnim3.add(animal5);
        mapAnimal.put(person3, colAnim3);
        Collection<Animal> colAnim4 = new ArrayList<>();
        colAnim4.add(animal4);
        colAnim4.add(animal6);
        mapAnimal.put(person4, colAnim4);

        System.out.println(mapAnimal);
    }
}
