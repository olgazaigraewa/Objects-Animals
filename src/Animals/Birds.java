package Animals;

import java.util.Objects;

public class Birds extends Animals{
    private String livingEnvironment;

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void go() {

    }
    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = Objects.requireNonNullElse(livingEnvironment, "default");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = Objects.requireNonNullElse(livingEnvironment, "default");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Birds)) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(getLivingEnvironment(), birds.getLivingEnvironment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLivingEnvironment());
    }

    @Override
    public String toString() {
        return "Класс: Птицы " +
                ", среда обитания - " + livingEnvironment;
    }
}
