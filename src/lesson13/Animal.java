package lesson13;

public class Animal {
    private String name;
    private String color;
    private int age;
    private int weight;

    public Animal(String name, String color, int age, int weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        if (weight != animal.weight) return false;
        if (name != null ? !name.equals(animal.name) : animal.name != null) return false;
        return color != null ? color.equals(animal.color) : animal.color == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + weight;
        return result;
    }

    @Override
    public String toString() {
        return "Животные {" +
                "кличка: '" + name + '\'' +
                ", цвет: '" + color + '\'' +
                ", возраст: " + age +
                ", вес: " + weight +
                '}' + "\n";
    }
}
