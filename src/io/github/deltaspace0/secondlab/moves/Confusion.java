package io.github.deltaspace0.secondlab.moves;

import ru.ifmo.se.pokemon.*;

public class Confusion extends SpecialMove {
    public Confusion() {
        super(Type.PSYCHIC, 50, 1.);
    }
    @Override
    protected String describe() {
        return "запутывает врага";
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) {
            Effect.confuse(p);
        }
    }
}
