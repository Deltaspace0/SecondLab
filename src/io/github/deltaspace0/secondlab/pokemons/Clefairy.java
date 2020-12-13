package io.github.deltaspace0.secondlab.pokemons;

import ru.ifmo.se.pokemon.*;
import io.github.deltaspace0.secondlab.moves.BodySlam;

public class Clefairy extends Cleffa {
    public Clefairy(String name, int level) {
        super(name, level);
        this.setStats(70, 45, 48, 60, 65, 35);
        this.addMove(new BodySlam());
    }
}
