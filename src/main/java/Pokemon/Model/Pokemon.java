package Pokemon.Model;

import Pokemon.Enums.PkmnBaseEVs;
import Pokemon.Enums.PkmnBaseStats;
import Pokemon.Enums.PkmnTypes;

import java.awt.image.BufferedImage;

public class Pokemon {
    private BufferedImage front;
    private BufferedImage back;
    private String name;
    private int level;
    private int currentHealth;
    private int experience;
    private PkmnBaseStats baseStats;
    private int[] currentEVs = new int[6];
    private int[] ivs = new int[6];
    private PkmnBaseEVs evs;
    private PkmnTypes type1;
    private PkmnTypes type2;
    private boolean fainted;

    public Pokemon(BufferedImage front, BufferedImage back, String name, PkmnBaseStats baseStats, PkmnBaseEVs evs, PkmnTypes type) {
        this.front = front;
        this.back = back;
        this.name = name;
        this.baseStats = baseStats;
        this.evs = evs;
        this.level = 1;
        this.experience = 0;
        this.type1 = type;
        this.type2 = null;
        for (int i = 0; i < 6; i++) {
            currentEVs[i] = 0;
        }
        for (int i = 0; i < 6; i++) {
            ivs[i] = (int) (Math.random() * 32);
        }
    }

    public Pokemon(BufferedImage front, BufferedImage back, String name, PkmnBaseStats baseStats, PkmnBaseEVs evs, PkmnTypes type1, PkmnTypes type2) {
        this.front = front;
        this.back = back;
        this.name = name;
        this.baseStats = baseStats;
        this.evs = evs;
        this.level = 1;
        this.experience = 0;
        this.type1 = type1;
        this.type2 = type2;
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
        return (((2 * baseStats.getHp() + ivs[0] + (currentEVs[0] != 0 ? currentEVs[0] / 4 : 0)) * level) / 100) + level + 10;
    }

    public int getAttack() {
        return (((2 * baseStats.getAttack() + ivs[1] + (currentEVs[1] != 0 ? currentEVs[1] / 4: 0)) * level) / 100) + 5;
    }

    public int getDefense() {
        return (((2 * baseStats.getAttack() + ivs[2] + (currentEVs[2] != 0 ? currentEVs[2] / 4 : 0)) * level) / 100) + 5;
    }

    public int getSpAtk() {
        return (((2 * baseStats.getSpecialAttack() + ivs[3] + (currentEVs[3] != 0 ? currentEVs[3] / 4 : 0)) * level) / 100) + 5;
    }

    public int getSpDef() {
        return (((2 * baseStats.getAttack() + ivs[4] + (currentEVs[4] != 0 ? currentEVs[4] / 4 : 0)) * level) / 100) + 5;
    }

    public int getSpeed() {
        return (((2 * baseStats.getSpeed() + ivs[5] + (currentEVs[5] != 0 ? currentEVs[5] / 4 : 0)) * level) / 100) + 5;
    }

}
