package io.github.deltaspace0.secondlab.moves;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80, 1.);
    }
    @Override
    protected String describe() {
        return "метает теневой шарик";
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.2) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
}
