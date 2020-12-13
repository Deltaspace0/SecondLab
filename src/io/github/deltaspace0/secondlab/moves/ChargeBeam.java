package io.github.deltaspace0.secondlab.moves;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam() {
        super(Type.ELECTRIC, 50, .9);
    }
    @Override
    protected String describe() {
        return "выстреливает пучок электричества";
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        if (Math.random() < 0.7) {
            p.setMod(Stat.SPECIAL_ATTACK, 1);
        }
    }
}
