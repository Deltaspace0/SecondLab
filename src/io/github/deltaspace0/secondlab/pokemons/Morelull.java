package io.github.deltaspace0.secondlab.pokemons;

import ru.ifmo.se.pokemon.*;
import io.github.deltaspace0.secondlab.moves.StrengthSap;
import io.github.deltaspace0.secondlab.moves.Absorb;
import io.github.deltaspace0.secondlab.moves.EnergyBall;

public class Morelull extends Pokemon {
    public Morelull(String name, int level) {
        super(name, level);
        this.addType(Type.GRASS);
        this.addType(Type.FAIRY);
        this.setStats(40, 35, 55, 65, 75, 15);
        this.addMove(new StrengthSap());
        this.addMove(new Absorb());
        this.addMove(new EnergyBall());
    }
}
