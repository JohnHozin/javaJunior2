package lesson6.shop;

public class Main {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar("Телефон", 7000, 123321);
        Tovar tovar2 = new Tovar("Пылесос", 300, 321123);

        Otziv otziv1 = new Otziv("User1", 5.0,
                "Хороший Телефон","Советую");
        Otziv otziv2 = new Otziv("User2", 4.0,
                "норм Телефон","Берите");

        tovar1.addOtziv(otziv1);
        tovar1.addOtziv(otziv2);
        System.out.println();

    }
}
