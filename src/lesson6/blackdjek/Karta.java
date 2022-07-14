package lesson6.blackdjek;

public class Karta {
    private String name;
    private int value;

    public Karta(String name, int value) {
        this.value = value;
        this.name = name;
    }

    public Karta() {

    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
