package Task7;

import java.io.Serializable;
import java.util.Objects;

public class Plant implements Serializable {
    private String name;
    private int age;
    private int price;

    public Plant(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public Plant() { }

    @Override
    public String toString() {
        return "Student " +
                "is " + name +
                ", the age is " + age +
                " and the name of university is " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return age == plant.age &&
                Objects.equals(name, plant.name) &&
                Objects.equals(price, plant.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, price);
    }
}


