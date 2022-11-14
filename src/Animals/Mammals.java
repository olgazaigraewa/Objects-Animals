package Animals;

import java.util.Objects;

public class Mammals extends Animals{

    private String livingEnvironment;
    private String travelSpeed;

    public Mammals(String name, int age, String livingEnvironment, String travelSpeed ) {
        super(name, age);
        this.livingEnvironment = Objects.requireNonNullElse(livingEnvironment, "default");
        this.travelSpeed = Objects.requireNonNullElse(travelSpeed, "default");
    }

    @Override
    public void eat() {
        System.out.println(" питается растениями и другими животными");

    }

    @Override
    public void sleep() {

    }

    @Override
    public void go() {
        System.out.println("гуляет в живой природе ");

    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = Objects.requireNonNullElse(livingEnvironment, "default");
    }

    public String getTravelSpeed() {
        return travelSpeed;
    }

    public void setTravelSpeed(String travelSpeed) {
        this.travelSpeed = Objects.requireNonNullElse(travelSpeed, "default");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammals)) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return getLivingEnvironment().equals(mammals.getLivingEnvironment()) && getTravelSpeed().equals(mammals.getTravelSpeed());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLivingEnvironment(), getTravelSpeed());
    }

    @Override
    public String toString() {
        return "Класс : Млекопитающие " +
                ", среда обитания - " + livingEnvironment +
                ", скорость передвижения - " + travelSpeed;
    }
}

