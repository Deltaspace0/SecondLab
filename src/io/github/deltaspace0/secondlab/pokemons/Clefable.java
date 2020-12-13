package io.github.deltaspace0.secondlab.pokemons;

import ru.ifmo.se.pokemon.*;
import io.github.deltaspace0.secondlab.moves.Rest;

public class Clefable extends Clefairy {
    public Clefable(String name, int level) {
        super(name, level);
        this.setStats(95, 70, 73, 95, 90, 60);
        this.addMove(new Rest());
    }
}
