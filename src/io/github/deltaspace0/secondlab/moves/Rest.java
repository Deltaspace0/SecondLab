package io.github.deltaspace0.secondlab.moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected String describe() {
        return "спит";
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.restore();
        p.setCondition(new Effect().turns(2).condition(Status.SLEEP));
    }
}
