package Animals;

import java.util.Objects;

public abstract class Animals {

    private String name;
    private int age;

    public abstract void eat();
    public abstract void sleep();
    public abstract void go();

    public Animals(String name, int age) {
        this.name = Objects.requireNonNullElse(name, "default");
        this.age = Math.max(age, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Objects.requireNonNullElse(name, "default");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals)) return false;
        Animals animals = (Animals) o;
        return getAge() == animals.getAge() && Objects.equals(getName(), animals.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return "Животные: " +
                ", кличка - " + name +
                ", возраст - " + age;
    }


}
