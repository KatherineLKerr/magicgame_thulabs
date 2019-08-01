package people;

import enums.HealingTool;
import interfaces.IHealth;
import interfaces.IWeapons;

public class Clerick extends Person implements IHealth, IWeapons {

    private HealingTool healingTool;

    public Clerick(String name, HealingTool healingTool) {
        super(name);
        this.health = 10;
        this.healingTool = healingTool;
    }

    public HealingTool getHealingTool() {
        return healingTool;
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
        person.health += 5;
    }

    public void change(HealingTool newHealingTool) {
        this.healingTool = newHealingTool;
    }
}
