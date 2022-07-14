package lesson11;

import java.util.Objects;

public class Money {
    private int value;
    private int year;
    private String material;
    private double diametr;

    public Money(){

    }

    public Money(int value, int year, String material, double diametr) {
        this.value = value;
        this.year = year;
        this.material = material;
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        String s = String.valueOf(this.hashCode());

        return s;
//                "Money{" +
//                "value=" + value +
//                ", year=" + year +
//                ", material='" + material + '\'' +
//                ", diametr=" + diametr +
//                '}'+ "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return value == money.value && year == money.year && Double.compare(money.diametr, diametr) == 0 && Objects.equals(material, money.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, year, material, diametr);
    }
}
