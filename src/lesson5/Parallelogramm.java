package lesson5;

public class Parallelogramm {
    private int a1;
    private int b1;
    private int h;

    public void setA(int a1) {
        this.a1 = a1;
    }

    public void setB(int b1) {
        this.b1 = b1;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getA() {
        return this.a1;
    }

    public int getB() {
        return this.b1;
    }

    public int getH() {
        return this.h;
    }

    public int perimetr() {
        return 2 * (this.a1 + this.b1);
    }

    public int ploshd() {
        return this.a1 * this.h;
    }

    public static boolean pravilniyParallelogramm(int a1, int b1, int h) {
        if (a1 <= 0 || b1 <= 0 || h <= 0) {
            return false;
        }
        return true;
    }
}
