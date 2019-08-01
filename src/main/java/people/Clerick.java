package people;

import enums.HealingTool;

public class Clerick extends Person {

    private HealingTool healingTool;

    public Clerick(String name, int health, HealingTool healingTool) {
        super(name, health);
        this.healingTool = healingTool;
    }


}
