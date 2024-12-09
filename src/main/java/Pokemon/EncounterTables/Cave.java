package Pokemon.EncounterTables;

import Pokemon.Enums.PkmnSpecies;

import java.util.ArrayList;

public class Cave extends EncounterTable {

    public Cave(){
        encounters = new ArrayList<>();
        encounters.add(new Encounter(3, PkmnSpecies.ZUBAT));
        encounters.add(new Encounter(3, PkmnSpecies.GEODUDE));
        encounters.add(new Encounter(3, PkmnSpecies.MACHOP));
        encounters.add(new Encounter(25, PkmnSpecies.ZUBAT));
        encounters.add(new Encounter(30, PkmnSpecies.GEODUDE));
        encounters.add(new Encounter(15, PkmnSpecies.MACHOP));
        encounters.add(new Encounter(15, PkmnSpecies.ONIX));
        encounters.add(new Encounter(1, PkmnSpecies.MACHOP));
        encounters.add(new Encounter(10, PkmnSpecies.GEODUDE));
        encounters.add(new Encounter(10, PkmnSpecies.MACHOP));
        encounters.add(new Encounter(10, PkmnSpecies.ONIX));
    }
}
