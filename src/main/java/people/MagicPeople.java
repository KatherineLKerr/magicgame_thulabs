package people;

import enums.Creature;
import enums.Spell;

public abstract class MagicPeople extends Person {

    private Creature creature;
    private Spell spell;

    public MagicPeople(String name, Creature creature, Spell spell) {
        super(name);
        this.creature = creature;
        this.spell = spell;
    }



}
