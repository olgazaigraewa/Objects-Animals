package Animals;

import java.util.Objects;

public class Predators extends Mammals {
    private String typeOfFood;

    @Override
    public void go() {
        System.out.println("охотится на других животных");

    }

    @Override
    public void sleep() {
        System.out.println();

    }

    @Override
    public void eat() {
        System.out.println("преимущественно употребляют животную пищу");
    }

    public Predators(String name, int age, String livingEnvironment, String travelSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, travelSpeed);
        this.typeOfFood = Objects.requireNonNullElse(typeOfFood, "default");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = Objects.requireNonNullElse(typeOfFood, "default");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Predators)) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(getTypeOfFood(), predators.getTypeOfFood());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTypeOfFood());
    }
    @Override
    public String toString() {
        return "Царство: Животные, класс: Млекопитающие, отряд: Хищники  " +
                ", кличка - " + getName() +
                ", возраст - " + getAge() + " года " +
                ", среда обитания - " + getLivingEnvironment() +
                ", скорость передвижения - " + getTravelSpeed() +
                ", тип питания - " + typeOfFood;
    }
}

