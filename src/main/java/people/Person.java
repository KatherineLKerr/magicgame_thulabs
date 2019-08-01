package people;

public abstract class Person {

    String name;
    int health;

    public Person(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }


}
