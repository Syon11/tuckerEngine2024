package Pokemon.Enums;

import Engine.Canvas;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import static java.util.Map.entry;

public enum PkmnSpecies {
    BULBASAUR(PkmnBaseStats.BULBASAUR, PkmnBaseEVs.BULBASAUR, "0001", Map.of(
        1, List.of(PkmnMoves.TACKLE, PkmnMoves.GROWL),
        7, List.of(PkmnMoves.LEECH_SEED),
        13, List.of(PkmnMoves.VINE_WHIP),
        20, List.of(PkmnMoves.POISON_POWDER),
        27, List.of(PkmnMoves.RAZOR_LEAF),
        34, List.of(PkmnMoves.GROWTH),
        41, List.of(PkmnMoves.SLEEP_POWDER),
        48, List.of(PkmnMoves.SOLAR_BEAM)
    )),
    IVYSAUR(PkmnBaseStats.IVYSAUR, PkmnBaseEVs.IVYSAUR, "0002", Map.of(
        1, List.of(PkmnMoves.TACKLE, PkmnMoves.GROWL, PkmnMoves.LEECH_SEED),
        7, List.of(PkmnMoves.LEECH_SEED),
        13, List.of(PkmnMoves.VINE_WHIP),
        22, List.of(PkmnMoves.POISON_POWDER),
        30, List.of(PkmnMoves.RAZOR_LEAF),
        38, List.of(PkmnMoves.GROWTH),
        46, List.of(PkmnMoves.SLEEP_POWDER),
        54, List.of(PkmnMoves.SOLAR_BEAM)
    )),
    VENUSAUR(PkmnBaseStats.VENUSAUR, PkmnBaseEVs.VENUSAUR, "0003", Map.of(
        1, List.of(PkmnMoves.TACKLE, PkmnMoves.GROWL, PkmnMoves.LEECH_SEED, PkmnMoves.VINE_WHIP),
        7, List.of(PkmnMoves.LEECH_SEED),
        13, List.of(PkmnMoves.VINE_WHIP),
        22, List.of(PkmnMoves.POISON_POWDER),
        30, List.of(PkmnMoves.RAZOR_LEAF),
        43, List.of(PkmnMoves.GROWTH),
        55, List.of(PkmnMoves.SLEEP_POWDER),
        65, List.of(PkmnMoves.SOLAR_BEAM)
    )),
    CHARMANDER(PkmnBaseStats.CHARMANDER, PkmnBaseEVs.CHARMANDER, "0004" , Map.of(
        1, List.of(PkmnMoves.SCRATCH, PkmnMoves.GROWL),
        9, List.of(PkmnMoves.EMBER),
        15, List.of(PkmnMoves.LEER),
        22, List.of(PkmnMoves.RAGE),
        30, List.of(PkmnMoves.SLASH),
        38, List.of(PkmnMoves.FLAMETHROWER),
        46, List.of(PkmnMoves.FIRE_SPIN)
    )),
    CHARMELEON(PkmnBaseStats.CHARMELEON, PkmnBaseEVs.CHARMELEON, "0005", Map.of(
        1, List.of(PkmnMoves.SCRATCH, PkmnMoves.GROWL),
        9, List.of(PkmnMoves.EMBER),
        15, List.of(PkmnMoves.LEER),
        24, List.of(PkmnMoves.RAGE),
        33, List.of(PkmnMoves.SLASH),
        42, List.of(PkmnMoves.FLAMETHROWER),
        56, List.of(PkmnMoves.FIRE_SPIN)
    )),
    CHARIZARD(PkmnBaseStats.CHARIZARD, PkmnBaseEVs.CHARIZARD, "0006", Map.of(
        1, List.of(PkmnMoves.SCRATCH, PkmnMoves.GROWL, PkmnMoves.EMBER),
        9, List.of(PkmnMoves.EMBER),
        15, List.of(PkmnMoves.LEER),
        24, List.of(PkmnMoves.RAGE),
        36, List.of(PkmnMoves.SLASH),
        46, List.of(PkmnMoves.FLAMETHROWER),
        55, List.of(PkmnMoves.FIRE_SPIN)
    )),
    SQUIRTLE(PkmnBaseStats.SQUIRTLE, PkmnBaseEVs.SQUIRTLE, "0007", Map.of(
        1, List.of(PkmnMoves.TACKLE, PkmnMoves.TAIL_WHIP),
        8, List.of(PkmnMoves.BUBBLE),
        15, List.of(PkmnMoves.WATER_GUN),
        22, List.of(PkmnMoves.BITE),
        28, List.of(PkmnMoves.WITHDRAW),
        35, List.of(PkmnMoves.SKULL_BASH),
        42, List.of(PkmnMoves.HYDRO_PUMP)
    )),
    WARTORTLE(PkmnBaseStats.WARTORTLE, PkmnBaseEVs.WARTORTLE, "0008", Map.of(
        1, List.of(PkmnMoves.TACKLE, PkmnMoves.TAIL_WHIP),
        8, List.of(PkmnMoves.BUBBLE),
        15, List.of(PkmnMoves.WATER_GUN),
        24, List.of(PkmnMoves.BITE),
        31, List.of(PkmnMoves.WITHDRAW),
        39, List.of(PkmnMoves.SKULL_BASH),
        47, List.of(PkmnMoves.HYDRO_PUMP)
    )),
    BLASTOISE(PkmnBaseStats.BLASTOISE, PkmnBaseEVs.BLASTOISE, "0009", Map.of(
        1, List.of(PkmnMoves.TACKLE, PkmnMoves.TAIL_WHIP, PkmnMoves.BUBBLE),
        8, List.of(PkmnMoves.BUBBLE),
        15, List.of(PkmnMoves.WATER_GUN),
        24, List.of(PkmnMoves.BITE),
        31, List.of(PkmnMoves.WITHDRAW),
        42, List.of(PkmnMoves.SKULL_BASH),
        55, List.of(PkmnMoves.HYDRO_PUMP)
    )),
    CATERPIE(PkmnBaseStats.CATERPIE, PkmnBaseEVs.CATERPIE, "0010", Map.of(
        1, List.of(PkmnMoves.TACKLE),
        7, List.of(PkmnMoves.STRING_SHOT)
    )),
    METAPOD(PkmnBaseStats.METAPOD, PkmnBaseEVs.METAPOD, "0011", Map.of(
        1, List.of(PkmnMoves.HARDEN)
    )),
    BUTTERFREE(PkmnBaseStats.BUTTERFREE, PkmnBaseEVs.BUTTERFREE, "0012", Map.of(
        1, List.of(PkmnMoves.CONFUSION),
        10, List.of(PkmnMoves.POISON_POWDER),
        12, List.of(PkmnMoves.STUN_SPORE),
        14, List.of(PkmnMoves.SLEEP_POWDER),
        18, List.of(PkmnMoves.PSYBEAM),
        24, List.of(PkmnMoves.SUPERSONIC),
        28, List.of(PkmnMoves.WHIRLWIND),
        34, List.of(PkmnMoves.PSYCHIC)
    )),
    WEEDLE(PkmnBaseStats.WEEDLE, PkmnBaseEVs.WEEDLE, "0013", Map.of(
        1, List.of(PkmnMoves.POISON_STING),
        7, List.of(PkmnMoves.STRING_SHOT)
    )),
    KAKUNA(PkmnBaseStats.KAKUNA, PkmnBaseEVs.KAKUNA, "0014", Map.of(
        1, List.of(PkmnMoves.HARDEN)
    )),
    BEEDRILL(PkmnBaseStats.BEEDRILL, PkmnBaseEVs.BEEDRILL, "0015", Map.of(
        1, List.of(PkmnMoves.FURY_ATTACK),
        10, List.of(PkmnMoves.FOCUS_ENERGY),
        15, List.of(PkmnMoves.TWINEEDLE),
        20, List.of(PkmnMoves.RAGE),
        30, List.of(PkmnMoves.PIN_MISSILE),
        35, List.of(PkmnMoves.AGILITY)
    )),
    PIDGEY(PkmnBaseStats.PIDGEY, PkmnBaseEVs.PIDGEY, "0016", Map.of(
        1, List.of(PkmnMoves.TACKLE, PkmnMoves.SAND_ATTACK),
        5, List.of(PkmnMoves.GUST),
        12, List.of(PkmnMoves.QUICK_ATTACK),
        19, List.of(PkmnMoves.WHIRLWIND),
        28, List.of(PkmnMoves.WING_ATTACK),
        36, List.of(PkmnMoves.AGILITY),
        44, List.of(PkmnMoves.MIRROR_MOVE)
    )),
    PIDGEOTTO(PkmnBaseStats.PIDGEOTTO, PkmnBaseEVs.PIDGEOTTO, "0017", Map.of(
        1, List.of(PkmnMoves.TACKLE, PkmnMoves.SAND_ATTACK),
        5, List.of(PkmnMoves.GUST),
        12, List.of(PkmnMoves.QUICK_ATTACK),
        21, List.of(PkmnMoves.WHIRLWIND),
        31, List.of(PkmnMoves.WING_ATTACK),
        40, List.of(PkmnMoves.AGILITY),
        49, List.of(PkmnMoves.MIRROR_MOVE)
    )),
    PIDGEOT(PkmnBaseStats.PIDGEOT, PkmnBaseEVs.PIDGEOT, "0018", Map.of(
        1, List.of(PkmnMoves.TACKLE, PkmnMoves.SAND_ATTACK, PkmnMoves.GUST),
        5, List.of(PkmnMoves.GUST),
        12, List.of(PkmnMoves.QUICK_ATTACK),
        21, List.of(PkmnMoves.WHIRLWIND),
        31, List.of(PkmnMoves.WING_ATTACK),
        40, List.of(PkmnMoves.AGILITY),
        49, List.of(PkmnMoves.MIRROR_MOVE)
    )),
    RATTATA(PkmnBaseStats.RATTATA, PkmnBaseEVs.RATTATA, "0019", Map.of(
        1, List.of(PkmnMoves.TACKLE, PkmnMoves.TAIL_WHIP),
        7, List.of(PkmnMoves.QUICK_ATTACK),
        14, List.of(PkmnMoves.HYPER_FANG),
        23, List.of(PkmnMoves.FOCUS_ENERGY),
        34, List.of(PkmnMoves.SUPER_FANG),
        46, List.of(PkmnMoves.HYPER_BEAM)
    )),
    RATICATE(PkmnBaseStats.RATICATE, PkmnBaseEVs.RATICATE, "0020", Map.of(
        1, List.of(PkmnMoves.TACKLE, PkmnMoves.TAIL_WHIP, PkmnMoves.QUICK_ATTACK),
        7, List.of(PkmnMoves.QUICK_ATTACK),
        14, List.of(PkmnMoves.HYPER_FANG),
        27, List.of(PkmnMoves.FOCUS_ENERGY),
        41, List.of(PkmnMoves.SUPER_FANG),
        55, List.of(PkmnMoves.HYPER_BEAM)
    )),
    SPEAROW(PkmnBaseStats.SPEAROW, PkmnBaseEVs.SPEAROW, "0021", Map.of(
        1, List.of(PkmnMoves.PECK, PkmnMoves.GROWL),
        9, List.of(PkmnMoves.LEER),
        15, List.of(PkmnMoves.FURY_ATTACK),
        22, List.of(PkmnMoves.MIRROR_MOVE),
        29, List.of(PkmnMoves.DRILL_PECK),
        36, List.of(PkmnMoves.AGILITY)
    )),
    FEAROW(PkmnBaseStats.FEAROW, PkmnBaseEVs.FEAROW, "0022", Map.of(
        1, List.of(PkmnMoves.PECK, PkmnMoves.GROWL, PkmnMoves.LEER),
        9, List.of(PkmnMoves.LEER),
        15, List.of(PkmnMoves.FURY_ATTACK),
        25, List.of(PkmnMoves.MIRROR_MOVE),
        34, List.of(PkmnMoves.DRILL_PECK),
        43, List.of(PkmnMoves.AGILITY)
    )),
    EKANS(PkmnBaseStats.EKANS, PkmnBaseEVs.EKANS, "0023", Map.of(
        1, List.of(PkmnMoves.WRAP, PkmnMoves.LEER),
        10, List.of(PkmnMoves.POISON_STING),
        17, List.of(PkmnMoves.BITE),
        24, List.of(PkmnMoves.GLARE),
        31, List.of(PkmnMoves.SCREECH),
        38, List.of(PkmnMoves.ACID),
        45, List.of(PkmnMoves.HAZE)
    )),
    ARBOK(PkmnBaseStats.ARBOK, PkmnBaseEVs.ARBOK, "0024", Map.of(
        1, List.of(PkmnMoves.WRAP, PkmnMoves.LEER, PkmnMoves.POISON_STING),
        10, List.of(PkmnMoves.POISON_STING),
        17, List.of(PkmnMoves.BITE),
        27, List.of(PkmnMoves.GLARE),
        36, List.of(PkmnMoves.SCREECH),
        47, List.of(PkmnMoves.ACID),
        58, List.of(PkmnMoves.HAZE)
    )),
    PIKACHU(PkmnBaseStats.PIKACHU, PkmnBaseEVs.PIKACHU, "0025", Map.of(
        1, List.of(PkmnMoves.THUNDERSHOCK, PkmnMoves.GROWL),
        9, List.of(PkmnMoves.TAIL_WHIP),
        16, List.of(PkmnMoves.QUICK_ATTACK),
        26, List.of(PkmnMoves.THUNDER_WAVE),
        33, List.of(PkmnMoves.AGILITY),
        46, List.of(PkmnMoves.THUNDER)
    )),
    RAICHU(PkmnBaseStats.RAICHU, PkmnBaseEVs.RAICHU, "0026", Map.of(
        1, List.of(PkmnMoves.THUNDERSHOCK, PkmnMoves.GROWL, PkmnMoves.TAIL_WHIP),
        9, List.of(PkmnMoves.TAIL_WHIP),
        16, List.of(PkmnMoves.QUICK_ATTACK),
        26, List.of(PkmnMoves.THUNDER_WAVE),
        33, List.of(PkmnMoves.AGILITY),
        46, List.of(PkmnMoves.THUNDER)
    )),
    SANDSHREW(PkmnBaseStats.SANDSHREW, PkmnBaseEVs.SANDSHREW, "0027", Map.of(
        1, List.of(PkmnMoves.SCRATCH, PkmnMoves.DEFENSE_CURL),
        10, List.of(PkmnMoves.SAND_ATTACK),
        17, List.of(PkmnMoves.POISON_STING),
        24, List.of(PkmnMoves.SLASH),
        31, List.of(PkmnMoves.SWIFT),
        38, List.of(PkmnMoves.FURY_SWIPES)
    )),
    SANDSLASH(PkmnBaseStats.SANDSLASH, PkmnBaseEVs.SANDSLASH, "0028", Map.of(
        1, List.of(PkmnMoves.SCRATCH, PkmnMoves.DEFENSE_CURL, PkmnMoves.SAND_ATTACK),
        10, List.of(PkmnMoves.SAND_ATTACK),
        17, List.of(PkmnMoves.POISON_STING),
        27, List.of(PkmnMoves.SLASH),
        36, List.of(PkmnMoves.SWIFT),
        47, List.of(PkmnMoves.FURY_SWIPES)
    )),
    NIDORANF(PkmnBaseStats.NIDORANF, PkmnBaseEVs.NIDORANF, "0029", Map.of(
        1, List.of(PkmnMoves.GROWL, PkmnMoves.TACKLE),
        8, List.of(PkmnMoves.SCRATCH),
        12, List.of(PkmnMoves.POISON_STING),
        17, List.of(PkmnMoves.DOUBLE_KICK),
        23, List.of(PkmnMoves.FURY_SWIPES),
        30, List.of(PkmnMoves.BITE),
        38, List.of(PkmnMoves.TOXIC)
    )),
    NIDORINA(PkmnBaseStats.NIDORINA, PkmnBaseEVs.NIDORINA, "0030", Map.of(
        1, List.of(PkmnMoves.GROWL, PkmnMoves.TACKLE),
        8, List.of(PkmnMoves.SCRATCH),
        12, List.of(PkmnMoves.POISON_STING),
        19, List.of(PkmnMoves.DOUBLE_KICK),
        27, List.of(PkmnMoves.FURY_SWIPES),
        36, List.of(PkmnMoves.BITE),
        46, List.of(PkmnMoves.TOXIC)
    )),
    NIDOQUEEN(PkmnBaseStats.NIDOQUEEN, PkmnBaseEVs.NIDOQUEEN, "0031", Map.of(
        1, List.of(PkmnMoves.GROWL, PkmnMoves.TACKLE, PkmnMoves.SCRATCH, PkmnMoves.POISON_STING),
        12, List.of(PkmnMoves.POISON_STING),
        19, List.of(PkmnMoves.DOUBLE_KICK),
        27, List.of(PkmnMoves.FURY_SWIPES),
        36, List.of(PkmnMoves.BITE),
        46, List.of(PkmnMoves.TOXIC)
    )),
    NIDORANM(PkmnBaseStats.NIDORANM, PkmnBaseEVs.NIDORANM, "0032", Map.of(
        1, List.of(PkmnMoves.GROWL, PkmnMoves.TACKLE),
        8, List.of(PkmnMoves.HORN_ATTACK),
        12, List.of(PkmnMoves.POISON_STING),
        17, List.of(PkmnMoves.DOUBLE_KICK),
        23, List.of(PkmnMoves.FURY_SWIPES),
        30, List.of(PkmnMoves.FOCUS_ENERGY),
        38, List.of(PkmnMoves.HORN_DRILL)
    )),
    NIDORINO(PkmnBaseStats.NIDORINO, PkmnBaseEVs.NIDORINO, "0033", Map.of(
        1, List.of(PkmnMoves.GROWL, PkmnMoves.TACKLE),
        8, List.of(PkmnMoves.HORN_ATTACK),
        12, List.of(PkmnMoves.POISON_STING),
        19, List.of(PkmnMoves.DOUBLE_KICK),
        27, List.of(PkmnMoves.FURY_SWIPES),
        36, List.of(PkmnMoves.FOCUS_ENERGY),
        46, List.of(PkmnMoves.HORN_DRILL)
    )),
    NIDOKING(PkmnBaseStats.NIDOKING, PkmnBaseEVs.NIDOKING, "0034", Map.of(
        1, List.of(PkmnMoves.GROWL, PkmnMoves.TACKLE, PkmnMoves.HORN_ATTACK, PkmnMoves.POISON_STING),
        12, List.of(PkmnMoves.POISON_STING),
        19, List.of(PkmnMoves.DOUBLE_KICK),
        27, List.of(PkmnMoves.FURY_SWIPES),
        36, List.of(PkmnMoves.FOCUS_ENERGY),
        46, List.of(PkmnMoves.HORN_DRILL)
    )),
    CLEFAIRY(PkmnBaseStats.CLEFAIRY, PkmnBaseEVs.CLEFAIRY, "0035", Map.of(
        1, List.of(PkmnMoves.POUND),
        13, List.of(PkmnMoves.GROWL),
        18, List.of(PkmnMoves.SING),
        24, List.of(PkmnMoves.DOUBLE_SLAP),
        31, List.of(PkmnMoves.MINIMIZE),
        39, List.of(PkmnMoves.METRONOME),
        48, List.of(PkmnMoves.DEFENSE_CURL)
    )),
    CLEFABLE(PkmnBaseStats.CLEFABLE, PkmnBaseEVs.CLEFABLE, "0036", Map.of(
        1, List.of(PkmnMoves.POUND),
        13, List.of(PkmnMoves.GROWL),
        18, List.of(PkmnMoves.SING),
        24, List.of(PkmnMoves.DOUBLE_SLAP),
        31, List.of(PkmnMoves.MINIMIZE),
        42, List.of(PkmnMoves.METRONOME),
        54, List.of(PkmnMoves.DEFENSE_CURL)
    )),
    VULPIX(PkmnBaseStats.VULPIX, PkmnBaseEVs.VULPIX, "0037", Map.of(
        1, List.of(PkmnMoves.EMBER),
        16, List.of(PkmnMoves.QUICK_ATTACK),
        21, List.of(PkmnMoves.TAIL_WHIP),
        28, List.of(PkmnMoves.ROAR),
        35, List.of(PkmnMoves.CONFUSE_RAY),
        42, List.of(PkmnMoves.FLAMETHROWER),
        49, List.of(PkmnMoves.FIRE_SPIN)
    )),
    NINETALES(PkmnBaseStats.NINETALES, PkmnBaseEVs.NINETALES, "0038", Map.of(
        1, List.of(PkmnMoves.EMBER),
        16, List.of(PkmnMoves.QUICK_ATTACK),
        21, List.of(PkmnMoves.TAIL_WHIP),
        28, List.of(PkmnMoves.ROAR),
        35, List.of(PkmnMoves.CONFUSE_RAY),
        42, List.of(PkmnMoves.FLAMETHROWER),
        49, List.of(PkmnMoves.FIRE_SPIN)
    )),
    JIGGLYPUFF(PkmnBaseStats.JIGGLYPUFF, PkmnBaseEVs.JIGGLYPUFF, "0039", Map.of(
        1, List.of(PkmnMoves.SING),
        9, List.of(PkmnMoves.POUND),
        14, List.of(PkmnMoves.DISABLE),
        19, List.of(PkmnMoves.DEFENSE_CURL),
        24, List.of(PkmnMoves.DOUBLE_SLAP),
        34, List.of(PkmnMoves.REST),
        44, List.of(PkmnMoves.BODY_SLAM),
        54, List.of(PkmnMoves.DOUBLE_EDGE)
    )),
    WIGGLYTUFF(PkmnBaseStats.WIGGLYTUFF, PkmnBaseEVs.WIGGLYTUFF, "0040", Map.of(
        1, List.of(PkmnMoves.SING),
        9, List.of(PkmnMoves.POUND),
        14, List.of(PkmnMoves.DISABLE),
        19, List.of(PkmnMoves.DEFENSE_CURL),
        24, List.of(PkmnMoves.DOUBLE_SLAP),
        34, List.of(PkmnMoves.REST),
        44, List.of(PkmnMoves.BODY_SLAM),
        54, List.of(PkmnMoves.DOUBLE_EDGE)
    )),
    ZUBAT(PkmnBaseStats.ZUBAT, PkmnBaseEVs.ZUBAT, "0041", Map.of(
        1, List.of(PkmnMoves.LEECH_LIFE),
        10, List.of(PkmnMoves.SUPERSONIC),
        15, List.of(PkmnMoves.BITE),
        21, List.of(PkmnMoves.CONFUSE_RAY),
        28, List.of(PkmnMoves.WING_ATTACK),
        36, List.of(PkmnMoves.HAZE)
    )),
    GOLBAT(PkmnBaseStats.GOLBAT, PkmnBaseEVs.GOLBAT, "0042", Map.of(
        1, List.of(PkmnMoves.LEECH_LIFE),
        10, List.of(PkmnMoves.SUPERSONIC),
        15, List.of(PkmnMoves.BITE),
        21, List.of(PkmnMoves.CONFUSE_RAY),
        32, List.of(PkmnMoves.WING_ATTACK),
        43, List.of(PkmnMoves.HAZE)
    )),
    ODDISH(PkmnBaseStats.ODDISH, PkmnBaseEVs.ODDISH, "0043", Map.of(
        1, List.of(PkmnMoves.ABSORB),
        15, List.of(PkmnMoves.POISON_POWDER),
        17, List.of(PkmnMoves.STUN_SPORE),
        19, List.of(PkmnMoves.SLEEP_POWDER),
        24, List.of(PkmnMoves.ACID),
        33, List.of(PkmnMoves.PETAL_DANCE),
        46, List.of(PkmnMoves.SOLAR_BEAM)
    )),
    GLOOM(PkmnBaseStats.GLOOM, PkmnBaseEVs.GLOOM, "0044", Map.of(
        1, List.of(PkmnMoves.ABSORB),
        15, List.of(PkmnMoves.POISON_POWDER),
        17, List.of(PkmnMoves.STUN_SPORE),
        19, List.of(PkmnMoves.SLEEP_POWDER),
        28, List.of(PkmnMoves.ACID),
        38, List.of(PkmnMoves.PETAL_DANCE),
        50, List.of(PkmnMoves.SOLAR_BEAM)
    )),
    VILEPLUME(PkmnBaseStats.VILEPLUME, PkmnBaseEVs.VILEPLUME, "0045", Map.of(
        1, List.of(PkmnMoves.ABSORB),
        15, List.of(PkmnMoves.POISON_POWDER),
        17, List.of(PkmnMoves.STUN_SPORE),
        19, List.of(PkmnMoves.SLEEP_POWDER),
        28, List.of(PkmnMoves.ACID),
        38, List.of(PkmnMoves.PETAL_DANCE),
        50, List.of(PkmnMoves.SOLAR_BEAM)
    )),
    PARAS(PkmnBaseStats.PARAS, PkmnBaseEVs.PARAS, "0046", Map.of(
        1, List.of(PkmnMoves.SCRATCH, PkmnMoves.STUN_SPORE),
        13, List.of(PkmnMoves.POISON_POWDER),
        20, List.of(PkmnMoves.LEECH_LIFE),
        27, List.of(PkmnMoves.SPORE),
        34, List.of(PkmnMoves.SLASH),
        41, List.of(PkmnMoves.GROWTH)
    )),
    PARASECT(PkmnBaseStats.PARASECT, PkmnBaseEVs.PARASECT, "0047", Map.of(
        1, List.of(PkmnMoves.SCRATCH, PkmnMoves.STUN_SPORE),
        13, List.of(PkmnMoves.POISON_POWDER),
        20, List.of(PkmnMoves.LEECH_LIFE),
        27, List.of(PkmnMoves.SPORE),
        39, List.of(PkmnMoves.SLASH),
        51, List.of(PkmnMoves.GROWTH)
    )),
    VENONAT(PkmnBaseStats.VENONAT, PkmnBaseEVs.VENONAT, "0048", Map.of(
        1, List.of(PkmnMoves.TACKLE, PkmnMoves.DISABLE),
        12, List.of(PkmnMoves.SUPERSONIC),
        17, List.of(PkmnMoves.CONFUSION),
        24, List.of(PkmnMoves.POISON_POWDER),
        31, List.of(PkmnMoves.PSYBEAM),
        40, List.of(PkmnMoves.STUN_SPORE),
        49, List.of(PkmnMoves.PSYCHIC)
    )),
    VENOMOTH(PkmnBaseStats.VENOMOTH, PkmnBaseEVs.VENOMOTH, "0049", Map.of(
        1, List.of(PkmnMoves.TACKLE, PkmnMoves.DISABLE),
        12, List.of(PkmnMoves.SUPERSONIC),
        17, List.of(PkmnMoves.CONFUSION),
        24, List.of(PkmnMoves.POISON_POWDER),
        31, List.of(PkmnMoves.PSYBEAM),
        42, List.of(PkmnMoves.STUN_SPORE),
        54, List.of(PkmnMoves.PSYCHIC)
    )),
    DIGLETT(PkmnBaseStats.DIGLETT, PkmnBaseEVs.DIGLETT, "0050", Map.of(
        1, List.of(PkmnMoves.SCRATCH),
        15, List.of(PkmnMoves.GROWL),
        19, List.of(PkmnMoves.DIG),
        24, List.of(PkmnMoves.SAND_ATTACK),
        31, List.of(PkmnMoves.SLASH),
        40, List.of(PkmnMoves.EARTHQUAKE)
    )),
    DUGTRIO(PkmnBaseStats.DUGTRIO, PkmnBaseEVs.DUGTRIO, "0051", Map.of(
        1, List.of(PkmnMoves.SCRATCH),
        15, List.of(PkmnMoves.GROWL),
        19, List.of(PkmnMoves.DIG),
        24, List.of(PkmnMoves.SAND_ATTACK),
        31, List.of(PkmnMoves.SLASH),
        40, List.of(PkmnMoves.EARTHQUAKE)
    )),
    MEOWTH(PkmnBaseStats.MEOWTH, PkmnBaseEVs.MEOWTH, "0052", Map.of(
        1, List.of(PkmnMoves.SCRATCH, PkmnMoves.GROWL),
        12, List.of(PkmnMoves.BITE),
        17, List.of(PkmnMoves.PAY_DAY),
        24, List.of(PkmnMoves.SCREECH),
        33, List.of(PkmnMoves.FURY_SWIPES),
        44, List.of(PkmnMoves.SLASH)
    )),
    PERSIAN(PkmnBaseStats.PERSIAN, PkmnBaseEVs.PERSIAN, "0053", Map.of(
        1, List.of(PkmnMoves.SCRATCH, PkmnMoves.GROWL, PkmnMoves.BITE),
        12, List.of(PkmnMoves.BITE),
        17, List.of(PkmnMoves.PAY_DAY),
        24, List.of(PkmnMoves.SCREECH),
        37, List.of(PkmnMoves.FURY_SWIPES),
        52, List.of(PkmnMoves.SLASH)
    )),
    PSYDUCK(PkmnBaseStats.PSYDUCK, PkmnBaseEVs.PSYDUCK, "0054", Map.of(
        1, List.of(PkmnMoves.SCRATCH, PkmnMoves.TAIL_WHIP),
        15, List.of(PkmnMoves.DISABLE),
        22, List.of(PkmnMoves.CONFUSION),
        31, List.of(PkmnMoves.WATER_GUN),
        36, List.of(PkmnMoves.FURY_SWIPES),
        43, List.of(PkmnMoves.SCREECH),
        52, List.of(PkmnMoves.PSYBEAM)
    )),
    GOLDUCK(PkmnBaseStats.GOLDUCK, PkmnBaseEVs.GOLDUCK, "0055", Map.of(
        1, List.of(PkmnMoves.SCRATCH, PkmnMoves.TAIL_WHIP),
        15, List.of(PkmnMoves.DISABLE),
        22, List.of(PkmnMoves.CONFUSION),
        31, List.of(PkmnMoves.WATER_GUN),
        41, List.of(PkmnMoves.FURY_SWIPES),
        51, List.of(PkmnMoves.SCREECH),
        63, List.of(PkmnMoves.PSYBEAM)
    )),
    MANKEY(PkmnBaseStats.MANKEY, PkmnBaseEVs.MANKEY, "0056", Map.of(
        1, List.of(PkmnMoves.SCRATCH),
        9, List.of(PkmnMoves.LOW_KICK),
        15, List.of(PkmnMoves.KARATE_CHOP),
        21, List.of(PkmnMoves.FURY_SWIPES),
        27, List.of(PkmnMoves.FOCUS_ENERGY),
        33, List.of(PkmnMoves.SEISMIC_TOSS),
        39, List.of(PkmnMoves.THRASH)
    )),
    PRIMEAPE(PkmnBaseStats.PRIMEAPE, PkmnBaseEVs.PRIMEAPE, "0057", Map.of(
        1, List.of(PkmnMoves.SCRATCH),
        9, List.of(PkmnMoves.LOW_KICK),
        15, List.of(PkmnMoves.KARATE_CHOP),
        21, List.of(PkmnMoves.FURY_SWIPES),
        27, List.of(PkmnMoves.FOCUS_ENERGY),
        35, List.of(PkmnMoves.SEISMIC_TOSS),
        43, List.of(PkmnMoves.THRASH)
    )),
    GROWLITHE(PkmnBaseStats.GROWLITHE, PkmnBaseEVs.GROWLITHE, "0058", Map.of(
        1, List.of(PkmnMoves.BITE, PkmnMoves.ROAR),
        18, List.of(PkmnMoves.EMBER),
        23, List.of(PkmnMoves.LEER),
        30, List.of(PkmnMoves.TAKE_DOWN),
        39, List.of(PkmnMoves.AGILITY),
        50, List.of(PkmnMoves.FLAMETHROWER)
    )),
    ARCANINE(PkmnBaseStats.ARCANINE, PkmnBaseEVs.ARCANINE, "0059", Map.of(
        1, List.of(PkmnMoves.BITE, PkmnMoves.ROAR),
        18, List.of(PkmnMoves.EMBER),
        23, List.of(PkmnMoves.LEER),
        30, List.of(PkmnMoves.TAKE_DOWN),
        39, List.of(PkmnMoves.AGILITY),
        50, List.of(PkmnMoves.FLAMETHROWER)
    )),
    POLIWAG(PkmnBaseStats.POLIWAG, PkmnBaseEVs.POLIWAG, "0060", Map.of(
        1, List.of(PkmnMoves.BUBBLE),
        16, List.of(PkmnMoves.HYPNOSIS),
        19, List.of(PkmnMoves.WATER_GUN),
        25, List.of(PkmnMoves.DOUBLE_SLAP),
        31, List.of(PkmnMoves.BODY_SLAM),
        38, List.of(PkmnMoves.AMNESIA),
        45, List.of(PkmnMoves.HYDRO_PUMP)
    )),
    POLIWHIRL(PkmnBaseStats.POLIWHIRL, PkmnBaseEVs.POLIWHIRL, "0061", Map.of(
        1, List.of(PkmnMoves.BUBBLE),
        16, List.of(PkmnMoves.HYPNOSIS),
        19, List.of(PkmnMoves.WATER_GUN),
        28, List.of(PkmnMoves.DOUBLE_SLAP),
        37, List.of(PkmnMoves.BODY_SLAM),
        47, List.of(PkmnMoves.AMNESIA),
        58, List.of(PkmnMoves.HYDRO_PUMP)
    )),
    POLIWRATH(PkmnBaseStats.POLIWRATH, PkmnBaseEVs.POLIWRATH, "0062", Map.of(
        1, List.of(PkmnMoves.BUBBLE, PkmnMoves.HYPNOSIS),
        16, List.of(PkmnMoves.HYPNOSIS),
        19, List.of(PkmnMoves.WATER_GUN),
        28, List.of(PkmnMoves.DOUBLE_SLAP),
        37, List.of(PkmnMoves.BODY_SLAM),
        47, List.of(PkmnMoves.AMNESIA),
        58, List.of(PkmnMoves.HYDRO_PUMP)
    )),
    ABRA(PkmnBaseStats.ABRA, PkmnBaseEVs.ABRA, "0063", Map.of(
        1, List.of(PkmnMoves.TELEPORT)
    )),
    KADABRA(PkmnBaseStats.KADABRA, PkmnBaseEVs.KADABRA, "0064", Map.of(
        1, List.of(PkmnMoves.TELEPORT),
        16, List.of(PkmnMoves.KINESIS),
        20, List.of(PkmnMoves.CONFUSION),
        27, List.of(PkmnMoves.PSYBEAM),
        31, List.of(PkmnMoves.REFLECT),
        38, List.of(PkmnMoves.PSYCHIC),
        42, List.of(PkmnMoves.RECOVER)
    )),
    ALAKAZAM(PkmnBaseStats.ALAKAZAM, PkmnBaseEVs.ALAKAZAM, "0065", Map.of(
        1, List.of(PkmnMoves.TELEPORT),
        16, List.of(PkmnMoves.KINESIS),
        20, List.of(PkmnMoves.CONFUSION),
        27, List.of(PkmnMoves.PSYBEAM),
        31, List.of(PkmnMoves.REFLECT),
        38, List.of(PkmnMoves.PSYCHIC),
        42, List.of(PkmnMoves.RECOVER)
    )),
    MACHOP(PkmnBaseStats.MACHOP, PkmnBaseEVs.MACHOP, "0066", Map.of(
        1, List.of(PkmnMoves.LOW_KICK),
        20, List.of(PkmnMoves.LEER),
        25, List.of(PkmnMoves.FOCUS_ENERGY),
        32, List.of(PkmnMoves.KARATE_CHOP),
        39, List.of(PkmnMoves.SEISMIC_TOSS),
        46, List.of(PkmnMoves.SUBMISSION)
    )),
    MACHOKE(PkmnBaseStats.MACHOKE, PkmnBaseEVs.MACHOKE, "0067", Map.of(
        1, List.of(PkmnMoves.LOW_KICK),
        20, List.of(PkmnMoves.LEER),
        25, List.of(PkmnMoves.FOCUS_ENERGY),
        32, List.of(PkmnMoves.KARATE_CHOP),
        41, List.of(PkmnMoves.SEISMIC_TOSS),
        50, List.of(PkmnMoves.SUBMISSION)
    )),
    MACHAMP(PkmnBaseStats.MACHAMP, PkmnBaseEVs.MACHAMP, "0068", Map.of(
        1, List.of(PkmnMoves.LOW_KICK),
        20, List.of(PkmnMoves.LEER),
        25, List.of(PkmnMoves.FOCUS_ENERGY),
        32, List.of(PkmnMoves.KARATE_CHOP),
        41, List.of(PkmnMoves.SEISMIC_TOSS),
        50, List.of(PkmnMoves.SUBMISSION)
    )),
    BELLSPROUT(PkmnBaseStats.BELLSPROUT, PkmnBaseEVs.BELLSPROUT, "0069", Map.of(
        1, List.of(PkmnMoves.VINE_WHIP),
        13, List.of(PkmnMoves.GROWTH),
        15, List.of(PkmnMoves.WRAP),
        18, List.of(PkmnMoves.POISON_POWDER),
        23, List.of(PkmnMoves.SLEEP_POWDER),
        30, List.of(PkmnMoves.STUN_SPORE),
        38, List.of(PkmnMoves.ACID)
    )),
    WEEPINBELL(PkmnBaseStats.WEEPINBELL, PkmnBaseEVs.WEEPINBELL, "0070", Map.of(
        1, List.of(PkmnMoves.VINE_WHIP),
        13, List.of(PkmnMoves.GROWTH),
        15, List.of(PkmnMoves.WRAP),
        18, List.of(PkmnMoves.POISON_POWDER),
        23, List.of(PkmnMoves.SLEEP_POWDER),
        30, List.of(PkmnMoves.STUN_SPORE),
        38, List.of(PkmnMoves.ACID)
    )),
    VICTREEBEL(PkmnBaseStats.VICTREEBEL, PkmnBaseEVs.VICTREEBEL, "0071", Map.of(
        1, List.of(PkmnMoves.VINE_WHIP),
        13, List.of(PkmnMoves.GROWTH),
        15, List.of(PkmnMoves.WRAP),
        18, List.of(PkmnMoves.POISON_POWDER),
        23, List.of(PkmnMoves.SLEEP_POWDER),
        30, List.of(PkmnMoves.STUN_SPORE),
        38, List.of(PkmnMoves.ACID)
    )),
    TENTACOOL(PkmnBaseStats.TENTACOOL, PkmnBaseEVs.TENTACOOL, "0072", Map.of(
        1, List.of(PkmnMoves.ACID),
        7, List.of(PkmnMoves.SUPERSONIC),
        13, List.of(PkmnMoves.WRAP),
        18, List.of(PkmnMoves.POISON_STING),
        22, List.of(PkmnMoves.WATER_GUN),
        27, List.of(PkmnMoves.CONSTRICT),
        33, List.of(PkmnMoves.BARRIER),
        40, List.of(PkmnMoves.SCREECH),
        48, List.of(PkmnMoves.HYDRO_PUMP)
    )),
    TENTACRUEL(PkmnBaseStats.TENTACRUEL, PkmnBaseEVs.TENTACRUEL, "0073", Map.of(
        1, List.of(PkmnMoves.ACID),
        7, List.of(PkmnMoves.SUPERSONIC),
        13, List.of(PkmnMoves.WRAP),
        18, List.of(PkmnMoves.POISON_STING),
        22, List.of(PkmnMoves.WATER_GUN),
        27, List.of(PkmnMoves.CONSTRICT),
        33, List.of(PkmnMoves.BARRIER),
        40, List.of(PkmnMoves.SCREECH),
        48, List.of(PkmnMoves.HYDRO_PUMP)
    )),
    GEODUDE(PkmnBaseStats.GEODUDE, PkmnBaseEVs.GEODUDE, "0074", Map.of(
        1, List.of(PkmnMoves.TACKLE),
        11, List.of(PkmnMoves.DEFENSE_CURL),
        16, List.of(PkmnMoves.ROCK_THROW),
        21, List.of(PkmnMoves.SELF_DESTRUCT),
        26, List.of(PkmnMoves.HARDEN),
        31, List.of(PkmnMoves.ROCK_SLIDE),
        36, List.of(PkmnMoves.EXPLOSION)
    )),
    GRAVELER(PkmnBaseStats.GRAVELER, PkmnBaseEVs.GRAVELER, "0075", Map.of(
        1, List.of(PkmnMoves.TACKLE),
        11, List.of(PkmnMoves.DEFENSE_CURL),
        16, List.of(PkmnMoves.ROCK_THROW),
        21, List.of(PkmnMoves.SELF_DESTRUCT),
        29, List.of(PkmnMoves.HARDEN),
        36, List.of(PkmnMoves.ROCK_SLIDE),
        43, List.of(PkmnMoves.EXPLOSION)
    )),
    GOLEM(PkmnBaseStats.GOLEM, PkmnBaseEVs.GOLEM, "0076", Map.of(
        1, List.of(PkmnMoves.TACKLE),
        11, List.of(PkmnMoves.DEFENSE_CURL),
        16, List.of(PkmnMoves.ROCK_THROW),
        21, List.of(PkmnMoves.SELF_DESTRUCT),
        29, List.of(PkmnMoves.HARDEN),
        36, List.of(PkmnMoves.ROCK_SLIDE),
        43, List.of(PkmnMoves.EXPLOSION)
    )),
    PONYTA(PkmnBaseStats.PONYTA, PkmnBaseEVs.PONYTA, "0077", Map.of(
        1, List.of(PkmnMoves.TACKLE),
        30, List.of(PkmnMoves.EMBER),
        32, List.of(PkmnMoves.TAIL_WHIP),
        35, List.of(PkmnMoves.GROWL),
        39, List.of(PkmnMoves.STOMP),
        43, List.of(PkmnMoves.AGILITY),
        48, List.of(PkmnMoves.FIRE_SPIN)
    )),
    RAPIDASH(PkmnBaseStats.RAPIDASH, PkmnBaseEVs.RAPIDASH, "0078", Map.of(
        1, List.of(PkmnMoves.TACKLE),
        30, List.of(PkmnMoves.EMBER),
        32, List.of(PkmnMoves.TAIL_WHIP),
        35, List.of(PkmnMoves.GROWL),
        39, List.of(PkmnMoves.STOMP),
        43, List.of(PkmnMoves.AGILITY),
        48, List.of(PkmnMoves.FIRE_SPIN)
    )),
    SLOWPOKE(PkmnBaseStats.SLOWPOKE, PkmnBaseEVs.SLOWPOKE, "0079", Map.of(
        1, List.of(PkmnMoves.CONFUSION),
        18, List.of(PkmnMoves.DISABLE),
        22, List.of(PkmnMoves.HEADBUTT),
        27, List.of(PkmnMoves.GROWL),
        33, List.of(PkmnMoves.WATER_GUN),
        40, List.of(PkmnMoves.AMNESIA),
        48, List.of(PkmnMoves.PSYCHIC)
    )),
    SLOWBRO(PkmnBaseStats.SLOWBRO, PkmnBaseEVs.SLOWBRO, "0080", Map.of(
        1, List.of(PkmnMoves.CONFUSION),
        18, List.of(PkmnMoves.DISABLE),
        22, List.of(PkmnMoves.HEADBUTT),
        27, List.of(PkmnMoves.GROWL),
        37, List.of(PkmnMoves.WATER_GUN),
        46, List.of(PkmnMoves.AMNESIA),
        56, List.of(PkmnMoves.PSYCHIC)
    )),
    MAGNEMITE(PkmnBaseStats.MAGNEMITE, PkmnBaseEVs.MAGNEMITE, "0081", Map.of(
        1, List.of(PkmnMoves.TACKLE),
        21, List.of(PkmnMoves.SONIC_BOOM),
        25, List.of(PkmnMoves.THUNDERSHOCK),
        29, List.of(PkmnMoves.SUPERSONIC),
        35, List.of(PkmnMoves.THUNDER_WAVE),
        41, List.of(PkmnMoves.SWIFT),
        49, List.of(PkmnMoves.SCREECH)
    )),
    MAGNETON(PkmnBaseStats.MAGNETON, PkmnBaseEVs.MAGNETON, "0082", Map.of(
        1, List.of(PkmnMoves.TACKLE),
        21, List.of(PkmnMoves.SONIC_BOOM),
        25, List.of(PkmnMoves.THUNDERSHOCK),
        29, List.of(PkmnMoves.SUPERSONIC),
        35, List.of(PkmnMoves.THUNDER_WAVE),
        41, List.of(PkmnMoves.SWIFT),
        49, List.of(PkmnMoves.SCREECH)
    )),
    FARFETCHD(PkmnBaseStats.FARFETCHD, PkmnBaseEVs.FARFETCHD, "0083", Map.of(
        1, List.of(PkmnMoves.PECK),
        15, List.of(PkmnMoves.SAND_ATTACK),
        31, List.of(PkmnMoves.LEER),
        39, List.of(PkmnMoves.FURY_ATTACK),
        49, List.of(PkmnMoves.SWORDS_DANCE),
        60, List.of(PkmnMoves.AGILITY)
    )),
    DODUO(PkmnBaseStats.DODUO, PkmnBaseEVs.DODUO, "0084", Map.of(
        1, List.of(PkmnMoves.PECK),
        20, List.of(PkmnMoves.GROWL),
        24, List.of(PkmnMoves.FURY_ATTACK),
        30, List.of(PkmnMoves.PAY_DAY),
        36, List.of(PkmnMoves.TRI_ATTACK),
        44, List.of(PkmnMoves.RAGE)
    )),
    DODRIO(PkmnBaseStats.DODRIO, PkmnBaseEVs.DODRIO, "0085", Map.of(
        1, List.of(PkmnMoves.PECK),
        20, List.of(PkmnMoves.GROWL),
        24, List.of(PkmnMoves.FURY_ATTACK),
        30, List.of(PkmnMoves.PAY_DAY),
        36, List.of(PkmnMoves.TRI_ATTACK),
        44, List.of(PkmnMoves.RAGE)
    )),
    SEEL(PkmnBaseStats.SEEL, PkmnBaseEVs.SEEL, "0086", Map.of(
        1, List.of(PkmnMoves.HEADBUTT),
        30, List.of(PkmnMoves.GROWL),
        35, List.of(PkmnMoves.AURORA_BEAM),
        40, List.of(PkmnMoves.REST),
        45, List.of(PkmnMoves.TAKE_DOWN),
        50, List.of(PkmnMoves.ICE_BEAM)
    )),
    DEWGONG(PkmnBaseStats.DEWGONG, PkmnBaseEVs.DEWGONG, "0087", Map.of(
        1, List.of(PkmnMoves.HEADBUTT),
        30, List.of(PkmnMoves.GROWL),
        35, List.of(PkmnMoves.AURORA_BEAM),
        40, List.of(PkmnMoves.REST),
        47, List.of(PkmnMoves.TAKE_DOWN),
        56, List.of(PkmnMoves.ICE_BEAM)
    )),
    GRIMER(PkmnBaseStats.GRIMER, PkmnBaseEVs.GRIMER, "0088", Map.of(
        1, List.of(PkmnMoves.POUND),
        30, List.of(PkmnMoves.HARDEN),
        33, List.of(PkmnMoves.SCREECH),
        37, List.of(PkmnMoves.ACID_ARMOR),
        42, List.of(PkmnMoves.SLUDGE),
        48, List.of(PkmnMoves.MINIMIZE)
    )),
    MUK(PkmnBaseStats.MUK, PkmnBaseEVs.MUK, "0089", Map.of(
        1, List.of(PkmnMoves.POUND),
        30, List.of(PkmnMoves.HARDEN),
        33, List.of(PkmnMoves.SCREECH),
        37, List.of(PkmnMoves.ACID_ARMOR),
        46, List.of(PkmnMoves.SLUDGE),
        56, List.of(PkmnMoves.MINIMIZE)
    )),
    SHELLDER(PkmnBaseStats.SHELLDER, PkmnBaseEVs.SHELLDER, "0090", Map.of(
        1, List.of(PkmnMoves.TACKLE),
        30, List.of(PkmnMoves.WITHDRAW),
        35, List.of(PkmnMoves.SUPERSONIC),
        40, List.of(PkmnMoves.CLAMP),
        45, List.of(PkmnMoves.AURORA_BEAM),
        50, List.of(PkmnMoves.SWIFT),
        55, List.of(PkmnMoves.SPIKE_CANNON)
    )),
    CLOYSTER(PkmnBaseStats.CLOYSTER, PkmnBaseEVs.CLOYSTER, "0091", Map.of(
        1, List.of(PkmnMoves.TACKLE),
        30, List.of(PkmnMoves.WITHDRAW),
        35, List.of(PkmnMoves.SUPERSONIC),
        40, List.of(PkmnMoves.CLAMP),
        50, List.of(PkmnMoves.AURORA_BEAM),
        60, List.of(PkmnMoves.SWIFT),
        70, List.of(PkmnMoves.SPIKE_CANNON)
    )),
    GASTLY(PkmnBaseStats.GASTLY, PkmnBaseEVs.GASTLY, "0092", Map.of(
        1, List.of(PkmnMoves.LICK),
        13, List.of(PkmnMoves.CONFUSE_RAY),
        27, List.of(PkmnMoves.NIGHT_SHADE),
        35, List.of(PkmnMoves.HYPNOSIS),
        43, List.of(PkmnMoves.DREAM_EATER)
    )),
    HAUNTER(PkmnBaseStats.HAUNTER, PkmnBaseEVs.HAUNTER, "0093", Map.of(
        1, List.of(PkmnMoves.LICK),
        13, List.of(PkmnMoves.CONFUSE_RAY),
        27, List.of(PkmnMoves.NIGHT_SHADE),
        35, List.of(PkmnMoves.HYPNOSIS),
        43, List.of(PkmnMoves.DREAM_EATER)
    )),
    GENGAR(PkmnBaseStats.GENGAR, PkmnBaseEVs.GENGAR, "0094", Map.of(
        1, List.of(PkmnMoves.LICK),
        13, List.of(PkmnMoves.CONFUSE_RAY),
        27, List.of(PkmnMoves.NIGHT_SHADE),
        35, List.of(PkmnMoves.HYPNOSIS),
        43, List.of(PkmnMoves.DREAM_EATER)
    )),
    ONIX(PkmnBaseStats.ONIX, PkmnBaseEVs.ONIX, "0095", Map.of(
        1, List.of(PkmnMoves.TACKLE),
        15, List.of(PkmnMoves.SCREECH),
        19, List.of(PkmnMoves.BIND),
        25, List.of(PkmnMoves.ROCK_THROW),
        33, List.of(PkmnMoves.HARDEN),
        43, List.of(PkmnMoves.RAGE),
        53, List.of(PkmnMoves.SLAM)
    )),
    DROWZEE(PkmnBaseStats.DROWZEE, PkmnBaseEVs.DROWZEE, "0096", Map.of(
        1, List.of(PkmnMoves.POUND),
        18, List.of(PkmnMoves.HYPNOSIS),
        21, List.of(PkmnMoves.CONFUSION),
        27, List.of(PkmnMoves.HEADBUTT),
        33, List.of(PkmnMoves.PSYBEAM),
        42, List.of(PkmnMoves.PSYCHIC),
        48, List.of(PkmnMoves.MEDITATE)
    )),
    HYPNO(PkmnBaseStats.HYPNO, PkmnBaseEVs.HYPNO, "0097", Map.of(
        1, List.of(PkmnMoves.POUND),
        18, List.of(PkmnMoves.HYPNOSIS),
        21, List.of(PkmnMoves.CONFUSION),
        27, List.of(PkmnMoves.HEADBUTT),
        33, List.of(PkmnMoves.PSYBEAM),
        42, List.of(PkmnMoves.PSYCHIC),
        48, List.of(PkmnMoves.MEDITATE)
    )),
    KRABBY(PkmnBaseStats.KRABBY, PkmnBaseEVs.KRABBY, "0098", Map.of(
        1, List.of(PkmnMoves.BUBBLE),
        20, List.of(PkmnMoves.VICE_GRIP),
        25, List.of(PkmnMoves.LEER),
        30, List.of(PkmnMoves.HARDEN),
        35, List.of(PkmnMoves.GUILLOTINE),
        40, List.of(PkmnMoves.STOMP),
        45, List.of(PkmnMoves.CRABHAMMER)
    )),
    KINGLER(PkmnBaseStats.KINGLER, PkmnBaseEVs.KINGLER, "0099", Map.of(
        1, List.of(PkmnMoves.BUBBLE),
        20, List.of(PkmnMoves.VICE_GRIP),
        25, List.of(PkmnMoves.LEER),
        30, List.of(PkmnMoves.HARDEN),
        35, List.of(PkmnMoves.GUILLOTINE),
        40, List.of(PkmnMoves.STOMP),
        45, List.of(PkmnMoves.CRABHAMMER)
    )),
    VOLTORB(PkmnBaseStats.VOLTORB, PkmnBaseEVs.VOLTORB, "0100", Map.of(
        1, List.of(PkmnMoves.TACKLE),
        17, List.of(PkmnMoves.SCREECH),
        22, List.of(PkmnMoves.SONIC_BOOM),
        29, List.of(PkmnMoves.THUNDER_WAVE),
        36, List.of(PkmnMoves.SELF_DESTRUCT),
        43, List.of(PkmnMoves.LIGHT_SCREEN),
        50, List.of(PkmnMoves.EXPLOSION)
    )),
    ELECTRODE(PkmnBaseStats.ELECTRODE, PkmnBaseEVs.ELECTRODE, "0101", Map.of(
        1, List.of(PkmnMoves.TACKLE),
        17, List.of(PkmnMoves.SCREECH),
        22, List.of(PkmnMoves.SONIC_BOOM),
        29, List.of(PkmnMoves.THUNDER_WAVE),
        36, List.of(PkmnMoves.SELF_DESTRUCT),
        43, List.of(PkmnMoves.LIGHT_SCREEN),
        50, List.of(PkmnMoves.EXPLOSION)
    )),
    EXEGGCUTE(PkmnBaseStats.EXEGGCUTE, PkmnBaseEVs.EXEGGCUTE, "0102", Map.of(
        1, List.of(PkmnMoves.BARRAGE, PkmnMoves.HYPNOSIS),
        25, List.of(PkmnMoves.REFLECT),
        28, List.of(PkmnMoves.LEECH_SEED),
        32, List.of(PkmnMoves.STUN_SPORE),
        37, List.of(PkmnMoves.POISON_POWDER),
        42, List.of(PkmnMoves.SOLAR_BEAM),
        47, List.of(PkmnMoves.SLEEP_POWDER)
    )),
    EXEGGUTOR(PkmnBaseStats.EXEGGUTOR, PkmnBaseEVs.EXEGGUTOR, "0103", Map.of(
        1, List.of(PkmnMoves.BARRAGE, PkmnMoves.HYPNOSIS),
        25, List.of(PkmnMoves.REFLECT),
        28, List.of(PkmnMoves.LEECH_SEED),
        32, List.of(PkmnMoves.STUN_SPORE),
        37, List.of(PkmnMoves.POISON_POWDER),
        42, List.of(PkmnMoves.SOLAR_BEAM),
        47, List.of(PkmnMoves.SLEEP_POWDER)
    )),
    CUBONE(PkmnBaseStats.CUBONE, PkmnBaseEVs.CUBONE, "0104", Map.of(
        1, List.of(PkmnMoves.GROWL),
        25, List.of(PkmnMoves.LEER),
        31, List.of(PkmnMoves.BONE_CLUB),
        38, List.of(PkmnMoves.RAGE),
        43, List.of(PkmnMoves.FOCUS_ENERGY),
        46, List.of(PkmnMoves.THRASH)
    )),
    MAROWAK(PkmnBaseStats.MAROWAK, PkmnBaseEVs.MAROWAK, "0105", Map.of(
        1, List.of(PkmnMoves.GROWL),
        25, List.of(PkmnMoves.LEER),
        31, List.of(PkmnMoves.BONE_CLUB),
        38, List.of(PkmnMoves.RAGE),
        43, List.of(PkmnMoves.FOCUS_ENERGY),
        46, List.of(PkmnMoves.THRASH)
    )),
    HITMONLEE(PkmnBaseStats.HITMONLEE, PkmnBaseEVs.HITMONLEE, "0106", Map.of(
        1, List.of(PkmnMoves.DOUBLE_KICK, PkmnMoves.MEDITATE),
        33, List.of(PkmnMoves.ROLLING_KICK),
        38, List.of(PkmnMoves.JUMP_KICK),
        43, List.of(PkmnMoves.FOCUS_ENERGY),
        48, List.of(PkmnMoves.HI_JUMP_KICK),
        53, List.of(PkmnMoves.MEGA_KICK)
    )),
    HITMONCHAN(PkmnBaseStats.HITMONCHAN, PkmnBaseEVs.HITMONCHAN, "0107", Map.of(
        1, List.of(PkmnMoves.COMET_PUNCH, PkmnMoves.AGILITY),
        33, List.of(PkmnMoves.FIRE_PUNCH),
        38, List.of(PkmnMoves.ICE_PUNCH),
        43, List.of(PkmnMoves.THUNDER_PUNCH),
        48, List.of(PkmnMoves.MEGA_PUNCH),
        53, List.of(PkmnMoves.COUNTER)
    )),
    LICKITUNG(PkmnBaseStats.LICKITUNG, PkmnBaseEVs.LICKITUNG, "0108", Map.of(
        1, List.of(PkmnMoves.WRAP),
        7, List.of(PkmnMoves.SUPERSONIC),
        15, List.of(PkmnMoves.STOMP),
        23, List.of(PkmnMoves.WRAP),
        31, List.of(PkmnMoves.STOMP),
        39, List.of(PkmnMoves.HYPER_BEAM)
    )),
    KOFFING(PkmnBaseStats.KOFFING, PkmnBaseEVs.KOFFING, "0109", Map.of(
        1, List.of(PkmnMoves.TACKLE, PkmnMoves.SMOG),
        32, List.of(PkmnMoves.SLUDGE),
        37, List.of(PkmnMoves.SMOKESCREEN),
        40, List.of(PkmnMoves.SELF_DESTRUCT),
        45, List.of(PkmnMoves.HAZE),
        48, List.of(PkmnMoves.EXPLOSION)
    )),
    WEEZING(PkmnBaseStats.WEEZING, PkmnBaseEVs.WEEZING, "0110", Map.of(
        1, List.of(PkmnMoves.TACKLE, PkmnMoves.SMOG),
        32, List.of(PkmnMoves.SLUDGE),
        37, List.of(PkmnMoves.SMOKESCREEN),
        40, List.of(PkmnMoves.SELF_DESTRUCT),
        45, List.of(PkmnMoves.HAZE),
        48, List.of(PkmnMoves.EXPLOSION)
    )),
    RHYHORN(PkmnBaseStats.RHYHORN, PkmnBaseEVs.RHYHORN, "0111", Map.of(
        1, List.of(PkmnMoves.HORN_ATTACK),
        30, List.of(PkmnMoves.STOMP),
        35, List.of(PkmnMoves.TAIL_WHIP),
        40, List.of(PkmnMoves.FURY_ATTACK),
        45, List.of(PkmnMoves.HORN_DRILL),
        50, List.of(PkmnMoves.LEER),
        55, List.of(PkmnMoves.TAKE_DOWN)
    )),
    RHYDON(PkmnBaseStats.RHYDON, PkmnBaseEVs.RHYDON, "0112", Map.of(
        1, List.of(PkmnMoves.HORN_ATTACK),
        30, List.of(PkmnMoves.STOMP),
        35, List.of(PkmnMoves.TAIL_WHIP),
        40, List.of(PkmnMoves.FURY_ATTACK),
        45, List.of(PkmnMoves.HORN_DRILL),
        50, List.of(PkmnMoves.LEER),
        55, List.of(PkmnMoves.TAKE_DOWN)
    )),
    CHANSEY(PkmnBaseStats.CHANSEY, PkmnBaseEVs.CHANSEY, "0113", Map.of(
        1, List.of(PkmnMoves.POUND),
        18, List.of(PkmnMoves.DOUBLE_SLAP),
        23, List.of(PkmnMoves.SING),
        28, List.of(PkmnMoves.DOUBLE_EDGE),
        33, List.of(PkmnMoves.DEFENSE_CURL),
        40, List.of(PkmnMoves.LIGHT_SCREEN),
        48, List.of(PkmnMoves.EGG_BOMB)
    )),
    TANGELA(PkmnBaseStats.TANGELA, PkmnBaseEVs.TANGELA, "0114", Map.of(
        1, List.of(PkmnMoves.CONSTRICT),
        29, List.of(PkmnMoves.GROWTH),
        32, List.of(PkmnMoves.VINE_WHIP),
        36, List.of(PkmnMoves.BIND),
        39, List.of(PkmnMoves.MEGA_DRAIN),
        45, List.of(PkmnMoves.STUN_SPORE),
        48, List.of(PkmnMoves.SLEEP_POWDER)
    )),
    KANGASKHAN(PkmnBaseStats.KANGASKHAN, PkmnBaseEVs.KANGASKHAN, "0115", Map.of(
        1, List.of(PkmnMoves.COMET_PUNCH),
        26, List.of(PkmnMoves.RAGE),
        31, List.of(PkmnMoves.BITE),
        36, List.of(PkmnMoves.TAIL_WHIP),
        41, List.of(PkmnMoves.MEGA_PUNCH),
        46, List.of(PkmnMoves.LEER),
        51, List.of(PkmnMoves.DOUBLE_EDGE)
    )),
    HORSEA(PkmnBaseStats.HORSEA, PkmnBaseEVs.HORSEA, "0116", Map.of(
        1, List.of(PkmnMoves.BUBBLE),
        22, List.of(PkmnMoves.SMOKESCREEN),
        27, List.of(PkmnMoves.LEER),
        32, List.of(PkmnMoves.WATER_GUN),
        37, List.of(PkmnMoves.AGILITY),
        42, List.of(PkmnMoves.HYDRO_PUMP)
    )),
    SEADRA(PkmnBaseStats.SEADRA, PkmnBaseEVs.SEADRA, "0117", Map.of(
        1, List.of(PkmnMoves.BUBBLE),
        22, List.of(PkmnMoves.SMOKESCREEN),
        27, List.of(PkmnMoves.LEER),
        32, List.of(PkmnMoves.WATER_GUN),
        41, List.of(PkmnMoves.AGILITY),
        50, List.of(PkmnMoves.HYDRO_PUMP)
    )),
    GOLDEEN(PkmnBaseStats.GOLDEEN, PkmnBaseEVs.GOLDEEN, "0118", Map.of(
        1, List.of(PkmnMoves.PECK),
        19, List.of(PkmnMoves.TAIL_WHIP),
        24, List.of(PkmnMoves.SUPERSONIC),
        30, List.of(PkmnMoves.HORN_ATTACK),
        37, List.of(PkmnMoves.AGILITY),
        45, List.of(PkmnMoves.WATERFALL)
    )),
    SEAKING(PkmnBaseStats.SEAKING, PkmnBaseEVs.SEAKING, "0119", Map.of(
        1, List.of(PkmnMoves.PECK),
        19, List.of(PkmnMoves.TAIL_WHIP),
        24, List.of(PkmnMoves.SUPERSONIC),
        30, List.of(PkmnMoves.HORN_ATTACK),
        40, List.of(PkmnMoves.AGILITY),
        52, List.of(PkmnMoves.WATERFALL)
    )),
    STARYU(PkmnBaseStats.STARYU, PkmnBaseEVs.STARYU, "0120", Map.of(
        1, List.of(PkmnMoves.TACKLE),
        18, List.of(PkmnMoves.WATER_GUN),
        22, List.of(PkmnMoves.HARDEN),
        27, List.of(PkmnMoves.RECOVER),
        31, List.of(PkmnMoves.SWIFT),
        40, List.of(PkmnMoves.MINIMIZE),
        49, List.of(PkmnMoves.LIGHT_SCREEN)
    )),
    STARMIE(PkmnBaseStats.STARMIE, PkmnBaseEVs.STARMIE, "0121", Map.of(
        1, List.of(PkmnMoves.TACKLE),
        18, List.of(PkmnMoves.WATER_GUN),
        22, List.of(PkmnMoves.HARDEN),
        27, List.of(PkmnMoves.RECOVER),
        31, List.of(PkmnMoves.SWIFT),
        40, List.of(PkmnMoves.MINIMIZE),
        49, List.of(PkmnMoves.LIGHT_SCREEN)
    )),
    MR_MIME(PkmnBaseStats.MR_MIME, PkmnBaseEVs.MR_MIME, "0122", Map.of(
        1, List.of(PkmnMoves.CONFUSION, PkmnMoves.BARRIER),
        15, List.of(PkmnMoves.CONFUSION),
        23, List.of(PkmnMoves.LIGHT_SCREEN),
        31, List.of(PkmnMoves.DOUBLE_SLAP),
        39, List.of(PkmnMoves.MEDITATE),
        55, List.of(PkmnMoves.SUBSTITUTE)
    )),
    SCYTHER(PkmnBaseStats.SCYTHER, PkmnBaseEVs.SCYTHER, "0123", Map.of(
        1, List.of(PkmnMoves.QUICK_ATTACK),
        17, List.of(PkmnMoves.LEER),
        20, List.of(PkmnMoves.FOCUS_ENERGY),
        24, List.of(PkmnMoves.DOUBLE_TEAM),
        29, List.of(PkmnMoves.SLASH),
        35, List.of(PkmnMoves.SWORDS_DANCE),
        42, List.of(PkmnMoves.AGILITY)
    )),
    JYNX(PkmnBaseStats.JYNX, PkmnBaseEVs.JYNX, "0124", Map.of(
        1, List.of(PkmnMoves.POUND, PkmnMoves.LOVELY_KISS),
        18, List.of(PkmnMoves.LICK),
        23, List.of(PkmnMoves.DOUBLE_SLAP),
        31, List.of(PkmnMoves.ICE_PUNCH),
        39, List.of(PkmnMoves.BODY_SLAM),
        47, List.of(PkmnMoves.THRASH),
        58, List.of(PkmnMoves.BLIZZARD)
    )),
    ELECTABUZZ(PkmnBaseStats.ELECTABUZZ, PkmnBaseEVs.ELECTABUZZ, "0125", Map.of(
        1, List.of(PkmnMoves.QUICK_ATTACK),
        34, List.of(PkmnMoves.THUNDER_PUNCH),
        43, List.of(PkmnMoves.LIGHT_SCREEN),
        49, List.of(PkmnMoves.THUNDERBOLT),
        54, List.of(PkmnMoves.THUNDER_WAVE),
        60, List.of(PkmnMoves.PSYCHIC),
        66, List.of(PkmnMoves.THUNDER)
    )),
    MAGMAR(PkmnBaseStats.MAGMAR, PkmnBaseEVs.MAGMAR, "0126", Map.of(
        1, List.of(PkmnMoves.EMBER),
        34, List.of(PkmnMoves.FIRE_PUNCH),
        39, List.of(PkmnMoves.LEER),
        43, List.of(PkmnMoves.RAGE),
        48, List.of(PkmnMoves.CONFUSE_RAY),
        52, List.of(PkmnMoves.FIRE_BLAST),
        55, List.of(PkmnMoves.HYPER_BEAM)
    )),
    PINSIR(PkmnBaseStats.PINSIR, PkmnBaseEVs.PINSIR, "0127", Map.of(
        1, List.of(PkmnMoves.VICE_GRIP),
        25, List.of(PkmnMoves.SEISMIC_TOSS),
        30, List.of(PkmnMoves.HARDEN),
        36, List.of(PkmnMoves.FOCUS_ENERGY),
        42, List.of(PkmnMoves.BIND),
        49, List.of(PkmnMoves.GUILLOTINE)
    )),
    TAUROS(PkmnBaseStats.TAUROS, PkmnBaseEVs.TAUROS, "0128", Map.of(
        1, List.of(PkmnMoves.TACKLE),
        21, List.of(PkmnMoves.STOMP),
        28, List.of(PkmnMoves.TAIL_WHIP),
        35, List.of(PkmnMoves.LEER),
        44, List.of(PkmnMoves.RAGE),
        51, List.of(PkmnMoves.TAKE_DOWN),
        60, List.of(PkmnMoves.HORN_DRILL)
    )),
    MAGIKARP(PkmnBaseStats.MAGIKARP, PkmnBaseEVs.MAGIKARP, "0129", Map.of(
        1, List.of(PkmnMoves.SPLASH),
        15, List.of(PkmnMoves.TACKLE)
    )),
    GYARADOS(PkmnBaseStats.GYARADOS, PkmnBaseEVs.GYARADOS, "0130", Map.of(
        1, List.of(PkmnMoves.BITE, PkmnMoves.DRAGON_RAGE, PkmnMoves.LEER, PkmnMoves.HYDRO_PUMP),
        20, List.of(PkmnMoves.BITE),
        25, List.of(PkmnMoves.DRAGON_RAGE),
        32, List.of(PkmnMoves.LEER),
        41, List.of(PkmnMoves.HYDRO_PUMP),
        52, List.of(PkmnMoves.HYPER_BEAM)
    )),
    LAPRAS(PkmnBaseStats.LAPRAS, PkmnBaseEVs.LAPRAS, "0131", Map.of(
        1, List.of(PkmnMoves.WATER_GUN, PkmnMoves.GROWL),
        16, List.of(PkmnMoves.WATER_GUN),
        20, List.of(PkmnMoves.GROWL),
        25, List.of(PkmnMoves.SING),
        31, List.of(PkmnMoves.MIST),
        38, List.of(PkmnMoves.REST),
        46, List.of(PkmnMoves.BLIZZARD)
    )),
    DITTO(PkmnBaseStats.DITTO, PkmnBaseEVs.DITTO, "0132", Map.of(
        1, List.of(PkmnMoves.TRANSFORM)
    )),
    EEVEE(PkmnBaseStats.EEVEE, PkmnBaseEVs.EEVEE, "0133", Map.of(
        1, List.of(PkmnMoves.TACKLE),
        27, List.of(PkmnMoves.QUICK_ATTACK),
        31, List.of(PkmnMoves.TAIL_WHIP),
        37, List.of(PkmnMoves.BITE),
        45, List.of(PkmnMoves.TAKE_DOWN),
        50, List.of(PkmnMoves.FOCUS_ENERGY)
    )),
    VAPOREON(PkmnBaseStats.VAPOREON, PkmnBaseEVs.VAPOREON, "0134", Map.of(
        1, List.of(PkmnMoves.WATER_GUN),
        16, List.of(PkmnMoves.WATER_GUN),
        20, List.of(PkmnMoves.QUICK_ATTACK),
        25, List.of(PkmnMoves.WATER_GUN),
        31, List.of(PkmnMoves.QUICK_ATTACK),
        37, List.of(PkmnMoves.ACID_ARMOR),
        42, List.of(PkmnMoves.HAZE),
        47, List.of(PkmnMoves.MIST)
    )),
    JOLTEON(PkmnBaseStats.JOLTEON, PkmnBaseEVs.JOLTEON, "0135", Map.of(
        1, List.of(PkmnMoves.QUICK_ATTACK),
        16, List.of(PkmnMoves.THUNDERSHOCK),
        20, List.of(PkmnMoves.QUICK_ATTACK),
        25, List.of(PkmnMoves.DOUBLE_KICK),
        31, List.of(PkmnMoves.PIN_MISSILE),
        37, List.of(PkmnMoves.THUNDER_WAVE),
        42, List.of(PkmnMoves.AGILITY),
        47, List.of(PkmnMoves.THUNDER)
    )),
    FLAREON(PkmnBaseStats.FLAREON, PkmnBaseEVs.FLAREON, "0136", Map.of(
        1, List.of(PkmnMoves.EMBER),
        16, List.of(PkmnMoves.EMBER),
        20, List.of(PkmnMoves.QUICK_ATTACK),
        25, List.of(PkmnMoves.EMBER),
        31, List.of(PkmnMoves.QUICK_ATTACK),
        37, List.of(PkmnMoves.FIRE_SPIN),
        42, List.of(PkmnMoves.RAGE),
        47, List.of(PkmnMoves.FIRE_BLAST)
    )),
    PORYGON(PkmnBaseStats.PORYGON, PkmnBaseEVs.PORYGON, "0137", Map.of(
        1, List.of(PkmnMoves.TACKLE),
        9, List.of(PkmnMoves.SHARPEN),
        12, List.of(PkmnMoves.CONVERSION),
        20, List.of(PkmnMoves.PSYBEAM),
        24, List.of(PkmnMoves.AGILITY),
        32, List.of(PkmnMoves.RECOVER),
        36, List.of(PkmnMoves.TRI_ATTACK)
    )),
    OMANYTE(PkmnBaseStats.OMANYTE, PkmnBaseEVs.OMANYTE, "0138", Map.of(
        1, List.of(PkmnMoves.WATER_GUN),
        38, List.of(PkmnMoves.WITHDRAW),
        44, List.of(PkmnMoves.BITE),
        53, List.of(PkmnMoves.WATER_GUN),
        62, List.of(PkmnMoves.LEER),
        72, List.of(PkmnMoves.HYDRO_PUMP)
    )),
    OMASTAR(PkmnBaseStats.OMASTAR, PkmnBaseEVs.OMASTAR, "0139", Map.of(
        1, List.of(PkmnMoves.WATER_GUN),
        38, List.of(PkmnMoves.WITHDRAW),
        44, List.of(PkmnMoves.BITE),
        53, List.of(PkmnMoves.WATER_GUN),
        62, List.of(PkmnMoves.LEER),
        72, List.of(PkmnMoves.HYDRO_PUMP)
    )),
    KABUTO(PkmnBaseStats.KABUTO, PkmnBaseEVs.KABUTO, "0140", Map.of(
        1, List.of(PkmnMoves.SCRATCH),
        34, List.of(PkmnMoves.HARDEN),
        39, List.of(PkmnMoves.ABSORB),
        44, List.of(PkmnMoves.SLASH),
        49, List.of(PkmnMoves.LEER),
        54, List.of(PkmnMoves.HYDRO_PUMP)
    )),
    KABUTOPS(PkmnBaseStats.KABUTOPS, PkmnBaseEVs.KABUTOPS, "0141", Map.of(
        1, List.of(PkmnMoves.SCRATCH),
        34, List.of(PkmnMoves.HARDEN),
        39, List.of(PkmnMoves.ABSORB),
        44, List.of(PkmnMoves.SLASH),
        49, List.of(PkmnMoves.LEER),
        54, List.of(PkmnMoves.HYDRO_PUMP)
    )),
    AERODACTYL(PkmnBaseStats.AERODACTYL, PkmnBaseEVs.AERODACTYL, "0142", Map.of(
        1, List.of(PkmnMoves.WING_ATTACK),
        38, List.of(PkmnMoves.SUPERSONIC),
        44, List.of(PkmnMoves.BITE),
        51, List.of(PkmnMoves.AGILITY),
        60, List.of(PkmnMoves.TAKE_DOWN),
        70, List.of(PkmnMoves.HYPER_BEAM)
    )),
    SNORLAX(PkmnBaseStats.SNORLAX, PkmnBaseEVs.SNORLAX, "0143", Map.of(
        1, List.of(PkmnMoves.TACKLE),
        28, List.of(PkmnMoves.AMNESIA),
        38, List.of(PkmnMoves.REST),
        49, List.of(PkmnMoves.BODY_SLAM),
        60, List.of(PkmnMoves.HARDEN),
        70, List.of(PkmnMoves.DOUBLE_EDGE)
    )),
    ARTICUNO(PkmnBaseStats.ARTICUNO, PkmnBaseEVs.ARTICUNO, "0144", Map.of(
        1, List.of(PkmnMoves.PECK, PkmnMoves.ICE_BEAM),
        51, List.of(PkmnMoves.BLIZZARD),
        55, List.of(PkmnMoves.AGILITY),
        60, List.of(PkmnMoves.MIST)

    )),
    ZAPDOS(PkmnBaseStats.ZAPDOS, PkmnBaseEVs.ZAPDOS, "0145", Map.of(
        1, List.of(PkmnMoves.PECK, PkmnMoves.THUNDERSHOCK),
        51, List.of(PkmnMoves.THUNDERBOLT),
        55, List.of(PkmnMoves.AGILITY),
        60, List.of(PkmnMoves.LIGHT_SCREEN)
    )),
    MOLTRES(PkmnBaseStats.MOLTRES, PkmnBaseEVs.MOLTRES, "0146", Map.of(
        1, List.of(PkmnMoves.PECK, PkmnMoves.FIRE_SPIN),
        51, List.of(PkmnMoves.LEER),
        55, List.of(PkmnMoves.AGILITY),
        60, List.of(PkmnMoves.SKY_ATTACK)
    )),
    DRATINI(PkmnBaseStats.DRATINI, PkmnBaseEVs.DRATINI, "0147", Map.of(
        1, List.of(PkmnMoves.WRAP, PkmnMoves.LEER),
        10, List.of(PkmnMoves.THUNDER_WAVE),
        20, List.of(PkmnMoves.AGILITY),
        30, List.of(PkmnMoves.SLAM),
        40, List.of(PkmnMoves.DRAGON_RAGE),
        50, List.of(PkmnMoves.HYPER_BEAM)
    )),
    DRAGONAIR(PkmnBaseStats.DRAGONAIR, PkmnBaseEVs.DRAGONAIR, "0148", Map.of(
        1, List.of(PkmnMoves.WRAP, PkmnMoves.LEER),
        10, List.of(PkmnMoves.THUNDER_WAVE),
        20, List.of(PkmnMoves.AGILITY),
        30, List.of(PkmnMoves.SLAM),
        40, List.of(PkmnMoves.DRAGON_RAGE),
        50, List.of(PkmnMoves.HYPER_BEAM)
    )),
    DRAGONITE(PkmnBaseStats.DRAGONITE, PkmnBaseEVs.DRAGONITE, "0149", Map.of(
        1, List.of(PkmnMoves.WRAP, PkmnMoves.LEER),
        10, List.of(PkmnMoves.THUNDER_WAVE),
        20, List.of(PkmnMoves.AGILITY),
        30, List.of(PkmnMoves.SLAM),
        40, List.of(PkmnMoves.DRAGON_RAGE),
        50, List.of(PkmnMoves.HYPER_BEAM)
    )),
    MEWTWO(PkmnBaseStats.MEWTWO, PkmnBaseEVs.MEWTWO, "0150", Map.of(
        1, List.of(PkmnMoves.CONFUSION),
        81, List.of(PkmnMoves.PSYCHIC),
        88, List.of(PkmnMoves.RECOVER),
        94, List.of(PkmnMoves.SWIFT),
        100, List.of(PkmnMoves.PSYCHIC)
    )),
    MEW(PkmnBaseStats.MEW, PkmnBaseEVs.MEW, "0151", Map.of(
        1, List.of(PkmnMoves.POUND),
        10, List.of(PkmnMoves.TRANSFORM),
        20, List.of(PkmnMoves.MEGA_PUNCH),
        30, List.of(PkmnMoves.METRONOME),
        40, List.of(PkmnMoves.PSYCHIC)
    ));

    private final PkmnBaseStats baseStats;
    private final PkmnBaseEVs baseEVs;
    private final BufferedImage front;
    private final BufferedImage back;
    private Map<Integer, List<PkmnMoves>> learnset;

    PkmnSpecies(PkmnBaseStats baseStats, PkmnBaseEVs baseEVs, String number, Map<Integer, List<PkmnMoves>> learnset) {
        this.baseStats = baseStats;
        this.baseEVs = baseEVs;
        try {
            this.front = ImageIO.read(getClass().getClassLoader().getResource("images/pkmnFronts/" + number + ".png"));
            this.back = ImageIO.read(getClass().getClassLoader().getResource("images/pkmnBacks/" + number + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.learnset = learnset;
    }

    public PkmnBaseStats getBaseStats() {
        return baseStats;
    }

    public PkmnBaseEVs getBaseEVs() {
        return baseEVs;
    }

    public BufferedImage getFront() {
        return front;
    }

    public BufferedImage getBack() {
        return back;
    }

}
