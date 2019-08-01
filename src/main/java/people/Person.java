package people;

public abstract class Person {

    String name;
    int health;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
