package lesson13;

public class Cat extends Animal {
    public Cat(String name, String color, int age, int weight) {
        super(name, color, age, weight);
    }

    public Cat() {
        super();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
