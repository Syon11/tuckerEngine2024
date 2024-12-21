package Pokemon.EncounterTables;

import Pokemon.Enums.PkmnSpecies;

import java.util.ArrayList;

public class Marsh extends EncounterTable{

    public Marsh(){
        encounters = new ArrayList<>();
        encounters.add(new Encounter(5, PkmnSpecies.MUK));
        encounters.add(new Encounter(5, PkmnSpecies.KOFFING));
        encounters.add(new Encounter(10, PkmnSpecies.BELLSPROUT));
        encounters.add(new Encounter(10, PkmnSpecies.ODDISH));
        encounters.add(new Encounter(10, PkmnSpecies.VENONAT));
        encounters.add(new Encounter(5, PkmnSpecies.GASTLY));
        encounters.add(new Encounter(5, PkmnSpecies.CUBONE));
        encounters.add(new Encounter(5, PkmnSpecies.LICKITUNG));
        encounters.add(new Encounter(10, PkmnSpecies.TANGELA));



    }
}
