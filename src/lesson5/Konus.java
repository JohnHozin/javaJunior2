package lesson5;

public class Konus {
    private int r1;
    private int h1;
    private int l;

    public void setR(int r1) {
        this.r1 = r1;
    }

    public void setH(int h1) {
        this.h1 = h1;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getR() {
        return this.r1;
    }

    public int getH() {
        return this.h1;
    }

    public int getL() {
        return this.l;
    }

    public double ploshdOsnovania() {
        return Math.PI * this.r1 * this.l;
    }

    public double ploshdBokovaya() {
        return Math.PI * this.r1 * this.r1;
    }

    public double ploshdPolnaya() {
        return ploshdBokovaya() + ploshdOsnovania();
    }

    public double obiem() {
        return ploshdBokovaya() * this.h1 / 3;
    }

    public static boolean pravilniyKonus(int r1, int h1, int l) {
        if (r1 <= 0 || h1 <= 0 || l <= 0) {
            return false;
        }
        return true;
    }
}
