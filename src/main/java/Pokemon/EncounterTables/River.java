package Pokemon.EncounterTables;

import Pokemon.Enums.PkmnSpecies;

import java.util.ArrayList;

public class River extends EncounterTable {

    public River(){
        encounters = new ArrayList<>();
        encounters.add(new Encounter(3, PkmnSpecies.BULBASAUR));
        encounters.add(new Encounter(3, PkmnSpecies.CHARMANDER));
        encounters.add(new Encounter(3, PkmnSpecies.SQUIRTLE));
        encounters.add(new Encounter(25, PkmnSpecies.PIDGEY));
        encounters.add(new Encounter(30, PkmnSpecies.RATTATA));
        encounters.add(new Encounter(15, PkmnSpecies.SPEAROW));
        encounters.add(new Encounter(15, PkmnSpecies.EKANS));
        encounters.add(new Encounter(1, PkmnSpecies.PIKACHU));
        encounters.add(new Encounter(10, PkmnSpecies.SANDSHREW));
        encounters.add(new Encounter(10, PkmnSpecies.NIDORANF));
        encounters.add(new Encounter(10, PkmnSpecies.NIDORANM));
    }
}
