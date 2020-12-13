package io.github.deltaspace0.secondlab.pokemons;

import ru.ifmo.se.pokemon.*;
import io.github.deltaspace0.secondlab.moves.ChargeBeam;

public class Shiinotic extends Morelull {
    public Shiinotic(String name, int level) {
        super(name, level);
        this.setStats(60, 45, 80, 90, 100, 30);
        this.addMove(new ChargeBeam());
    }
}
