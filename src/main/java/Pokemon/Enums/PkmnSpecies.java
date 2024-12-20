package Pokemon.Enums;

import Engine.Canvas;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public enum PkmnSpecies {
    BULBASAUR(PkmnBaseStats.BULBASAUR, PkmnBaseEVs.BULBASAUR, "0001"),
    IVYSAUR(PkmnBaseStats.IVYSAUR, PkmnBaseEVs.IVYSAUR, "0002"),
    VENUSAUR(PkmnBaseStats.VENUSAUR, PkmnBaseEVs.VENUSAUR, "0003"),
    CHARMANDER(PkmnBaseStats.CHARMANDER, PkmnBaseEVs.CHARMANDER, "0004"),
    CHARMELEON(PkmnBaseStats.CHARMELEON, PkmnBaseEVs.CHARMELEON, "0005"),
    CHARIZARD(PkmnBaseStats.CHARIZARD, PkmnBaseEVs.CHARIZARD, "0006"),
    SQUIRTLE(PkmnBaseStats.SQUIRTLE, PkmnBaseEVs.SQUIRTLE, "0007"),
    WARTORTLE(PkmnBaseStats.WARTORTLE, PkmnBaseEVs.WARTORTLE, "0008"),
    BLASTOISE(PkmnBaseStats.BLASTOISE, PkmnBaseEVs.BLASTOISE, "0009"),
    CATERPIE(PkmnBaseStats.CATERPIE, PkmnBaseEVs.CATERPIE, "0010"),
    METAPOD(PkmnBaseStats.METAPOD, PkmnBaseEVs.METAPOD, "0011"),
    BUTTERFREE(PkmnBaseStats.BUTTERFREE, PkmnBaseEVs.BUTTERFREE, "0012"),
    WEEDLE(PkmnBaseStats.WEEDLE, PkmnBaseEVs.WEEDLE, "0013"),
    KAKUNA(PkmnBaseStats.KAKUNA, PkmnBaseEVs.KAKUNA, "0014"),
    BEEDRILL(PkmnBaseStats.BEEDRILL, PkmnBaseEVs.BEEDRILL, "0015"),
    PIDGEY(PkmnBaseStats.PIDGEY, PkmnBaseEVs.PIDGEY, "0016"),
    PIDGEOTTO(PkmnBaseStats.PIDGEOTTO, PkmnBaseEVs.PIDGEOTTO, "0017"),
    PIDGEOT(PkmnBaseStats.PIDGEOT, PkmnBaseEVs.PIDGEOT, "0018"),
    RATTATA(PkmnBaseStats.RATTATA, PkmnBaseEVs.RATTATA, "0019"),
    RATICATE(PkmnBaseStats.RATICATE, PkmnBaseEVs.RATICATE, "0020"),
    SPEAROW(PkmnBaseStats.SPEAROW, PkmnBaseEVs.SPEAROW, "0021"),
    FEAROW(PkmnBaseStats.FEAROW, PkmnBaseEVs.FEAROW, "0022"),
    EKANS(PkmnBaseStats.EKANS, PkmnBaseEVs.EKANS, "0023"),
    ARBOK(PkmnBaseStats.ARBOK, PkmnBaseEVs.ARBOK, "0024"),
    PIKACHU(PkmnBaseStats.PIKACHU, PkmnBaseEVs.PIKACHU, "0025"),
    RAICHU(PkmnBaseStats.RAICHU, PkmnBaseEVs.RAICHU, "0026"),
    SANDSHREW(PkmnBaseStats.SANDSHREW, PkmnBaseEVs.SANDSHREW, "0027"),
    SANDSLASH(PkmnBaseStats.SANDSLASH, PkmnBaseEVs.SANDSLASH, "0028"),
    NIDORANF(PkmnBaseStats.NIDORANF, PkmnBaseEVs.NIDORANF, "0029"),
    NIDORINA(PkmnBaseStats.NIDORINA, PkmnBaseEVs.NIDORINA, "0030"),
    NIDOQUEEN(PkmnBaseStats.NIDOQUEEN, PkmnBaseEVs.NIDOQUEEN, "0031"),
    NIDORANM(PkmnBaseStats.NIDORANM, PkmnBaseEVs.NIDORANM, "0032"),
    NIDORINO(PkmnBaseStats.NIDORINO, PkmnBaseEVs.NIDORINO, "0033"),
    NIDOKING(PkmnBaseStats.NIDOKING, PkmnBaseEVs.NIDOKING, "0034"),
    CLEFAIRY(PkmnBaseStats.CLEFAIRY, PkmnBaseEVs.CLEFAIRY, "0035"),
    CLEFABLE(PkmnBaseStats.CLEFABLE, PkmnBaseEVs.CLEFABLE, "0036"),
    VULPIX(PkmnBaseStats.VULPIX, PkmnBaseEVs.VULPIX, "0037"),
    NINETALES(PkmnBaseStats.NINETALES, PkmnBaseEVs.NINETALES, "0038"),
    JIGGLYPUFF(PkmnBaseStats.JIGGLYPUFF, PkmnBaseEVs.JIGGLYPUFF, "0039"),
    WIGGLYTUFF(PkmnBaseStats.WIGGLYTUFF, PkmnBaseEVs.WIGGLYTUFF, "0040"),
    ZUBAT(PkmnBaseStats.ZUBAT, PkmnBaseEVs.ZUBAT, "0041"),
    GOLBAT(PkmnBaseStats.GOLBAT, PkmnBaseEVs.GOLBAT, "0042"),
    ODDISH(PkmnBaseStats.ODDISH, PkmnBaseEVs.ODDISH, "0043"),
    GLOOM(PkmnBaseStats.GLOOM, PkmnBaseEVs.GLOOM, "0044"),
    VILEPLUME(PkmnBaseStats.VILEPLUME, PkmnBaseEVs.VILEPLUME, "0045"),
    PARAS(PkmnBaseStats.PARAS, PkmnBaseEVs.PARAS, "0046"),
    PARASECT(PkmnBaseStats.PARASECT, PkmnBaseEVs.PARASECT, "0047"),
    VENONAT(PkmnBaseStats.VENONAT, PkmnBaseEVs.VENONAT, "0048"),
    VENOMOTH(PkmnBaseStats.VENOMOTH, PkmnBaseEVs.VENOMOTH, "0049"),
    DIGLETT(PkmnBaseStats.DIGLETT, PkmnBaseEVs.DIGLETT, "0050"),
    DUGTRIO(PkmnBaseStats.DUGTRIO, PkmnBaseEVs.DUGTRIO, "0051"),
    MEOWTH(PkmnBaseStats.MEOWTH, PkmnBaseEVs.MEOWTH, "0052"),
    PERSIAN(PkmnBaseStats.PERSIAN, PkmnBaseEVs.PERSIAN, "0053"),
    PSYDUCK(PkmnBaseStats.PSYDUCK, PkmnBaseEVs.PSYDUCK, "0054"),
    GOLDUCK(PkmnBaseStats.GOLDUCK, PkmnBaseEVs.GOLDUCK, "0055"),
    MANKEY(PkmnBaseStats.MANKEY, PkmnBaseEVs.MANKEY, "0056"),
    PRIMEAPE(PkmnBaseStats.PRIMEAPE, PkmnBaseEVs.PRIMEAPE, "0057"),
    GROWLITHE(PkmnBaseStats.GROWLITHE, PkmnBaseEVs.GROWLITHE, "0058"),
    ARCANINE(PkmnBaseStats.ARCANINE, PkmnBaseEVs.ARCANINE, "0059"),
    POLIWAG(PkmnBaseStats.POLIWAG, PkmnBaseEVs.POLIWAG, "0060"),
    POLIWHIRL(PkmnBaseStats.POLIWHIRL, PkmnBaseEVs.POLIWHIRL, "0061"),
    POLIWRATH(PkmnBaseStats.POLIWRATH, PkmnBaseEVs.POLIWRATH, "0062"),
    ABRA(PkmnBaseStats.ABRA, PkmnBaseEVs.ABRA, "0063"),
    KADABRA(PkmnBaseStats.KADABRA, PkmnBaseEVs.KADABRA, "0064"),
    ALAKAZAM(PkmnBaseStats.ALAKAZAM, PkmnBaseEVs.ALAKAZAM, "0065"),
    MACHOP(PkmnBaseStats.MACHOP, PkmnBaseEVs.MACHOP, "0066"),
    MACHOKE(PkmnBaseStats.MACHOKE, PkmnBaseEVs.MACHOKE, "0067"),
    MACHAMP(PkmnBaseStats.MACHAMP, PkmnBaseEVs.MACHAMP, "0068"),
    BELLSPROUT(PkmnBaseStats.BELLSPROUT, PkmnBaseEVs.BELLSPROUT, "0069"),
    WEEPINBELL(PkmnBaseStats.WEEPINBELL, PkmnBaseEVs.WEEPINBELL, "0070"),
    VICTREEBEL(PkmnBaseStats.VICTREEBEL, PkmnBaseEVs.VICTREEBEL, "0071"),
    TENTACOOL(PkmnBaseStats.TENTACOOL, PkmnBaseEVs.TENTACOOL, "0072"),
    TENTACRUEL(PkmnBaseStats.TENTACRUEL, PkmnBaseEVs.TENTACRUEL, "0073"),
    GEODUDE(PkmnBaseStats.GEODUDE, PkmnBaseEVs.GEODUDE, "0074"),
    GRAVELER(PkmnBaseStats.GRAVELER, PkmnBaseEVs.GRAVELER, "0075"),
    GOLEM(PkmnBaseStats.GOLEM, PkmnBaseEVs.GOLEM, "0076"),
    PONYTA(PkmnBaseStats.PONYTA, PkmnBaseEVs.PONYTA, "0077"),
    RAPIDASH(PkmnBaseStats.RAPIDASH, PkmnBaseEVs.RAPIDASH, "0078"),
    SLOWPOKE(PkmnBaseStats.SLOWPOKE, PkmnBaseEVs.SLOWPOKE, "0079"),
    SLOWBRO(PkmnBaseStats.SLOWBRO, PkmnBaseEVs.SLOWBRO, "0080"),
    MAGNEMITE(PkmnBaseStats.MAGNEMITE, PkmnBaseEVs.MAGNEMITE, "0081"),
    MAGNETON(PkmnBaseStats.MAGNETON, PkmnBaseEVs.MAGNETON, "0082"),
    FARFETCHD(PkmnBaseStats.FARFETCHD, PkmnBaseEVs.FARFETCHD, "0083"),
    DODUO(PkmnBaseStats.DODUO, PkmnBaseEVs.DODUO, "0084"),
    DODRIO(PkmnBaseStats.DODRIO, PkmnBaseEVs.DODRIO, "0085"),
    SEEL(PkmnBaseStats.SEEL, PkmnBaseEVs.SEEL, "0086"),
    DEWGONG(PkmnBaseStats.DEWGONG, PkmnBaseEVs.DEWGONG, "0087"),
    GRIMER(PkmnBaseStats.GRIMER, PkmnBaseEVs.GRIMER, "0088"),
    MUK(PkmnBaseStats.MUK, PkmnBaseEVs.MUK, "0089"),
    SHELLDER(PkmnBaseStats.SHELLDER, PkmnBaseEVs.SHELLDER, "0090"),
    CLOYSTER(PkmnBaseStats.CLOYSTER, PkmnBaseEVs.CLOYSTER, "0091"),
    GASTLY(PkmnBaseStats.GASTLY, PkmnBaseEVs.GASTLY, "0092"),
    HAUNTER(PkmnBaseStats.HAUNTER, PkmnBaseEVs.HAUNTER, "0093"),
    GENGAR(PkmnBaseStats.GENGAR, PkmnBaseEVs.GENGAR, "0094"),
    ONIX(PkmnBaseStats.ONIX, PkmnBaseEVs.ONIX, "0095"),
    DROWZEE(PkmnBaseStats.DROWZEE, PkmnBaseEVs.DROWZEE, "0096"),
    HYPNO(PkmnBaseStats.HYPNO, PkmnBaseEVs.HYPNO, "0097"),
    KRABBY(PkmnBaseStats.KRABBY, PkmnBaseEVs.KRABBY, "0098"),
    KINGLER(PkmnBaseStats.KINGLER, PkmnBaseEVs.KINGLER, "0099"),
    VOLTORB(PkmnBaseStats.VOLTORB, PkmnBaseEVs.VOLTORB, "0100"),
    ELECTRODE(PkmnBaseStats.ELECTRODE, PkmnBaseEVs.ELECTRODE, "0101"),
    EXEGGCUTE(PkmnBaseStats.EXEGGCUTE, PkmnBaseEVs.EXEGGCUTE, "0102"),
    EXEGGUTOR(PkmnBaseStats.EXEGGUTOR, PkmnBaseEVs.EXEGGUTOR, "0103"),
    CUBONE(PkmnBaseStats.CUBONE, PkmnBaseEVs.CUBONE, "0104"),
    MAROWAK(PkmnBaseStats.MAROWAK, PkmnBaseEVs.MAROWAK, "0105"),
    HITMONLEE(PkmnBaseStats.HITMONLEE, PkmnBaseEVs.HITMONLEE, "0106"),
    HITMONCHAN(PkmnBaseStats.HITMONCHAN, PkmnBaseEVs.HITMONCHAN, "0107"),
    LICKITUNG(PkmnBaseStats.LICKITUNG, PkmnBaseEVs.LICKITUNG, "0108"),
    KOFFING(PkmnBaseStats.KOFFING, PkmnBaseEVs.KOFFING, "0109"),
    WEEZING(PkmnBaseStats.WEEZING, PkmnBaseEVs.WEEZING, "0110"),
    RHYHORN(PkmnBaseStats.RHYHORN, PkmnBaseEVs.RHYHORN, "0111"),
    RHYDON(PkmnBaseStats.RHYDON, PkmnBaseEVs.RHYDON, "0112"),
    CHANSEY(PkmnBaseStats.CHANSEY, PkmnBaseEVs.CHANSEY, "0113"),
    TANGELA(PkmnBaseStats.TANGELA, PkmnBaseEVs.TANGELA, "0114"),
    KANGASKHAN(PkmnBaseStats.KANGASKHAN, PkmnBaseEVs.KANGASKHAN, "0115"),
    HORSEA(PkmnBaseStats.HORSEA, PkmnBaseEVs.HORSEA, "0116"),
    SEADRA(PkmnBaseStats.SEADRA, PkmnBaseEVs.SEADRA, "0117"),
    GOLDEEN(PkmnBaseStats.GOLDEEN, PkmnBaseEVs.GOLDEEN, "0118"),
    SEAKING(PkmnBaseStats.SEAKING, PkmnBaseEVs.SEAKING, "0119"),
    STARYU(PkmnBaseStats.STARYU, PkmnBaseEVs.STARYU, "0120"),
    STARMIE(PkmnBaseStats.STARMIE, PkmnBaseEVs.STARMIE, "0121"),
    MR_MIME(PkmnBaseStats.MR_MIME, PkmnBaseEVs.MR_MIME, "0122"),
    SCYTHER(PkmnBaseStats.SCYTHER, PkmnBaseEVs.SCYTHER, "0123"),
    JYNX(PkmnBaseStats.JYNX, PkmnBaseEVs.JYNX, "0124"),
    ELECTABUZZ(PkmnBaseStats.ELECTABUZZ, PkmnBaseEVs.ELECTABUZZ, "0125"),
    MAGMAR(PkmnBaseStats.MAGMAR, PkmnBaseEVs.MAGMAR, "0126"),
    PINSIR(PkmnBaseStats.PINSIR, PkmnBaseEVs.PINSIR, "0127"),
    TAUROS(PkmnBaseStats.TAUROS, PkmnBaseEVs.TAUROS, "0128"),
    MAGIKARP(PkmnBaseStats.MAGIKARP, PkmnBaseEVs.MAGIKARP, "0129"),
    GYARADOS(PkmnBaseStats.GYARADOS, PkmnBaseEVs.GYARADOS, "0130"),
    LAPRAS(PkmnBaseStats.LAPRAS, PkmnBaseEVs.LAPRAS, "0131"),
    DITTO(PkmnBaseStats.DITTO, PkmnBaseEVs.DITTO, "0132"),
    EEVEE(PkmnBaseStats.EEVEE, PkmnBaseEVs.EEVEE, "0133"),
    VAPOREON(PkmnBaseStats.VAPOREON, PkmnBaseEVs.VAPOREON, "0134"),
    JOLTEON(PkmnBaseStats.JOLTEON, PkmnBaseEVs.JOLTEON, "0135"),
    FLAREON(PkmnBaseStats.FLAREON, PkmnBaseEVs.FLAREON, "0136"),
    PORYGON(PkmnBaseStats.PORYGON, PkmnBaseEVs.PORYGON, "0137"),
    OMANYTE(PkmnBaseStats.OMANYTE, PkmnBaseEVs.OMANYTE, "0138"),
    OMASTAR(PkmnBaseStats.OMASTAR, PkmnBaseEVs.OMASTAR, "0139"),
    KABUTO(PkmnBaseStats.KABUTO, PkmnBaseEVs.KABUTO, "0140"),
    KABUTOPS(PkmnBaseStats.KABUTOPS, PkmnBaseEVs.KABUTOPS, "0141"),
    AERODACTYL(PkmnBaseStats.AERODACTYL, PkmnBaseEVs.AERODACTYL, "0142"),
    SNORLAX(PkmnBaseStats.SNORLAX, PkmnBaseEVs.SNORLAX, "0143"),
    ARTICUNO(PkmnBaseStats.ARTICUNO, PkmnBaseEVs.ARTICUNO, "0144"),
    ZAPDOS(PkmnBaseStats.ZAPDOS, PkmnBaseEVs.ZAPDOS, "0145"),
    MOLTRES(PkmnBaseStats.MOLTRES, PkmnBaseEVs.MOLTRES, "0146"),
    DRATINI(PkmnBaseStats.DRATINI, PkmnBaseEVs.DRATINI, "0147"),
    DRAGONAIR(PkmnBaseStats.DRAGONAIR, PkmnBaseEVs.DRAGONAIR, "0148"),
    DRAGONITE(PkmnBaseStats.DRAGONITE, PkmnBaseEVs.DRAGONITE, "0149"),
    MEWTWO(PkmnBaseStats.MEWTWO, PkmnBaseEVs.MEWTWO, "0150"),
    MEW(PkmnBaseStats.MEW, PkmnBaseEVs.MEW, "0151");

    private final PkmnBaseStats baseStats;
    private final PkmnBaseEVs baseEVs;
    private final BufferedImage front;
    private final BufferedImage back;

    PkmnSpecies(PkmnBaseStats baseStats, PkmnBaseEVs baseEVs, String number) {
        this.baseStats = baseStats;
        this.baseEVs = baseEVs;
        try {
            this.front = ImageIO.read(getClass().getClassLoader().getResource("images/pkmnFronts/" + number + ".png"));
            this.back = ImageIO.read(getClass().getClassLoader().getResource("images/pkmnBacks/" + number + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
