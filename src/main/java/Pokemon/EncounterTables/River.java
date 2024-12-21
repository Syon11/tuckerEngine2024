package Pokemon.EncounterTables;

import Pokemon.Enums.PkmnSpecies;

import java.util.ArrayList;

public class River extends EncounterTable {

    public River(){
        encounters = new ArrayList<>();
        encounters.add(new Encounter(20, PkmnSpecies.TENTACOOL));
        encounters.add(new Encounter(20, PkmnSpecies.KRABBY));
        encounters.add(new Encounter(20, PkmnSpecies.HORSEA));
        encounters.add(new Encounter(20, PkmnSpecies.STARMIE));
        encounters.add(new Encounter(10, PkmnSpecies.PSYDUCK));
        encounters.add(new Encounter(10, PkmnSpecies.SLOWPOKE));
        encounters.add(new Encounter(100, PkmnSpecies.MAGIKARP));
        encounters.add(new Encounter(10, PkmnSpecies.POLIWAG));
        encounters.add(new Encounter(10, PkmnSpecies.SEEL));
        encounters.add(new Encounter(10, PkmnSpecies.SHELLDER));
        encounters.add(new Encounter(1, PkmnSpecies.DRATINI));
    }
}
