package lesson8;

public class Krug implements Figura, Figura3d{

    @Override
    public void printObem() {
        System.out.println("Obem");
    }

    @Override
    public void printPer() {
        System.out.println("Perimetr");
    }

    @Override
    public void print3D() {
        System.out.println("3D");
    }
}
