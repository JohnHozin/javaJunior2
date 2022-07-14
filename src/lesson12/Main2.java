package lesson12;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        Person p = new Person();
        while (a==true || b==true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя");
            String name = scanner.nextLine();
            try {
                p.setName(name);
                a = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Введите возраст");
            int age = Integer.parseInt(scanner.nextLine());
            try {
                p.setAge(age);
                b = false;
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
