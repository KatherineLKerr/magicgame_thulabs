package people;

import enums.Weapon;

public abstract class Warrior extends Person {

    private Weapon weapon;


    public Warrior(String name, int health, Weapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }
}
