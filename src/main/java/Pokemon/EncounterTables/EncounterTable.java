package Pokemon.EncounterTables;

import java.util.ArrayList;

public abstract class EncounterTable {

    protected ArrayList<Encounter> encounters;

    public Encounter getEncounter() {
        int totalWeight = 0;
        for (Encounter encounter : encounters) {
            totalWeight += encounter.getWeight();
        }
        int random = (int) (Math.random() * totalWeight);
        for (Encounter encounter : encounters) {
            random -= encounter.getWeight();
            if (random <= 0) {
                return encounter;
            }
        }
        return null;
    }

}
