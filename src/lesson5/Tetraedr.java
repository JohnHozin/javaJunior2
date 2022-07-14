package lesson5;

public class Tetraedr {
    private int a2;

    public void setA2(int a2) {
        this.a2 = a2;
    }

    public int getA2() {
        return this.a2;
    }

    public double ploshd() {
        return Math.sqrt(3) * this.a2 * this.a2;
    }

    public double obiem() {
        return Math.sqrt(2) / 12 * this.a2 * this.a2 * this.a2;
    }

    public static boolean pravilniyTetraedr(int a2) {
        if (a2 <= 0) {
            return false;
        }
        return true;
    }
}
