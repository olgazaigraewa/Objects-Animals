package Animals;

import java.util.Objects;

public class Herbivores extends Mammals{
    private String typeOfFood;

    @Override
    public void go() {
        System.out.println("пасется в стаде");

    }
    @Override
    public void sleep() {

    }

    @Override
    public void eat() {
        System.out.println("питается растениями");
    }



    public Herbivores(String name, int age, String livingEnvironment, String travelSpeed, String typeOfFood ) {
        super(name, age, livingEnvironment, travelSpeed);
        this.typeOfFood = Objects.requireNonNullElse(typeOfFood , "default");
    }


    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = Objects.requireNonNullElse(typeOfFood , "default");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Herbivores)) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(getTypeOfFood(), that.getTypeOfFood());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTypeOfFood());
    }

    @Override
    public String toString() {
        return "Царство: Животные, класс: Млекопитающие, отряд: Травоядные  " +
                ", кличка - " + getName() +
                ", возраст - " + getAge() + " года " +
                ", среда обитания - " + getLivingEnvironment() +
                ", скорость передвижения - " + getTravelSpeed() +
                ", тип питания - " + typeOfFood;
    }
}
