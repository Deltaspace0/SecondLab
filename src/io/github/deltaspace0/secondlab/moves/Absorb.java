package io.github.deltaspace0.secondlab.moves;

import ru.ifmo.se.pokemon.*;

public class Absorb extends SpecialMove {
    public Absorb() {
        super(Type.GRASS, 20, 1.);
    }
    @Override
    protected String describe() {
        return "похищает здоровье";
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, (int) Math.round(-damage/2));
    }
}
