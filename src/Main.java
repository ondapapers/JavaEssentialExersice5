import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private boolean hasTail;


    public Animal(String name, int age, boolean hasTail) {
        this.name = name;
        this.age = age;
        this.hasTail = hasTail;
    }


    @Override
    public String toString() {
        String tailStatus = hasTail ? "так" : "ні";
        return "Ім'я: " + name + ", вік: " + age + ", хвіст: " + tailStatus;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return age == animal.age &&
                hasTail == animal.hasTail &&
                Objects.equals(name, animal.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age, hasTail);
    }
}
