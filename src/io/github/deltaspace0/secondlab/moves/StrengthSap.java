package io.github.deltaspace0.secondlab.moves;

import ru.ifmo.se.pokemon.*;

public class StrengthSap extends StatusMove {
    private double oppAttack;
    public StrengthSap() {
        super(Type.GRASS, 0, 1.);
    }
    @Override
    protected String describe() {
        return "съедает вражью силу";
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        oppAttack = p.getStat(Stat.ATTACK);
        p.setMod(Stat.ATTACK, -1);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, (int) Math.round(-oppAttack));
    }
}
