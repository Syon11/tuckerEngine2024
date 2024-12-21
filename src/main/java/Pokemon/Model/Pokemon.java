package Pokemon.Model;

import Pokemon.Enums.PkmnBaseEVs;
import Pokemon.Enums.PkmnBaseStats;
import Pokemon.Enums.PkmnSpecies;
import Pokemon.Enums.PkmnTypes;
import Pokemon.PkmnMoves;
import java.awt.image.BufferedImage;
import java.util.List;

public class Pokemon {
    private String name;
    private int level;
    private int currentHealth;
    private int experience;
    private int[] currentEVs = new int[6];
    private int[] ivs = new int[6];
    private PkmnSpecies species;
    private List<PkmnMoves> moves;
    private boolean fainted;

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
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void takeDamage(int damage) {
        if (this.currentHealth < damage){
            this.currentHealth = 0;
            fainted = true;
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
        fainted = false;
        this.currentHealth = getMaxHealth() / 2;
    }


    public int getMaxHealth() {
        return (((2 * species.getBaseStats().getHp() + ivs[0] + (currentEVs[0] != 0 ? currentEVs[0] / 4 : 0)) * level) / 100) + level + 10;
    }

    public int getAttack() {
        return (((2 * species.getBaseStats().getAttack() + ivs[1] + (currentEVs[1] != 0 ? currentEVs[1] / 4: 0)) * level) / 100) + 5;
    }

    public int getDefense() {
        return (((2 * species.getBaseStats().getAttack() + ivs[2] + (currentEVs[2] != 0 ? currentEVs[2] / 4 : 0)) * level) / 100) + 5;
    }

    public int getSpAtk() {
        return (((2 * species.getBaseStats().getSpecialAttack() + ivs[3] + (currentEVs[3] != 0 ? currentEVs[3] / 4 : 0)) * level) / 100) + 5;
    }

    public int getSpDef() {
        return (((2 * species.getBaseStats().getAttack() + ivs[4] + (currentEVs[4] != 0 ? currentEVs[4] / 4 : 0)) * level) / 100) + 5;
    }

    public int getSpeed() {
        return (((2 * species.getBaseStats().getSpeed() + ivs[5] + (currentEVs[5] != 0 ? currentEVs[5] / 4 : 0)) * level) / 100) + 5;
    }

}
