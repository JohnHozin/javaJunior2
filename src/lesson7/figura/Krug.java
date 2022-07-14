package lesson7.figura;

public class Krug extends Figura {
    private int r;

    public Krug() {
    }

    public Krug(int r) {
        this.r = r;
    }

    @Override
    public void printObem() {
        System.out.println("Объём круга: " + (2 * Math.PI * r));
    }

    @Override
    public void printPloshad() {
        System.out.println("Площадь круга: " + (Math.PI * r * r));
    }
}
