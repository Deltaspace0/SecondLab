package io.github.deltaspace0.secondlab.moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    private Pokemon foe;
    public Facade() {
        super(Type.NORMAL, 70, 1.);
    }
    @Override
    protected String describe() {
        return "налетает на врага";
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        foe = def;
        foe.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        if (att.getCondition() == Status.BURN ||
                att.getCondition() == Status.PARALYZE ||
                att.getCondition() == Status.POISON) {
            foe.setMod(Stat.HP, (int) Math.round(damage));
        }
    }
}
