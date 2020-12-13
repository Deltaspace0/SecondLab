package io.github.deltaspace0.secondlab.pokemons;

import ru.ifmo.se.pokemon.*;
import io.github.deltaspace0.secondlab.moves.ShadowBall;
import io.github.deltaspace0.secondlab.moves.Swagger;

public class Cleffa extends Pokemon {
    public Cleffa(String name, int level) {
        super(name, level);
        this.addType(Type.FAIRY);
        this.setStats(50, 25, 28, 45, 55, 15);
        this.addMove(new ShadowBall());
        this.addMove(new Swagger());
    }
}
