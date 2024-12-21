package Pokemon.EncounterTables;

import Pokemon.Enums.PkmnSpecies;

import java.util.ArrayList;
import java.util.Dictionary;

public class Grassland extends EncounterTable {

    public Grassland(){
        encounters = new ArrayList<>();
        encounters.add(new Encounter(3, PkmnSpecies.BULBASAUR));
        encounters.add(new Encounter(3, PkmnSpecies.CHARMANDER));
        encounters.add(new Encounter(3, PkmnSpecies.SQUIRTLE));
        encounters.add(new Encounter(25, PkmnSpecies.PIDGEY));
        encounters.add(new Encounter(30, PkmnSpecies.RATTATA));
        encounters.add(new Encounter(15, PkmnSpecies.SPEAROW));
        encounters.add(new Encounter(15, PkmnSpecies.EKANS));
        encounters.add(new Encounter(10, PkmnSpecies.SANDSHREW));
        encounters.add(new Encounter(10, PkmnSpecies.NIDORANF));
        encounters.add(new Encounter(10, PkmnSpecies.NIDORANM));
        encounters.add(new Encounter(10, PkmnSpecies.GROWLITHE));
        encounters.add(new Encounter(10, PkmnSpecies.MANKEY));
        encounters.add(new Encounter(10, PkmnSpecies.VULPIX));
        encounters.add(new Encounter(5, PkmnSpecies.MEOWTH));
        encounters.add(new Encounter(5, PkmnSpecies.ABRA));





    }


}
