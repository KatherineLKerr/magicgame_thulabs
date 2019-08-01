package people;

import enums.Weapon;
import interfaces.IHealth;
import interfaces.IWeapons;

public class Barbarian implements IHealth, IWeapons {

    private String name;
    private Weapon weapon;
    private int health;

    public Barbarian(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
        this.health = 20;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int displayHealth() {
        return this.health;
    }

    public void heal(int number) {
        this.health += number;
    }

    public void takeDamage(int number) {
        this.health -= number;
    }

    public void use(Person person) {
        person.health -= 5;
    }
}
