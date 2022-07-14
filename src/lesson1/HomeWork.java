package lesson1;

public class HomeWork {
    public static void main(String[] args) {
        int money = 1000;
        int pizza = 230;
        int gum = 26;
        double candies = 2.5;
        double change = 0;

        int x = 0;
        if (money > pizza) {
            while (pizza < money) {
                pizza += 230;
                x++;
            }
            pizza -= 230;
            change = money - pizza;
        }

        int y = 0;
        if (change > gum) {
            while (gum < change) {
                gum += 26;
                y++;
            }
            gum -= 26;
            change = change - gum;
        }

        int z = 0;
        if (change > candies) {
            while (candies < change) {
                candies += 2.5;
                z++;
            }
            candies -= 2.5;
            change = change - candies;
        }

        System.out.println("На эти деньги мы можем купить:");
        System.out.println("- " + x + " пиццы");
        System.out.println("- " + y + " жвачки");
        System.out.println("- " + z + " конфет");
        System.out.println("Сдача с магазина: " + change + " рубля");
    }
}
