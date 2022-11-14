package Animals;

import java.util.Objects;

public class NotFlying extends Birds{
    private String typeOfMovement;

    @Override
    public void go() {
        System.out.println("Быстро передвигаются по земле, т.к. в процессе эволюции утрачена способность к полёту.");

    }
    @Override
    public void sleep() {

    }

    @Override
    public void eat() {
        System.out.println("Питается растениями, насекомыми, водоплавающими, грызунами. ");
    }

    public NotFlying(String name, int age, String livingEnvironment,String typeOfMovement ) {
        super(name, age, livingEnvironment);
        this.typeOfMovement = Objects.requireNonNullElse(typeOfMovement , "default");
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        this.typeOfMovement = Objects.requireNonNullElse(typeOfMovement , "default");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NotFlying)) return false;
        if (!super.equals(o)) return false;
        NotFlying notFlying = (NotFlying) o;
        return Objects.equals(getTypeOfMovement(), notFlying.getTypeOfMovement());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTypeOfMovement());
    }

    @Override
    public String toString() {
        return "Царство: Животные, класс: Птицы, отряд: Нелетающие  " +
                ", кличка - " + getName() +
                ", возраст - " + getAge() + " года " +
                ", среда обитания - " + getLivingEnvironment() +
                ", тип передвижения - " + typeOfMovement;

    }
}
