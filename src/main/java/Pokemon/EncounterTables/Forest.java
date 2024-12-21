package Pokemon.EncounterTables;

import Pokemon.Enums.PkmnSpecies;

import java.util.ArrayList;

public class Forest extends EncounterTable {

    public Forest(){
        encounters = new ArrayList<>();
        encounters.add(new Encounter(45, PkmnSpecies.CATERPIE));
        encounters.add(new Encounter(45, PkmnSpecies.METAPOD));
        encounters.add(new Encounter(40, PkmnSpecies.WEEDLE));
        encounters.add(new Encounter(40, PkmnSpecies.KAKUNA));
        encounters.add(new Encounter(24, PkmnSpecies.PIDGEY));
        encounters.add(new Encounter(1, PkmnSpecies.PIDGEOTTO));
        encounters.add(new Encounter(5, PkmnSpecies.PIKACHU));
    }
}
