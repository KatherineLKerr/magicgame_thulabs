public abstract class Person {

    private String name;
    private int health;

    public Person(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void heal(int number) {
        health += number;
    }

    public void takeDamage(int number){
        health -= number;
    }
}
