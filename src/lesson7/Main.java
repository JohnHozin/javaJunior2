package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(1,"Британский");
        cat.orat();

        Animal slon1 = new Animal(12, "Африканский");
        Animal slon2 = new Animal(12, "Африканский");
        Animal slon3 = slon1;

        Animal a = new Animal();
        a.orat();

        System.out.println(slon1.equals(slon2));
        System.out.println();
        System.out.println(cat.hashCode());

        System.out.println(slon1.toString());
        System.out.println(slon1);


    }
}
