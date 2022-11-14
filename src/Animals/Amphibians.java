package Animals;

import java.util.Objects;

public class Amphibians extends Animals {
    private String livingEnvironment;

    @Override
    public void eat() {
        System.out.println("Питаются различными беспозвоночными — насекомыми, червями, ракообразными, моллюсками");

    }

    @Override
    public void sleep() {
        System.out.println("Как правило, спят днем и активны ночью");

    }

    @Override
    public void go() {
        System.out.println(" Взрослые особи являются охотниками");

    }

    public Amphibians(String name, int age, String livingEnvironment) {
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
        if (!(o instanceof Amphibians)) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(getLivingEnvironment(), that.getLivingEnvironment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLivingEnvironment());
    }

    @Override
    public String toString() {
        return "Царство: Животные, класс: Земноводные " +
                ", кличка - " + getName() +
                ", возраст - " + getAge() + " года " +
                ", среда обитания - " + getLivingEnvironment();

    }
}

