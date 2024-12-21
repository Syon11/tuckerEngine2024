package Pokemon.EncounterTables;

import Pokemon.Enums.PkmnSpecies;

import java.util.ArrayList;

public class Cave extends EncounterTable {

    public Cave(){
        encounters = new ArrayList<>();
        encounters.add(new Encounter(40, PkmnSpecies.ZUBAT));
        encounters.add(new Encounter(40, PkmnSpecies.GEODUDE));
        encounters.add(new Encounter(15, PkmnSpecies.PARAS));
        encounters.add(new Encounter(3, PkmnSpecies.CLEFAIRY));
        encounters.add(new Encounter(3, PkmnSpecies.ONIX));
        encounters.add(new Encounter(5, PkmnSpecies.MACHOP));
        encounters.add(new Encounter(1, PkmnSpecies.CHANSEY));
    }
}
