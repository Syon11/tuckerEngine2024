package Pokemon.Enums;

public enum PkmnTypes {
    NORMAL(1, 1, 1, 1, 1, 0.5f, 1, 0, 0.5f, 1, 1, 1, 1, 1, 1, 1, 1, 1),
    FIGHTING(1, 1, 0.5f, 0.5f, 1, 2, 0.5f, 0, 2, 1, 1, 1, 1, 0.5f, 1, 1, 2, 0.5f),
    FLYING(1, 2, 1, 1, 1, 0.5f, 2, 1, 0.5f, 1, 1, 2, 0.5f, 1, 1, 1, 1, 1),
    POISON(1, 1, 1, 0.5f, 0.5f, 2, 1, 1, 0, 1, 1, 2, 1, 1, 1, 1, 1, 0.5f),
    GROUND(1, 1, 0, 2, 1, 2, 0.5f, 1, 2, 2, 1, 0.5f, 2, 1, 1, 1, 1, 1),
    ROCK(0.5f, 0.5f, 2, 1, 2, 1, 2, 1, 0.5f, 2, 1, 1, 1, 1, 1, 1, 1, 1),
    BUG(1, 0.5f, 2, 1, 0.5f, 1, 1, 0.5f, 0.5f, 0.5f, 1, 2, 1, 2, 1, 1, 1, 0.5f),
    GHOST(0, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1),
    STEEL(0.5f, 1, 0.5f, 0, 2, 2, 0.5f, 1, 0.5f, 0.5f, 1, 1, 1, 1, 2, 0.5f, 1, 2),
    FIRE(1, 1, 1, 1, 1, 0.5f, 2, 1, 0.5f, 0.5f, 2, 0.5f, 1, 1, 2, 0.5f, 1, 1),
    WATER(1, 1, 1, 1, 2, 2, 1, 1, 0.5f, 2, 0.5f, 0.5f, 1, 1, 1, 0.5f, 1, 1),
    GRASS(1, 1, 0.5f, 0.5f, 2, 2, 0.5f, 1, 0.5f, 2, 0.5f, 0.5f, 1, 1, 1, 0.5f, 1, 1),
    ELECTRIC(1, 1, 2, 1, 0, 1, 1, 1, 0.5f, 1, 2, 0.5f, 0.5f, 1, 1, 0.5f, 1, 1),
    PSYCHIC(1, 2, 1, 2, 1, 1, 1, 1, 0.5f, 1, 1, 1, 1, 0.5f, 1, 1, 0, 1),
    ICE(1, 1, 2, 1, 2, 1, 1, 1, 0.5f, 0.5f, 1, 1, 1, 1, 0.5f, 2, 1, 1),
    DRAGON(1, 1, 1, 1, 1, 1, 1, 1, 0.5f, 1, 1, 1, 1, 1, 1, 2, 1, 0),
    DARK(1, 0.5f, 1, 1, 1, 1, 1, 0.5f, 1, 1, 1, 1, 1, 2, 1, 1, 0.5f, 2),
    FAIRY(1, 2, 1, 0.5f, 1, 1, 1, 1, 0.5f, 0.5f, 1, 1, 1, 1, 1, 2, 2, 1);

    private float normalEffect;
    private float fightingEffect;
    private float flyingEffect;
    private float poisonEffect;
    private float groundEffect;
    private float rockEffect;
    private float bugEffect;
    private float ghostEffect;
    private float steelEffect;
    private float fireEffect;
    private float waterEffect;
    private float grassEffect;
    private float electricEffect;
    private float psychicEffect;
    private float iceEffect;
    private float dragonEffect;
    private float darkEffect;
    private float fairyEffect;

    PkmnTypes(float normal, float fighting, float flying, float poison, float ground, float rock, float bug, float ghost, float steel, float fire, float water, float grass, float electric, float psychic, float ice, float dragon, float dark, float fairy) {
        this.normalEffect = normal;
        this.fightingEffect = fighting;
        this.flyingEffect = flying;
        this.poisonEffect = poison;
        this.groundEffect = ground;
        this.rockEffect = rock;
        this.bugEffect = bug;
        this.ghostEffect = ghost;
        this.steelEffect = steel;
        this.fireEffect = fire;
        this.waterEffect = water;
        this.grassEffect = grass;
        this.electricEffect = electric;
        this.psychicEffect = psychic;
        this.iceEffect = ice;
        this.dragonEffect = dragon;
        this.darkEffect = dark;
        this.fairyEffect = fairy;
    }

    public float getModifier(PkmnTypes defenderType) {
        return switch (defenderType) {
            case PkmnTypes.NORMAL -> normalEffect;
            case PkmnTypes.FIGHTING -> fightingEffect;
            case PkmnTypes.FLYING -> flyingEffect;
            case PkmnTypes.POISON -> poisonEffect;
            case PkmnTypes.GROUND -> groundEffect;
            case PkmnTypes.ROCK -> rockEffect;
            case PkmnTypes.BUG -> bugEffect;
            case PkmnTypes.GHOST -> ghostEffect;
            case PkmnTypes.STEEL -> steelEffect;
            case PkmnTypes.FIRE -> fireEffect;
            case PkmnTypes.WATER -> waterEffect;
            case PkmnTypes.GRASS -> grassEffect;
            case PkmnTypes.ELECTRIC -> electricEffect;
            case PkmnTypes.PSYCHIC -> psychicEffect;
            case PkmnTypes.ICE -> iceEffect;
            case PkmnTypes.DRAGON -> dragonEffect;
            case PkmnTypes.DARK -> darkEffect;
            case PkmnTypes.FAIRY -> fairyEffect;
        };
    }
}
