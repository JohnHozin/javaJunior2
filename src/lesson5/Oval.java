package lesson5;

public class Oval {
    private int ra;
    private int rb;

    public void setRA(int ra) {
        this.ra = ra;
    }

    public void setRB(int rb) {
        this.rb = rb;
    }

    public int getRA() {
        return this.ra;
    }

    public int getRB() {
        return this.rb;
    }

    public double dlina() {
        return Math.PI * (this.ra + this.rb);
    }

    public double ploshd() {
        return Math.PI * this.ra * this.rb;
    }

    public static boolean pravilniyOval(int ra, int rb) {
        if (ra <= 0 || rb <= 0) {
            return false;
        }
        return true;
    }
}
