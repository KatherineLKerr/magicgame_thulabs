package people;

import enums.Weapon;

public abstract class Warrior extends Person {

    private Weapon weapon;

    public Warrior(String name,  Weapon weapon) {
        super(name);
        this.weapon = weapon;
    }
}
