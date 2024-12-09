package Pokemon.Enums;

public enum PkmnBaseStats {
    BULBASAUR(64,45, 49, 49, 65, 65, 45, PkmnTypes.GRASS, PkmnTypes.POISON),
    IVYSAUR(142,60, 62, 63, 80, 80, 60, PkmnTypes.GRASS, PkmnTypes.POISON),
    VENUSAUR(263,80, 82, 83, 100, 100, 80, PkmnTypes.GRASS, PkmnTypes.POISON),
    CHARMANDER(62,39, 52, 43, 60, 50, 65, PkmnTypes.FIRE),
    CHARMELEON(142,58, 64, 58, 80, 65, 80, PkmnTypes.FIRE),
    CHARIZARD(267,78, 84, 78, 109, 85, 100, PkmnTypes.FIRE, PkmnTypes.FLYING),
    SQUIRTLE(63,44, 48, 65, 50, 64, 43, PkmnTypes.WATER),
    WARTORTLE(142,59, 63, 80, 65, 80, 58, PkmnTypes.WATER),
    BLASTOISE(265,79, 83, 100, 85, 105, 78, PkmnTypes.WATER),
    CATERPIE(39,45, 30, 35, 20, 20, 45, PkmnTypes.BUG),
    METAPOD(72,50, 20, 55, 25, 25, 30, PkmnTypes.BUG),
    BUTTERFREE(198,60, 45, 50, 90, 80, 70, PkmnTypes.BUG, PkmnTypes.FLYING),
    WEEDLE(39,40, 35, 30, 20, 20, 50, PkmnTypes.BUG, PkmnTypes.POISON),
    KAKUNA(72,45, 25, 50, 25, 25, 35, PkmnTypes.BUG, PkmnTypes.POISON),
    BEEDRILL(198,65, 80, 40, 45, 80, 75, PkmnTypes.BUG, PkmnTypes.POISON),
    PIDGEY(50,40, 45, 40, 35, 35, 56, PkmnTypes.NORMAL, PkmnTypes.FLYING),
    PIDGEOTTO(122,63, 60, 55, 50, 50, 71, PkmnTypes.NORMAL, PkmnTypes.FLYING),
    PIDGEOT(240,83, 80, 75, 70, 70, 91, PkmnTypes.NORMAL, PkmnTypes.FLYING),
    RATTATA(51,30, 56, 35, 25, 35, 72, PkmnTypes.NORMAL),
    RATICATE(145,55, 81, 60, 50, 70, 97, PkmnTypes.NORMAL),
    SPEAROW(52,40, 60, 30, 31, 31, 70, PkmnTypes.NORMAL, PkmnTypes.FLYING),
    FEAROW(155,65, 90, 65, 61, 61, 100, PkmnTypes.NORMAL, PkmnTypes.FLYING),
    EKANS(58,35, 60, 44, 40, 54, 55, PkmnTypes.POISON),
    ARBOK(157,60, 85, 69, 65, 79, 80, PkmnTypes.POISON),
    PIKACHU(112,35, 55, 40, 50, 50, 90, PkmnTypes.ELECTRIC),
    RAICHU(243,60, 90, 55, 90, 80, 110, PkmnTypes.ELECTRIC),
    SANDSHREW(60,50, 75, 85, 20, 30, 40, PkmnTypes.GROUND),
    SANDSLASH(158,75, 100, 110, 45, 55, 65, PkmnTypes.GROUND),
    NIDORANF(55,55, 47, 52, 40, 40, 41, PkmnTypes.POISON),
    NIDORINA(128,70, 62, 67, 55, 55, 56, PkmnTypes.POISON),
    NIDOQUEEN(253,90, 92, 87, 75, 85, 76, PkmnTypes.POISON, PkmnTypes.GROUND),
    NIDORANM(55,46, 57, 40, 40, 40, 50, PkmnTypes.POISON),
    NIDORINO(128,61, 72, 57, 55, 55, 65, PkmnTypes.POISON),
    NIDOKING(253,81, 102, 77, 85, 75, 85, PkmnTypes.POISON, PkmnTypes.GROUND),
    CLEFAIRY(113,70, 45, 48, 60, 65, 35, PkmnTypes.FAIRY),
    CLEFABLE(242,95, 70, 73, 85, 90, 60, PkmnTypes.FAIRY),
    VULPIX(60,38, 41, 40, 50, 65, 65, PkmnTypes.FIRE),
    NINETALES(177,73, 76, 75, 81, 100, 100, PkmnTypes.FIRE),
    JIGGLYPUFF(95,115, 45, 20, 45, 25, 20, PkmnTypes.NORMAL, PkmnTypes.FAIRY),
    WIGGLYTUFF(218,140, 70, 45, 85, 50, 45, PkmnTypes.NORMAL, PkmnTypes.FAIRY),
    ZUBAT(49,40, 45, 35, 30, 40, 55, PkmnTypes.POISON, PkmnTypes.FLYING),
    GOLBAT(159,75, 80, 70, 65, 75, 90, PkmnTypes.POISON, PkmnTypes.FLYING),
    ODDISH(64,45, 50, 55, 75, 65, 30, PkmnTypes.GRASS, PkmnTypes.POISON),
    GLOOM(138,60, 65, 70, 85, 75, 40, PkmnTypes.GRASS, PkmnTypes.POISON),
    VILEPLUME(245,75, 80, 85, 110, 90, 50, PkmnTypes.GRASS, PkmnTypes.POISON),
    PARAS(57, 35, 70, 55, 45, 55, 25, PkmnTypes.BUG, PkmnTypes.GRASS),
    PARASECT(142,60, 95, 80, 60, 80, 30, PkmnTypes.BUG, PkmnTypes.GRASS),
    VENONAT(61,60, 55, 50, 40, 55, 45, PkmnTypes.BUG, PkmnTypes.POISON),
    VENOMOTH(158,70, 65, 60, 90, 75, 90, PkmnTypes.BUG, PkmnTypes.POISON),
    DIGLETT(53,10, 55, 25, 35, 45, 95, PkmnTypes.GROUND),
    DUGTRIO(149,35, 80, 50, 50, 70, 120, PkmnTypes.GROUND),
    MEOWTH(58,40, 45, 35, 40, 40, 90, PkmnTypes.NORMAL),
    PERSIAN(154,65, 70, 60, 65, 65, 115, PkmnTypes.NORMAL),
    PSYDUCK(64,50, 52, 48, 65, 50, 55, PkmnTypes.WATER),
    GOLDUCK(175,80, 82, 78, 95, 80, 85, PkmnTypes.WATER),
    MANKEY(61,40, 80, 35, 35, 45, 70, PkmnTypes.FIGHTING),
    PRIMEAPE(159,65, 105, 60, 60, 70, 95, PkmnTypes.FIGHTING),
    GROWLITHE(70,55, 70, 45, 70, 50, 60, PkmnTypes.FIRE),
    ARCANINE(194,90, 110, 80, 100, 80, 95, PkmnTypes.FIRE),
    POLIWAG(60,40, 50, 40, 40, 40, 90, PkmnTypes.WATER),
    POLIWHIRL(135,65, 65, 65, 50, 50, 90, PkmnTypes.WATER),
    POLIWRATH(255,90, 85, 95, 70, 90, 70, PkmnTypes.WATER, PkmnTypes.FIGHTING),
    ABRA(62,25, 20, 15, 105, 55, 90, PkmnTypes.PSYCHIC),
    KADABRA(140,40, 35, 30, 120, 70, 105, PkmnTypes.PSYCHIC),
    ALAKAZAM(250,55, 50, 45, 135, 85, 120, PkmnTypes.PSYCHIC),
    MACHOP(61,70, 80, 50, 35, 35, 35, PkmnTypes.FIGHTING),
    MACHOKE(142,80, 100, 70, 45, 50, 45, PkmnTypes.FIGHTING),
    MACHAMP(253,90, 130, 80, 65, 85, 55, PkmnTypes.FIGHTING),
    BELLSPROUT(60,50, 75, 35, 70, 30, 40, PkmnTypes.GRASS, PkmnTypes.POISON),
    WEEPINBELL(137,65, 90, 50, 85, 45, 55, PkmnTypes.GRASS, PkmnTypes.POISON),
    VICTREEBEL(245,80, 105, 65, 100, 60, 70, PkmnTypes.GRASS, PkmnTypes.POISON),
    TENTACOOL(67,40, 40, 35, 50, 100, 70, PkmnTypes.WATER, PkmnTypes.POISON),
    TENTACRUEL(180,80, 70, 65, 80, 120, 100, PkmnTypes.WATER, PkmnTypes.POISON),
    GEODUDE(60,40, 80, 100, 30, 30, 20, PkmnTypes.ROCK, PkmnTypes.GROUND),
    GRAVELER(137,55, 95, 115, 45, 45, 35, PkmnTypes.ROCK, PkmnTypes.GROUND),
    GOLEM(248,80, 120, 130, 55, 65, 45, PkmnTypes.ROCK, PkmnTypes.GROUND),
    PONYTA(82,50, 85, 55, 65, 65, 90, PkmnTypes.FIRE),
    RAPIDASH(175,65, 100, 70, 80, 80, 105, PkmnTypes.FIRE),
    SLOWPOKE(63,90, 65, 65, 40, 40, 15, PkmnTypes.WATER, PkmnTypes.PSYCHIC),
    SLOWBRO(172,95, 75, 110, 100, 80, 30, PkmnTypes.WATER, PkmnTypes.PSYCHIC),
    MAGNEMITE(65,25, 35, 70, 95, 55, 45, PkmnTypes.ELECTRIC, PkmnTypes.STEEL),
    MAGNETON(163,50, 60, 95, 120, 70, 70, PkmnTypes.ELECTRIC, PkmnTypes.STEEL),
    FARFETCHD(132,52, 65, 55, 58, 62, 60, PkmnTypes.NORMAL, PkmnTypes.FLYING),
    DODUO(62,35, 85, 45, 35, 35, 75, PkmnTypes.NORMAL, PkmnTypes.FLYING),
    DODRIO(165,60, 110, 70, 60, 60, 100, PkmnTypes.NORMAL, PkmnTypes.FLYING),
    SEEL(65,65, 45, 55, 45, 70, 45, PkmnTypes.WATER),
    DEWGONG(166,90, 70, 80, 70, 95, 70, PkmnTypes.WATER, PkmnTypes.ICE),
    GRIMER(65,80, 80, 50, 40, 50, 25, PkmnTypes.POISON),
    MUK(175,105, 105, 75, 65, 100, 50, PkmnTypes.POISON),
    SHELLDER(61,30, 65, 100, 45, 25, 40, PkmnTypes.WATER),
    CLOYSTER(184,50, 95, 180, 85, 45, 70, PkmnTypes.WATER, PkmnTypes.ICE),
    GASTLY(62,30, 35, 30, 100, 35, 80, PkmnTypes.GHOST, PkmnTypes.POISON),
    HAUNTER(142,45, 50, 45, 115, 55, 95, PkmnTypes.GHOST, PkmnTypes.POISON),
    GENGAR(250,60, 65, 60, 130, 75, 110, PkmnTypes.GHOST, PkmnTypes.POISON),
    ONIX(77,35, 45, 160, 30, 45, 70, PkmnTypes.ROCK, PkmnTypes.GROUND),
    DROWZEE(66,60, 48, 45, 43, 90, 42, PkmnTypes.PSYCHIC),
    HYPNO(169,85, 73, 70, 73, 115, 67, PkmnTypes.PSYCHIC),
    KRABBY(65,30, 105, 90, 25, 25, 50, PkmnTypes.WATER),
    KINGLER(166,55, 130, 115, 50, 50, 75, PkmnTypes.WATER),
    VOLTORB(66,40, 30, 50, 55, 55, 100, PkmnTypes.ELECTRIC),
    ELECTRODE(172,60, 50, 70, 80, 80, 140, PkmnTypes.ELECTRIC),
    EXEGGCUTE(65,60, 40, 80, 60, 45, 40, PkmnTypes.GRASS, PkmnTypes.PSYCHIC),
    EXEGGUTOR(186,95, 95, 85, 125, 65, 55, PkmnTypes.GRASS, PkmnTypes.PSYCHIC),
    CUBONE(64,50, 50, 95, 40, 50, 35, PkmnTypes.GROUND),
    MAROWAK(149,60, 80, 110, 50, 80, 45, PkmnTypes.GROUND),
    HITMONLEE(159,50, 120, 53, 35, 110, 87, PkmnTypes.FIGHTING),
    HITMONCHAN(159,50, 105, 79, 35, 110, 76, PkmnTypes.FIGHTING),
    LICKITUNG(77,90, 55, 75, 60, 75, 30, PkmnTypes.NORMAL),
    KOFFING(68,40, 65, 95, 60, 45, 35, PkmnTypes.POISON),
    WEEZING(172,65, 90, 120, 85, 70, 60, PkmnTypes.POISON),
    RHYHORN(69,80, 85, 95, 30, 30, 25, PkmnTypes.GROUND, PkmnTypes.ROCK),
    RHYDON(170,105, 130, 120, 45, 45, 40, PkmnTypes.GROUND, PkmnTypes.ROCK),
    CHANSEY(395,250, 5, 5, 35, 105, 50, PkmnTypes.NORMAL),
    TANGELA(87,65, 55, 115, 100, 40, 60, PkmnTypes.GRASS),
    KANGASKHAN(172,105, 95, 80, 40, 80, 90, PkmnTypes.NORMAL),
    HORSEA(59,30, 40, 70, 70, 25, 60, PkmnTypes.WATER),
    SEADRA(154,55, 65, 95, 95, 45, 85, PkmnTypes.WATER),
    GOLDEEN(64,45, 67, 60, 35, 50, 63, PkmnTypes.WATER),
    SEAKING(158,80, 92, 65, 65, 80, 68, PkmnTypes.WATER),
    STARYU(68,30, 45, 55, 70, 55, 85, PkmnTypes.WATER),
    STARMIE(182,60, 75, 85, 100, 85, 115, PkmnTypes.WATER, PkmnTypes.PSYCHIC),
    MR_MIME(161,40, 45, 65, 100, 120, 90, PkmnTypes.PSYCHIC, PkmnTypes.FAIRY),
    SCYTHER(100,70, 110, 80, 55, 80, 105, PkmnTypes.BUG, PkmnTypes.FLYING),
    JYNX(159,65, 50, 35, 115, 95, 95, PkmnTypes.ICE, PkmnTypes.PSYCHIC),
    ELECTABUZZ(172,65, 83, 57, 95, 85, 105, PkmnTypes.ELECTRIC),
    MAGMAR(173,65, 95, 57, 100, 85, 93, PkmnTypes.FIRE),
    PINSIR(175,65, 125, 100, 55, 70, 85, PkmnTypes.BUG),
    TAUROS(172,75, 100, 95, 40, 70, 110, PkmnTypes.NORMAL),
    MAGIKARP(40,20, 10, 55, 15, 20, 80, PkmnTypes.WATER),
    GYARADOS(189,95, 125, 79, 60, 100, 81, PkmnTypes.WATER, PkmnTypes.FLYING),
    LAPRAS(187,130, 85, 80, 85, 95, 60, PkmnTypes.WATER, PkmnTypes.ICE),
    DITTO(101,48, 48, 48, 48, 48, 48, PkmnTypes.NORMAL),
    EEVEE(65,55, 55, 50, 45, 65, 55, PkmnTypes.NORMAL),
    VAPOREON(184,130, 65, 60, 110, 95, 65, PkmnTypes.WATER),
    JOLTEON(184,65, 65, 60, 110, 95, 130, PkmnTypes.ELECTRIC),
    FLAREON(184,65, 130, 60, 95, 110, 65, PkmnTypes.FIRE),
    PORYGON(79,65, 60, 70, 85, 75, 40, PkmnTypes.NORMAL),
    OMANYTE(71,35, 40, 100, 90, 55, 35, PkmnTypes.ROCK, PkmnTypes.WATER),
    OMASTAR(173,70, 60, 125, 115, 70, 55, PkmnTypes.ROCK, PkmnTypes.WATER),
    KABUTO(71,30, 80, 90, 55, 45, 55, PkmnTypes.ROCK, PkmnTypes.WATER),
    KABUTOPS(173,60, 115, 105, 65, 70, 80, PkmnTypes.ROCK, PkmnTypes.WATER),
    AERODACTYL(180,80, 105, 65, 60, 75, 130, PkmnTypes.ROCK, PkmnTypes.FLYING),
    SNORLAX(189,160, 110, 65, 65, 110, 30, PkmnTypes.NORMAL),
    ARTICUNO(290,90, 85, 100, 95, 125, 85, PkmnTypes.ICE, PkmnTypes.FLYING),
    ZAPDOS(290,90, 90, 85, 125, 90, 100, PkmnTypes.ELECTRIC, PkmnTypes.FLYING),
    MOLTRES(290,90, 100, 90, 125, 85, 90, PkmnTypes.FIRE, PkmnTypes.FLYING),
    DRATINI(60,41, 64, 45, 50, 50, 50, PkmnTypes.DRAGON),
    DRAGONAIR(147,61, 84, 65, 70, 70, 70, PkmnTypes.DRAGON),
    DRAGONITE(300,91, 134, 95, 100, 100, 80, PkmnTypes.DRAGON, PkmnTypes.FLYING),
    MEWTWO(340,106, 110, 90, 154, 90, 130, PkmnTypes.PSYCHIC),
    MEW(300,100, 100, 100, 100, 100, 100, PkmnTypes.PSYCHIC);


    private final int exp;
    private final int hp;
    private final int attack;
    private final int defense;
    private final int specialAttack;
    private final int specialDefense;
    private final int speed;
    private final PkmnTypes type1;
    private final PkmnTypes type2;

    PkmnBaseStats(int exp, int hp, int attack, int defense, int specialAttack, int specialDefense, int speed, PkmnTypes type1) {
        this.exp = exp;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
        this.type1 = type1;
        this.type2 = null;
    }

    PkmnBaseStats(int exp, int hp, int attack, int defense, int specialAttack, int specialDefense, int speed, PkmnTypes type1, PkmnTypes type2) {
        this.exp = exp;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
        this.type1 = type1;
        this.type2 = type2;
    }

    public int getExp(int level, boolean isTrainerOwned, boolean isOriginalTrainer) {
        return (int) (((exp * level) /7) * (isTrainerOwned ? 1 : 1.5) * (isOriginalTrainer ? 1 : 1.5)); //Ignore the warning, as per docs INTEGER DIVISION is used to round-down.
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }

    public int getSpecialDefense() {
        return specialDefense;
    }

    public int getSpeed() {
        return speed;
    }
}
