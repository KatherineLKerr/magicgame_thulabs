package people;

import enums.Creature;
import enums.Spell;
import enums.Weapon;
import interfaces.IHealth;
import interfaces.IWeapons;

public class Wizard extends MagicPeople implements IHealth, IWeapons {

    private String name;
    private Creature creature;
    private int health;

    public Wizard(String name, Creature creature, Spell spell) {
        super(name, creature, spell);
        this.name = name;
        this.spell = spell;
        this.health = 90;
    }

    public String getName() {
        return name;
    }

    public Spell getSpell() {
        return spell;
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
        person.health -= 10;
    }
}
