package people;

import enums.HealingTool;

public class Clerick extends Person {

    private HealingTool healingTool;

    public Clerick(String name, HealingTool healingTool) {
        super(name);
        this.healingTool = healingTool;
    }


}
