package lesson1;

public class HomeWork1 {
    public static void main(String[] args) {
        double money = 1000;
        int pizza = 230;
        int gum = 26;
        double candies = 2.5;

        int x = 0;
        while (money > pizza) {
            money -= pizza;
            x++;
        }

        int y = 0;
        while (money > gum) {
            money -= gum;
            y++;
        }

        int z = 0;
        while (money > candies) {
            money -= candies;
            z++;
        }

        System.out.println("На эти деньги мы можем купить:");
        System.out.println("- " + x + " пиццы");
        System.out.println("- " + y + " жвачки");
        System.out.println("- " + z + " конфет");
        System.out.println("Сдача с магазина: " + money + " рубля");
    }
}
