package people;

import enums.Creature;
import enums.Spell;

public abstract class MagicPeople extends Person {

    protected Creature creature;
    protected Spell spell;

    public MagicPeople(String name, Creature creature, Spell spell) {
        super(name);
        this.creature = creature;
        this.spell = spell;
    }

    public Creature getCreature() {
        return creature;
    }

    public Spell getSpell() {
        return spell;
    }
}
