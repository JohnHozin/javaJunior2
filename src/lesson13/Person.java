package lesson13;

public class Person {
    private String name;
    private String surName;

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return surName != null ? surName.equals(person.surName) : person.surName == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surName != null ? surName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Человек{" +
                "Имя: '" + name + '\'' +
                ", Фамилия:'" + surName + '\'' +
                '}';
    }
}
