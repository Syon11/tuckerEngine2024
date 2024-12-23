package Pokemon.Model;

import Pokemon.Enums.PkmnSoftStatus;
import Pokemon.Enums.PkmnSpecies;
import Pokemon.Enums.PkmnStatus;
import Pokemon.Enums.PkmnTypes;
import Pokemon.Enums.PkmnMoves;
import Pokemon.Moves.PkmnAction;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private String name;
    private int level;
    private int currentHealth;
    private int experience;

    private int[] currentEVs = new int[6];
    private int[] ivs = new int[6];
    private int[] stages = new int[7];
    private PkmnSpecies species;
    private List<PkmnAction> moves;
    private PkmnStatus status;
    private ArrayList<PkmnSoftStatus> softStatuses;

    public Pokemon(String name, PkmnSpecies species) {
        this.name = name;
        this.species = species;
        this.level = 1;
        this.experience = 0;
        for (int i = 0; i < 6; i++) {
            currentEVs[i] = 0;
        }
        for (int i = 0; i < 6; i++) {
            ivs[i] = (int) (Math.random() * 32);
        }
        moves = new ArrayList<>();
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setMovesForLevel() {
        species.getMovesForLevel(level).forEach(move -> moves.add(new PkmnAction(move)));
    }

    public void takeDamage(int damage) {
        if (this.currentHealth < damage){
            this.currentHealth = 0;
            status = PkmnStatus.FAINTED;
        }
    }

    public void healDamage(int damage) {
        if (this.currentHealth + damage > getMaxHealth()) {
            this.currentHealth = getMaxHealth();
        } else {
            this.currentHealth += damage;
        }
    }

    public void revive() {
        if (status == PkmnStatus.FAINTED) {
            status = PkmnStatus.NORMAL;
            this.currentHealth = getMaxHealth() / 2;
        }
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getMaxHealth() {
        return (((2 * species.getBaseStats().getHp() + ivs[0] + (currentEVs[0] != 0 ? currentEVs[0] / 4 : 0)) * level) / 100) + level + 10;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getAttack() {
        return ((((2 * species.getBaseStats().getAttack() + ivs[1] + (currentEVs[1] != 0 ? currentEVs[1] / 4: 0)) * level) / 100) + 5) * (stages[0] > 0 ? (2 + stages[0]) / 2 : 2 / (2 - stages[0]));
    }

    public int getDefense() {
        return ((((2 * species.getBaseStats().getAttack() + ivs[2] + (currentEVs[2] != 0 ? currentEVs[2] / 4 : 0)) * level) / 100) + 5) * (stages[1] > 0 ? (2 + stages[1]) / 2 : 2 / (2 - stages[1]));
    }

    public int getSpAtk() {
        return ((((2 * species.getBaseStats().getSpecialAttack() + ivs[3] + (currentEVs[3] != 0 ? currentEVs[3] / 4 : 0)) * level) / 100) + 5) * (stages[2] > 0 ? (2 + stages[2]) / 2 : 2 / (2 - stages[2]));
    }

    public int getSpDef() {
        return ((((2 * species.getBaseStats().getAttack() + ivs[4] + (currentEVs[4] != 0 ? currentEVs[4] / 4 : 0)) * level) / 100) + 5) * (stages[3] > 0 ? (2 + stages[3]) / 2 : 2 / (2 - stages[3]));
    }

    public int getSpeed() {
        return ((((2 * species.getBaseStats().getSpeed() + ivs[5] + (currentEVs[5] != 0 ? currentEVs[5] / 4 : 0)) * level) / 100) + 5) * (stages[4] > 0 ? (2 + stages[4]) / 2 : 2 / (2 - stages[4]));
    }

    public int getAccuracy() {
        return 100 * (stages[5] > 0 ? (3 + stages[5]) / 3 : 3 / (3 - stages[5]));
    }

    public int getEvasion() {
        return 100 * (stages[6] > 0 ? (3 + stages[6]) / 3 : 3 / (3 - stages[6]));
    }

    public List<PkmnTypes> getType() {
        return species.getBaseStats().getTypes();
    }

    public PkmnStatus getStatus() {
        return status;
    }

    public void setStatus(PkmnStatus status) {
        this.status = status;
    }

    public void addSoftStatus(PkmnSoftStatus status) {
        softStatuses.add(status);
    }

    public void removeSoftStatus(PkmnSoftStatus status) {
        softStatuses.remove(status);
    }

    public List<PkmnSoftStatus> getSoftStatuses() {
        return softStatuses;
    }

    public List<PkmnAction> getMoves() {
        return moves;
    }

    public void HandleStatus() {
        if (status == PkmnStatus.BURNED) {
            currentHealth -= getMaxHealth() / 16;
        }
        if (status == PkmnStatus.POISONED) {
            currentHealth -= getMaxHealth() / 8;
        }
    }

    public void handleSoftStatuses() {
        int removeAtkUp = 0;
        int removeAtkDown = 0;
        int removeDefUp = 0;
        int removeDefDown = 0;
        int removeSpAtkUp = 0;
        int removeSpAtkDown = 0;
        int removeSpDefUp = 0;
        int removeSpDefDown = 0;
        int removeSpeedUp = 0;
        int removeSpeedDown = 0;
        int removeAccUp = 0;
        int removeAccDown = 0;
        int removeEvasionUp = 0;
        int removeEvasionDown = 0;
        if (!softStatuses.contains(PkmnSoftStatus.STAT_CHANGE_PROTECTION)) {

            for (PkmnSoftStatus status : softStatuses) {
                switch (status) {
                    case UP_ATK:
                        removeAtkUp++;
                        stages[0]++;
                        break;
                    case LOWER_ATK:
                        removeAtkDown++;
                        stages[0]--;
                        break;
                    case UP_DEF:
                        removeDefUp++;
                        stages[1]++;
                        break;
                    case LOWER_DEF:
                        removeDefDown++;
                        stages[1]--;
                        break;
                    case UP_SPATK:
                        removeSpAtkUp++;
                        stages[2]++;
                        break;
                    case LOWER_SPATK:
                        removeSpAtkDown++;
                        stages[2]--;
                        break;
                    case UP_SPDEF:
                        removeSpDefUp++;
                        stages[3]++;
                        break;
                    case LOWER_SPDEF:
                        removeSpDefDown++;
                        stages[3]--;
                        break;
                    case UP_SPEED:
                        removeSpeedUp++;
                        stages[4]++;
                        break;
                    case LOWER_SPEED:
                        removeSpeedDown++;
                        stages[4]--;
                        break;
                    case UP_ACC:
                        removeAccUp++;
                        stages[5]++;
                        break;
                    case LOWER_ACC:
                        removeAccDown++;
                        stages[5]--;
                        break;
                    case UP_EVASION:
                        removeEvasionUp++;
                        stages[6]++;
                        break;
                    case LOWER_EVASION:
                        removeEvasionDown++;
                        stages[6]--;
                        break;
                    case CANCEL_STAT_CHANGE:
                        for (int i = 0; i < 6; i++) {
                            stages[i] = 0;
                        }
                        break;
                }
            }
            for (int i = 0; i < removeAtkUp; i++) {
                softStatuses.remove(PkmnSoftStatus.UP_ATK);
            }
            for (int i = 0; i < removeAtkDown; i++) {
                softStatuses.remove(PkmnSoftStatus.LOWER_ATK);
            }
            for (int i = 0; i < removeDefUp; i++) {
                softStatuses.remove(PkmnSoftStatus.UP_DEF);
            }
            for (int i = 0; i < removeDefDown; i++) {
                softStatuses.remove(PkmnSoftStatus.LOWER_DEF);
            }
            for (int i = 0; i < removeSpAtkUp; i++) {
                softStatuses.remove(PkmnSoftStatus.UP_SPATK);
            }
            for (int i = 0; i < removeSpAtkDown; i++) {
                softStatuses.remove(PkmnSoftStatus.LOWER_SPATK);
            }
            for (int i = 0; i < removeSpDefUp; i++) {
                softStatuses.remove(PkmnSoftStatus.UP_SPDEF);
            }
            for (int i = 0; i < removeSpDefDown; i++) {
                softStatuses.remove(PkmnSoftStatus.LOWER_SPDEF);
            }
            for (int i = 0; i < removeSpeedUp; i++) {
                softStatuses.remove(PkmnSoftStatus.UP_SPEED);
            }
            for (int i = 0; i < removeSpeedDown; i++) {
                softStatuses.remove(PkmnSoftStatus.LOWER_SPEED);
            }
            for (int i = 0; i < removeAccUp; i++) {
                softStatuses.remove(PkmnSoftStatus.UP_ACC);
            }
            for (int i = 0; i < removeAccDown; i++) {
                softStatuses.remove(PkmnSoftStatus.LOWER_ACC);
            }
            for (int i = 0; i < removeEvasionUp; i++) {
                softStatuses.remove(PkmnSoftStatus.UP_EVASION);
            }
            for (int i = 0; i < removeEvasionDown; i++) {
                softStatuses.remove(PkmnSoftStatus.LOWER_EVASION);
            }
        }
    }


}
