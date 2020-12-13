package io.github.deltaspace0.secondlab.pokemons;

import ru.ifmo.se.pokemon.*;
import io.github.deltaspace0.secondlab.moves.DazzlingGleam;
import io.github.deltaspace0.secondlab.moves.Confusion;
import io.github.deltaspace0.secondlab.moves.Facade;
import io.github.deltaspace0.secondlab.moves.EnergyBall;

public class Jirachi extends Pokemon {
    public Jirachi(String name, int level) {
        super(name, level);
        this.addType(Type.STEEL);
        this.addType(Type.PSYCHIC);
        this.setStats(100, 100, 100, 100, 100, 100);
        this.addMove(new DazzlingGleam());
        this.addMove(new Confusion());
        this.addMove(new Facade());
        this.addMove(new EnergyBall());
    }
}
