package lesson5;

public class Krug {
    private int r;

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return this.r;
    }

    public double dlinaaOkr() {
        return 2 * Math.PI * this.r;
    }

    public double ploshd() {
        return Math.PI * this.r * this.r;
    }

    public static boolean pravilniyKrug(int r) {
        if (r <= 0) {
            return false;
        }
        return true;
    }

}
