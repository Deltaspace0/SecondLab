MAINCLASS := io.github.deltaspace0.secondlab.Main
CLASSES := io.github.deltaspace0.secondlab.Main \
	 io.github.deltaspace0.secondlab.pokemons.Jirachi \
	 io.github.deltaspace0.secondlab.pokemons.Morelull \
	 io.github.deltaspace0.secondlab.pokemons.Shiinotic \
	 io.github.deltaspace0.secondlab.pokemons.Cleffa \
	 io.github.deltaspace0.secondlab.pokemons.Clefairy \
	 io.github.deltaspace0.secondlab.pokemons.Clefable \
	 io.github.deltaspace0.secondlab.moves.DazzlingGleam \
	 io.github.deltaspace0.secondlab.moves.Confusion \
	 io.github.deltaspace0.secondlab.moves.Facade \
	 io.github.deltaspace0.secondlab.moves.EnergyBall \
	 io.github.deltaspace0.secondlab.moves.StrengthSap \
	 io.github.deltaspace0.secondlab.moves.Absorb \
	 io.github.deltaspace0.secondlab.moves.ChargeBeam \
	 io.github.deltaspace0.secondlab.moves.ShadowBall \
	 io.github.deltaspace0.secondlab.moves.Swagger \
	 io.github.deltaspace0.secondlab.moves.BodySlam \
	 io.github.deltaspace0.secondlab.moves.Rest
LIBS := lib/Pokemon.jar

SRCS := $(addprefix ./src/,$(addsuffix .java,$(subst .,/,$(CLASSES))))
JARF := secondlab

all:
	mkdir -p bin
	javac -sourcepath src/ -d bin/ -classpath $(LIBS) $(SRCS)
	echo "class-path: $(LIBS)" > manifest.mf
	jar cfem $(JARF).jar $(MAINCLASS) manifest.mf -C bin/ .
	rm manifest.mf
