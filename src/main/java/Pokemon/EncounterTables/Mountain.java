package Pokemon.EncounterTables;

import Pokemon.Enums.PkmnSpecies;
import java.util.ArrayList;

public class Mountain extends EncounterTable {

    public Mountain(){
        encounters = new ArrayList<>();
        encounters.add(new Encounter(30, PkmnSpecies.GEODUDE));
        encounters.add(new Encounter(20, PkmnSpecies.MACHOP));
        encounters.add(new Encounter(20, PkmnSpecies.PONYTA));
        encounters.add(new Encounter(10, PkmnSpecies.MAGMAR));
        encounters.add(new Encounter(15, PkmnSpecies.ONIX));
        encounters.add(new Encounter(1, PkmnSpecies.MOLTRES));
    }
}
