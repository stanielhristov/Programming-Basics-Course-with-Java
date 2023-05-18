package groomingSalon;

public class Pet {
    private String name;
    private int age;
    private String owner;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s %d - %s", this.name, this.age, this.owner);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Pet(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }
}
