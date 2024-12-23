package Pokemon.Enums;

import java.util.ArrayList;
import java.util.List;

public enum PkmnMoves {
    POUND ("Pound", 35, 40, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT),
    KARATE_CHOP ("Karate Chop",25, 50, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.FIGHTING, PkmnMoveTarget.OPPONENT, PkmnMoveCritProfile.HIGH),
    DOUBLE_SLAP ("Double Slap", 10, 15, 85, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, true, 2, 2),
    COMET_PUNCH ("Comet Punch", 15, 18, 85, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, true, 2, 5),
    MEGA_PUNCH ("Mega Punch", 20, 80, 85, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT),
    PAY_DAY ("Pay Day", 20, 40, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT),
    FIRE_PUNCH ("Fire Punch", 15, 75, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.FIRE, PkmnMoveTarget.OPPONENT, PkmnStatus.BURNED, 10),
    ICE_PUNCH ("Ice Punch", 15, 75, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.ICE, PkmnMoveTarget.OPPONENT, PkmnStatus.FROZEN, 10),
    THUNDER_PUNCH ("Thunder Punch", 15, 75, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.ELECTRIC, PkmnMoveTarget.OPPONENT),
    SCRATCH ("Scratch", 35, 40, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT),
    VICE_GRIP ("Vice Grip", 30, 55, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT),
    GUILLOTINE ("Guillotine",5, 0, 30, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, PkmnStatus.FAINTED, 100),
    RAZOR_WIND ("Razor Wind", 10, 80, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT),
    SWORDS_DANCE ("Swords Dance", 30, 0, 100, 0, PkmnMoveTypes.STAGE, PkmnTypes.NORMAL, PkmnMoveTarget.SELF, List.of(PkmnSoftStatus.UP_ATK, PkmnSoftStatus.UP_ATK)),
    CUT ("Cut", 30, 50, 95, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT),
    GUST ("Gust", 35, 40, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.FLYING, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.ANTI_FLY)),
    WING_ATTACK ("Wing Attack", 35, 60, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.FLYING, PkmnMoveTarget.OPPONENT),
    WHIRLWIND ("Whirlwind", 20, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT),
    FLY ("Fly", 15, 90, 95, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.FLYING, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.FLYING)),
    BIND ("Bind", 20, 15, 85, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.BIND)),
    SLAM ("Slam", 20, 80, 75, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT),
    VINE_WHIP ("Vine Whip",25, 45, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.GRASS, PkmnMoveTarget.OPPONENT),
    STOMP ("Stomp",20, 65, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.FLINCH), 30),
    DOUBLE_KICK ("Double Kick", 30, 30, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.FIGHTING, PkmnMoveTarget.OPPONENT, true, 2, 2),
    MEGA_KICK ("Mega Kick",5, 120, 75, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT),
    JUMP_KICK ("Jump Kick",25, 100, 95, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.FIGHTING, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.RISKY)),
    ROLLING_KICK ("Rolling Kick",15, 60, 85, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.FIGHTING, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.FLINCH), 30),
    SAND_ATTACK ("Sand Attack", 15, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.LOWER_ACC)),
    HEADBUTT ("Headbutt", 15, 70, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.FLINCH), 30),
    HORN_ATTACK ("Horn Attack", 25, 65, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT),
    FURY_ATTACK ("Fury Attack", 20, 15, 85, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, true, 2, 5),
    HORN_DRILL ("Horn Drill", 5, 0, 30, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, PkmnStatus.FAINTED, 100),
    TACKLE ("Tackle", 35, 40, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT),
    BODY_SLAM ("Body Slam", 15, 85, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, PkmnStatus.PARALYZED, 30),
    WRAP ("Wrap", 20, 15, 90, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.BIND)),
    TAKE_DOWN ("Take Down", 20, 90, 85, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.BOTH),
    THRASH ("Thrash", 20, 120, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.BOTH),
    DOUBLE_EDGE ("Double Edge", 15, 120, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.BOTH),
    TAIL_WHIP ("Tail Whip", 30, 0, 100, 0, PkmnMoveTypes.STAGE, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.LOWER_DEF)),
    POISON_STING ("Poison Sting", 35, 15, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.POISON, PkmnMoveTarget.OPPONENT, PkmnStatus.POISONED, 30),
    TWINEEDLE ("Twineedle", 20, 25, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.BUG, PkmnMoveTarget.OPPONENT, true, 2, 2),
    PIN_MISSILE ("Pin Missile", 20, 25, 95, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.BUG, PkmnMoveTarget.OPPONENT, true, 2, 5),
    LEER ("Leer", 30, 0, 100, 0, PkmnMoveTypes.STAGE, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.LOWER_DEF)),
    BITE ("Bite", 25, 60, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.DARK, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.FLINCH), 30),
    GROWL ("Growl", 40, 0, 100, 0, PkmnMoveTypes.STAGE, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.LOWER_ATK)),
    ROAR ("Roar", 20, 0, 100, 0, PkmnMoveTypes.STAGE, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT),
    SING ("Sing", 15, 0, 55, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, PkmnStatus.SLEEPING, 100),
    SUPERSONIC ("Supersonic", 20, 0, 55, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.CONFUSION)),
    SONIC_BOOM ("Sonic Boom", 20, 0, 20,90, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT),
    DISABLE ("Disable", 20, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.DISABLE)),
    ACID ("Acid", 30, 40, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.POISON, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.LOWER_DEF)),
    EMBER ("Ember", 25, 40, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.FIRE, PkmnMoveTarget.OPPONENT, PkmnStatus.BURNED, 10),
    FLAMETHROWER ("Flamethrower", 15, 90, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.FIRE, PkmnMoveTarget.OPPONENT, PkmnStatus.BURNED, 10),
    MIST ("Mist", 30, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.ICE, PkmnMoveTarget.SELF, List.of(PkmnSoftStatus.STAT_CHANGE_PROTECTION)),
    WATER_GUN ("Water Gun", 25, 40, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.WATER, PkmnMoveTarget.OPPONENT),
    HYDRO_PUMP ("Hydro Pump", 5, 110, 80, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.WATER, PkmnMoveTarget.OPPONENT),
    SURF ("Surf", 15, 90, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.WATER, PkmnMoveTarget.OPPONENT),
    ICE_BEAM ("Ice Beam", 10, 90, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.ICE, PkmnMoveTarget.OPPONENT, PkmnStatus.FROZEN, 10),
    BLIZZARD ("Blizzard", 5, 110, 70, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.ICE, PkmnMoveTarget.OPPONENT, PkmnStatus.FROZEN, 10),
    PSYBEAM ("Psybeam", 20, 65, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.PSYCHIC, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.CONFUSION), 10),
    BUBBLE_BEAM ("Bubble Beam", 20, 65, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.WATER, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.LOWER_SPEED), 10),
    AURORA_BEAM ("Aurora Beam", 20, 65, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.ICE, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.LOWER_ATK), 10),
    HYPER_BEAM ("Hyper Beam", 5, 150, 90, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.RECHARGING)),
    PECK ("Peck", 35, 35, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.FLYING, PkmnMoveTarget.OPPONENT),
    DRILL_PECK ("Drill Peck", 20, 80, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.FLYING, PkmnMoveTarget.OPPONENT),
    SUBMISSION ("Submission", 20, 80, 80, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.FIGHTING, PkmnMoveTarget.BOTH),
    LOW_KICK ("Low Kick", 20, 50, 90, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.FIGHTING, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.ANTI_HEAVY)),
    COUNTER ("Counter", 20, 0, 100, 999, PkmnMoveTypes.PHYSICAL, PkmnTypes.FIGHTING, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.COUNTER)),
    SEISMIC_TOSS ("Seismic Toss", 20, 0, -100, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.FIGHTING, PkmnMoveTarget.OPPONENT),
    STRENGTH ("Strength", 15, 80, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT),
    ABSORB ("Absorb", 25, 20, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.GRASS, PkmnMoveTarget.BOTH),
    MEGA_DRAIN ("Mega Drain", 10, 40, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.GRASS, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.LEECH_HEAL)),
    LEECH_SEED ("Leech Seed", 10, 0, 90, 0, PkmnMoveTypes.STATUS, PkmnTypes.GRASS, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.LEECH_SEED)),
    GROWTH ("Growth", 40, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.SELF, List.of(PkmnSoftStatus.UP_SPATK)),
    RAZOR_LEAF ("Razor Leaf", 25, 55, 95, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.GRASS, PkmnMoveTarget.OPPONENT, PkmnMoveCritProfile.HIGH),
    SOLAR_BEAM ("Solar Beam", 10, 120, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.GRASS, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.CHARGING)),
    POISON_POWDER ("Poison Powder", 35, 0, 75, 0, PkmnMoveTypes.STATUS, PkmnTypes.POISON, PkmnMoveTarget.OPPONENT, PkmnStatus.POISONED, 100),
    STUN_SPORE ("Stun Spore", 30, 0, 75, 0, PkmnMoveTypes.STATUS, PkmnTypes.GRASS, PkmnMoveTarget.OPPONENT, PkmnStatus.PARALYZED, 100),
    SLEEP_POWDER ("Sleep Powder", 15, 0, 75, 0, PkmnMoveTypes.STATUS, PkmnTypes.GRASS, PkmnMoveTarget.OPPONENT, PkmnStatus.SLEEPING, 100),
    PETAL_DANCE ("Petal Dance", 20, 120, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.GRASS, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.PETAL_DANCE)),
    STRING_SHOT ("String Shot", 40, 0, 95, 0, PkmnMoveTypes.STATUS, PkmnTypes.BUG, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.LOWER_SPEED)),
    DRAGON_RAGE ("Dragon Rage", 10, 40, 40, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.DRAGON, PkmnMoveTarget.OPPONENT),
    FIRE_SPIN ("Fire Spin", 15, 35, 85, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.FIRE, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.BIND)),
    THUNDERSHOCK ("Thundershock", 30, 40, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.ELECTRIC, PkmnMoveTarget.OPPONENT),
    THUNDERBOLT ("Thunderbolt", 15, 90, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.ELECTRIC, PkmnMoveTarget.OPPONENT),
    THUNDER_WAVE ("Thunder Wave", 20, 0, 90, 0, PkmnMoveTypes.STATUS, PkmnTypes.ELECTRIC, PkmnMoveTarget.OPPONENT),
    THUNDER ("Thunder", 10, 110, 70, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.ELECTRIC, PkmnMoveTarget.OPPONENT),
    ROCK_THROW ("Rock Throw", 15, 50, 90, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.ROCK, PkmnMoveTarget.OPPONENT),
    EARTHQUAKE ("Earthquake", 10, 100, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.GROUND, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.ANTI_DIG)),
    FISSURE ("Fissure", 5, 0, 30, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.GROUND, PkmnMoveTarget.OPPONENT, PkmnStatus.FAINTED, 100),
    DIG ("Dig", 10, 80, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.GROUND, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.DIGGING)),
    TOXIC ("Toxic", 10, 0, 85, 0, PkmnMoveTypes.STATUS, PkmnTypes.POISON, PkmnMoveTarget.OPPONENT),
    CONFUSION ("Confusion", 25, 50, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.PSYCHIC, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.CONFUSION), 10),
    PSYCHIC ("Psychic", 10, 90, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.PSYCHIC, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.LOWER_SPDEF), 10),
    HYPNOSIS ("Hypnosis", 20, 0, 60, 0, PkmnMoveTypes.STATUS, PkmnTypes.PSYCHIC, PkmnMoveTarget.OPPONENT, PkmnStatus.SLEEPING, 100),
    MEDITATE ("Meditate", 40, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.PSYCHIC, PkmnMoveTarget.SELF, List.of(PkmnSoftStatus.UP_ATK)),
    AGILITY ("Agility", 30, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.PSYCHIC, PkmnMoveTarget.SELF, List.of(PkmnSoftStatus.UP_SPEED, PkmnSoftStatus.UP_SPEED)),
    QUICK_ATTACK ("Quick Attack", 30, 40, 100, 1, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT),
    RAGE ("Rage", 20, 20, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.RAGE)),
    TELEPORT ("Teleport", 20, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.PSYCHIC, PkmnMoveTarget.SELF, List.of(PkmnSoftStatus.TELEPORT)),
    NIGHT_SHADE ("Night Shade", 15, 0, -100, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.GHOST, PkmnMoveTarget.OPPONENT),
    MIMIC ("Mimic", 10, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.SELF, List.of(PkmnSoftStatus.MIMIC)),
    SCREECH ("Screech", 40, 0, 85, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.LOWER_DEF, PkmnSoftStatus.LOWER_DEF)),
    DOUBLE_TEAM ("Double Team", 15, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.SELF, List.of(PkmnSoftStatus.UP_EVASION)),
    RECOVER ("Recover", 20, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.SELF),
    HARDEN ("Harden", 30, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.SELF, List.of(PkmnSoftStatus.UP_DEF)),
    MINIMIZE ("Minimize", 20, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.SELF, List.of(PkmnSoftStatus.UP_EVASION, PkmnSoftStatus.UP_EVASION)),
    SMOKESCREEN ("Smokescreen", 20, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.LOWER_ACC)),
    CONFUSE_RAY ("Confuse Ray", 10, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.GHOST, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.CONFUSION)),
    WITHDRAW ("Withdraw", 40, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.WATER, PkmnMoveTarget.SELF, List.of(PkmnSoftStatus.UP_DEF)),
    DEFENSE_CURL ("Defense Curl", 40, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.SELF, List.of(PkmnSoftStatus.UP_DEF)),
    BARRIER ("Barrier", 30, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.PSYCHIC, PkmnMoveTarget.SELF, List.of(PkmnSoftStatus.UP_DEF, PkmnSoftStatus.UP_DEF)),
    LIGHT_SCREEN ("Light Screen", 30, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.PSYCHIC, PkmnMoveTarget.SELF, List.of(PkmnSoftStatus.LIGHT_SCREEN)),
    HAZE ("Haze", 30, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.ICE, PkmnMoveTarget.SELF, List.of(PkmnSoftStatus.CANCEL_STAT_CHANGE)),
    REFLECT ("Reflect", 20, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.PSYCHIC, PkmnMoveTarget.SELF, List.of(PkmnSoftStatus.PHYSICAL_SCREEN)),
    FOCUS_ENERGY ("Focus Energy", 30, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.SELF, List.of(PkmnSoftStatus.FOCUS_ENERGY)),
    BIDE ("Bide", 10, 0, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.BIDE)),
    METRONOME ("Metronome", 10, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.METRONOME)),
    MIRROR_MOVE ("Mirror Move", 20, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.FLYING, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.MIRROR_MOVE)),
    SELF_DESTRUCT ("Self Destruct", 5, 200, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, true),
    EGG_BOMB ("Egg Bomb", 10, 100, 75, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT),
    LICK ("Lick", 30, 20, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.GHOST, PkmnMoveTarget.OPPONENT, PkmnStatus.PARALYZED, 30),
    SMOG ("Smog", 20, 20, 70, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.POISON, PkmnMoveTarget.OPPONENT, PkmnStatus.POISONED, 40),
    SLUDGE ("Sludge", 20, 65, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.POISON, PkmnMoveTarget.OPPONENT, PkmnStatus.POISONED, 30),
    BONE_CLUB ("Bone Club", 20, 65, 85, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.GROUND, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.FLINCH), 10),
    FIRE_BLAST ("Fire Blast", 5, 110, 85, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.FIRE, PkmnMoveTarget.OPPONENT, PkmnStatus.BURNED, 10),
    WATERFALL ("Waterfall", 15, 80, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.WATER, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.FLINCH), 20),
    CLAMP ("Clamp", 10, 35, 85, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.WATER, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.BIND)),
    SWIFT ("Swift", 20, 60, 200, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT),
    SKULL_BASH ("Skull Bash", 10, 100, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT),
    SPIKE_CANNON ("Spike Cannon", 15, 20, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, true, 2, 5),
    CONSTRICT ("Constrict", 35, 10, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.LOWER_SPEED), 10),
    AMNESIA ("Amnesia", 20, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.PSYCHIC, PkmnMoveTarget.SELF, List.of(PkmnSoftStatus.UP_SPDEF, PkmnSoftStatus.UP_SPDEF)),
    KINESIS ("Kinesis", 15, 0, 80, 0, PkmnMoveTypes.STATUS, PkmnTypes.PSYCHIC, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.LOWER_ACC)),
    SOFT_BOILED ("Soft Boiled", 10, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.SELF, List.of(PkmnSoftStatus.RECOVER)),
    HI_JUMP_KICK ("Hi Jump Kick", 10, 130, 90, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.FIGHTING, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.RISKY)),
    GLARE ("Glare", 30, 0, 75, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, PkmnStatus.PARALYZED, 100),
    DREAM_EATER ("Dream Eater", 15, 100, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.PSYCHIC, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.NIGHTMARE)),
    POISON_GAS ("Poison Gas", 40, 0, 55, 0, PkmnMoveTypes.STATUS, PkmnTypes.POISON, PkmnMoveTarget.OPPONENT, PkmnStatus.POISONED, 100),
    BARRAGE ("Barrage", 20, 15, 85, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, true, 2, 5),
    LEECH_LIFE ("Leech Life", 15, 20, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.BUG, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.LEECH_HEAL)),
    LOVELY_KISS ("Lovely Kiss", 10, 0, 75, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, PkmnStatus.SLEEPING, 100),
    SKY_ATTACK ("Sky Attack", 5, 140, 90, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.FLYING, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.CHARGING)),
    TRANSFORM ("Transform", 10, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT),
    BUBBLE ("Bubble", 30, 40, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.WATER, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.LOWER_SPEED), 10),
    DIZZY_PUNCH ("Dizzy Punch", 10, 70, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.CONFUSION), 20),
    SPORE ("Spore", 15, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.GRASS, PkmnMoveTarget.OPPONENT, PkmnStatus.SLEEPING, 100),
    FLASH ("Flash", 20, 0, 70, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.LOWER_ACC)),
    PSYWAVE ("Psywave", 15, 0, -200, 80, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.PSYCHIC, PkmnMoveTarget.OPPONENT),
    SPLASH ("Splash", 40, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT),
    ACID_ARMOR ("Acid Armor", 40, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.POISON, PkmnMoveTarget.SELF, List.of(PkmnSoftStatus.UP_DEF, PkmnSoftStatus.UP_DEF)),
    CRABHAMMER ("Crabhammer", 10, 90, 85, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.WATER, PkmnMoveTarget.OPPONENT, PkmnMoveCritProfile.HIGH),
    EXPLOSION ("Explosion", 5, 170, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, true),
    FURY_SWIPES ("Fury Swipes", 15, 18, 80, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, true, 2, 5),
    BONEMERANG ("Bonemerang", 10, 50, 90, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.GROUND, PkmnMoveTarget.OPPONENT, true, 2, 2),
    REST ("Rest", 10, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.PSYCHIC, PkmnMoveTarget.SELF),
    ROCK_SLIDE ("Rock Slide", 10, 75, 90, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.ROCK, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.FLINCH), 30),
    HYPER_FANG ("Hyper Fang", 15, 80, 90, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, List.of(PkmnSoftStatus.FLINCH), 10),
    SHARPEN ("Sharpen", 30, 0, 100, 0, PkmnMoveTypes.STAGE, PkmnTypes.NORMAL, PkmnMoveTarget.SELF, List.of(PkmnSoftStatus.UP_ATK)),
    CONVERSION ("Conversion", 30, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.SELF),
    TRI_ATTACK ("Tri Attack", 10, 80, 100, 0, PkmnMoveTypes.SPECIAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, PkmnStatus.RANDOM, 20),
    SUPER_FANG ("Super Fang", 10, 0, -300, 90, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT),
    SLASH ("Slash", 20, 70, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.OPPONENT, PkmnMoveCritProfile.HIGH),
    SUBSTITUTE ("Substitute", 10, 0, 100, 0, PkmnMoveTypes.STATUS, PkmnTypes.NORMAL, PkmnMoveTarget.SELF),
    STRUGGLE ("Struggle", 10, 50, 100, 0, PkmnMoveTypes.PHYSICAL, PkmnTypes.NORMAL, PkmnMoveTarget.BOTH);


    private String name;
    private final int pp;
    private final int power;
    private final int accuracy;
    private final int priority;
    private final int statusChance;
    private boolean isMultiHits;
    private final int minHits;
    private final int maxHits;
    private final int damageOverride;
    private boolean isSuicide;
    private PkmnMoveCritProfile critProfile;
    private PkmnMoveTypes moveType;
    private PkmnTypes type;
    private PkmnMoveTarget target;
    private PkmnStatus status;
    private ArrayList<PkmnSoftStatus> softStatuses;

    PkmnMoves(String name, int pp, int power, int accuracy, int priority, PkmnMoveTypes moveType, PkmnTypes type, PkmnMoveTarget target) {
        this.name = name;
        this.pp = pp;
        this.power = power;
        this.accuracy = accuracy;
        this.moveType = moveType;
        this.type = type;
        this.priority = priority;
        this.target = target;
        this.status = null;
        this.softStatuses = new ArrayList<>();
        this.statusChance = 0;
        this.isMultiHits = false;
        this.minHits = 0;
        this.maxHits = 0;
        this.critProfile = PkmnMoveCritProfile.NORMAL;
        this.damageOverride = -1;
        this.isSuicide = false;
    }

    PkmnMoves(String name, int pp, int power, int damageOverride, int accuracy, int priority, PkmnMoveTypes moveType, PkmnTypes type, PkmnMoveTarget target) {
        this.name = name;
        this.pp = pp;
        this.power = power;
        this.accuracy = accuracy;
        this.moveType = moveType;
        this.type = type;
        this.priority = priority;
        this.target = target;
        this.status = null;
        this.softStatuses = new ArrayList<>();
        this.statusChance = 0;
        this.isMultiHits = false;
        this.minHits = 0;
        this.maxHits = 0;
        this.critProfile = PkmnMoveCritProfile.NORMAL;
        this.damageOverride = -1;
        this.isSuicide = false;
    }

    PkmnMoves(String name, int pp, int power, int accuracy, int priority, PkmnMoveTypes moveType, PkmnTypes type, PkmnMoveTarget target, boolean isSuicide) {
        this.name = name;
        this.pp = pp;
        this.power = power;
        this.accuracy = accuracy;
        this.moveType = moveType;
        this.type = type;
        this.priority = priority;
        this.target = target;
        this.status = null;
        this.softStatuses = new ArrayList<>();
        this.statusChance = 0;
        this.isMultiHits = false;
        this.minHits = 0;
        this.maxHits = 0;
        this.critProfile = PkmnMoveCritProfile.NORMAL;
        this.damageOverride = -1;
        this.isSuicide = isSuicide;
    }

    PkmnMoves(String name, int pp, int power, int accuracy, int priority, PkmnMoveTypes moveType, PkmnTypes type, PkmnMoveTarget target, PkmnStatus status, int statusChance) {
        this.name = name;
        this.pp = pp;
        this.power = power;
        this.accuracy = accuracy;
        this.moveType = moveType;
        this.type = type;
        this.priority = priority;
        this.target = target;
        this.status = status;
        this.softStatuses = new ArrayList<>();
        this.statusChance = statusChance;
        this.isMultiHits = false;
        this.minHits = 0;
        this.maxHits = 0;
        this.critProfile = PkmnMoveCritProfile.NORMAL;
        this.damageOverride = -1;
        this.isSuicide = false;
    }

    PkmnMoves(String name, int pp, int power, int accuracy, int priority, PkmnMoveTypes moveType, PkmnTypes type, PkmnMoveTarget target, PkmnMoveCritProfile critProfile) {
        this.name = name;
        this.pp = pp;
        this.power = power;
        this.accuracy = accuracy;
        this.moveType = moveType;
        this.type = type;
        this.priority = priority;
        this.target = target;
        this.status = null;
        this.softStatuses = new ArrayList<>();
        this.statusChance = 10;
        this.isMultiHits = false;
        this.minHits = 0;
        this.maxHits = 0;
        this.critProfile = critProfile;
        this.damageOverride = -1;
        this.isSuicide = false;
    }

    PkmnMoves(String name, int pp, int power, int accuracy, int priority, PkmnMoveTypes moveType, PkmnTypes type, PkmnMoveTarget target, Boolean isMultiHit, int minHits, int maxHits) {
        this.name = name;
        this.pp = pp;
        this.power = power;
        this.accuracy = accuracy;
        this.moveType = moveType;
        this.type = type;
        this.priority = priority;
        this.target = target;
        this.status = null;
        this.softStatuses = new ArrayList<>();
        this.statusChance = 100;
        this.isMultiHits = isMultiHit;
        this.minHits = minHits;
        this.maxHits = maxHits;
        this.critProfile = PkmnMoveCritProfile.NORMAL;
        this.damageOverride = -1;
        this.isSuicide = false;
    }

    PkmnMoves(String name, int pp, int power, int accuracy, int priority, PkmnMoveTypes moveType, PkmnTypes type, PkmnMoveTarget target, List<PkmnSoftStatus> softStatuses) {
        this.name = name;
        this.pp = pp;
        this.power = power;
        this.accuracy = accuracy;
        this.moveType = moveType;
        this.type = type;
        this.priority = priority;
        this.target = target;
        this.status = null;
        this.softStatuses = new ArrayList<PkmnSoftStatus>(softStatuses);
        this.statusChance = 100;
        this.isMultiHits = false;
        this.minHits = 0;
        this.maxHits = 0;
        this.critProfile = PkmnMoveCritProfile.NORMAL;
        this.damageOverride = -1;
        this.isSuicide = false;
    }

    PkmnMoves(String name, int pp, int power, int accuracy, int priority, PkmnMoveTypes moveType, PkmnTypes type, PkmnMoveTarget target, List<PkmnSoftStatus> softStatuses, int statusChance) {
        this.name = name;
        this.pp = pp;
        this.power = power;
        this.accuracy = accuracy;
        this.moveType = moveType;
        this.type = type;
        this.priority = priority;
        this.target = target;
        this.status = null;
        this.softStatuses = new ArrayList<PkmnSoftStatus>(softStatuses);
        this.statusChance = statusChance;
        this.isMultiHits = false;
        this.minHits = 0;
        this.maxHits = 0;
        this.critProfile = PkmnMoveCritProfile.NORMAL;
        this.damageOverride = -1;
        this.isSuicide = false;
    }

    public String getName() {
        return this.name;
    }

    public int getMaxPP() {
        return this.pp;
    }

    public int getPower() {
        return this.power;
    }

    public int getAccuracy() {
        return this.accuracy;
    }

    public PkmnMoveTypes getMoveType() {
        return moveType;
    }

    public PkmnTypes getPkmnType() {
        return type;
    }

    public PkmnMoveTarget getTarget() {
        return target;
    }

    public PkmnStatus getStatus() {
        return status;
    }

    public ArrayList<PkmnSoftStatus> getSoftStatuses() {
        return softStatuses;
    }

    public int getStatusChance() {
        return statusChance;
    }

    public boolean isMultiHits() {
        return isMultiHits;
    }

    public int getMinHits() {
        return minHits;
    }

    public int getMaxHits() {
        return maxHits;
    }

    public int getPriority() {
        return priority;
    }

    public PkmnMoveCritProfile getCritProfile() {
        return critProfile;
    }

    public int getDamageOverride() {
        return damageOverride;
    }

    public boolean isSuicide() {
        return isSuicide;
    }
}
