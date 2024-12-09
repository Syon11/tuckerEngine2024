package Pokemon.EncounterTables;

import Pokemon.Enums.PkmnSpecies;

public class Encounter {
    private int weight;
    private PkmnSpecies species;

    public Encounter(int weight, PkmnSpecies species) {
        this.weight = weight;
        this.species = species;
    }

    public int getWeight() {
        return weight;
    }

    public PkmnSpecies getSpecies() {
        return species;
    }
}
