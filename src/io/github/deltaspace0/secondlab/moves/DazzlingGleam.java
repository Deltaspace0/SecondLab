package io.github.deltaspace0.secondlab.moves;

import ru.ifmo.se.pokemon.*;

public class DazzlingGleam extends SpecialMove {
    public DazzlingGleam() {
        super(Type.FAIRY, 80, 1.);
    }
    @Override
    protected String describe() {
        return "делает ярчайшую вспышку";
    }
}
