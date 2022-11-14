package Animals;

import java.util.Objects;

public class Flying extends Birds{
    private String typeOfMovement;

    @Override
    public void go() {
        System.out.println("Летают ");

    }
    @Override
    public void sleep() {

    }

    @Override
    public void eat() {
        System.out.println("Питается растениями, насекомыми, водоплавающими, животными ");
    }

    public Flying(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        this.typeOfMovement = Objects.requireNonNullElse(typeOfMovement , "default");
    }

    public  String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        this.typeOfMovement = Objects.requireNonNullElse(typeOfMovement , "default");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flying)) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(getTypeOfMovement(), flying.getTypeOfMovement());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTypeOfMovement());
    }

    @Override
    public String toString() {
        return "Царство: Животные, класс: Птицы, отряд: Летающие  " +
                ", кличка - " + getName() +
                ", возраст - " + getAge() + " года " +
                ", среда обитания - " + getLivingEnvironment() +
                ", тип передвижения - " + typeOfMovement;

    }
}

