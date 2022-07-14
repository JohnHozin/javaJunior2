package lesson7.figura;

public class Kvadrat extends Figura {
    private int a;

    public Kvadrat() {
    }

    public Kvadrat(int a) {
        this.a = a;
    }

    @Override
    public void printObem() {
        System.out.println("Объём квадрата: " + (a * 4));
    }

    @Override
    public void printPloshad() {
        System.out.println("Площадь квардата: " + (a * a));
    }
}
