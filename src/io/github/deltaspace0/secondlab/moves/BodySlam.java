package io.github.deltaspace0.secondlab.moves;

import ru.ifmo.se.pokemon.*;

public class BodySlam extends PhysicalMove {
    public BodySlam() {
        super(Type.NORMAL, 85, 1.);
    }
    @Override
    protected String describe() {
        return "раздавливает соперника";
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setCondition(new Effect().chance(0.3).condition(Status.PARALYZE));
    }
}
