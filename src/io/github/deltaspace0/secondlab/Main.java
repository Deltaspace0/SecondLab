package io.github.deltaspace0.secondlab;

import ru.ifmo.se.pokemon.*;
import io.github.deltaspace0.secondlab.pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Pokemon[] allies = {
            new Jirachi("Jotaro", 42),
            new Morelull("Joseph", 42),
            new Clefairy("Polnareff", 42),
        };
        Pokemon[] foes = {
            new Shiinotic("DIO", 42),
            new Cleffa("Hol Horse", 42),
            new Clefable("Enrico", 42),
        };
        for (Pokemon ally : allies) {
            battle.addAlly(ally);
        }
        for (Pokemon foe : foes) {
            battle.addFoe(foe);
        }
        battle.go();
    }
}
