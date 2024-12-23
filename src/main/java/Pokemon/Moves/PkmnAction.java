package Pokemon.Moves;

import Pokemon.Enums.PkmnMoveTarget;
import Pokemon.Enums.PkmnMoveTypes;
import Pokemon.Enums.PkmnMoves;
import Pokemon.Enums.PkmnTypes;
import Pokemon.Model.Pokemon;

public class PkmnAction {

    private PkmnMoves move;
    private int remainingPP;

    public PkmnAction(PkmnMoves move){
        this.move = move;
    }

    public void act(Pokemon attacker, Pokemon target){
        if (this.move.getTarget() == PkmnMoveTarget.BOTH) {
            handleEffects(attacker);
            handleDamage(attacker, attacker, true);
            handleEffects(target);
            handleDamage(attacker, target, false);
        } else if (this.move.getTarget() == PkmnMoveTarget.OPPONENT) {
            handleEffects(target);
            handleDamage(attacker, target, false);
        } else {
            handleEffects(attacker);
        }
    }

    public String getName() {
        return move.getName();
    }

    public int getRemainingPP() {
        return remainingPP;
    }

    public int getMaxPP() {
        return move.getMaxPP();
    }

    public void setReaminingPP(int pp) {
        this.remainingPP = pp;
    }

    private void handleEffects(Pokemon pokemon) {
        if (move.getStatus() != null) {
            if (move.getStatusChance() > Math.random() * 100) {
                pokemon.setStatus(move.getStatus());
            }
        } if (move.getSoftStatuses().stream().count() > 0) {
            for (int i = 0; i < move.getSoftStatuses().size(); i++) {
                if (move.getStatusChance() > Math.random() * 100) {
                    pokemon.addSoftStatus(move.getSoftStatuses().get(i));
                }
            }
        }
    }

    private void handleDamage(Pokemon attacker, Pokemon target, boolean isAttacker) {
        if (move.getPower() > 0) {
            int damage = calculateDamage(attacker, target, isAttacker);
            target.takeDamage(damage);
        }
    }

    private int calculateDamage(Pokemon attacker, Pokemon target, boolean isAttacker) {
        if (isAttacker){
            return attacker.getMaxHealth() / 8;
        }
        int level = attacker.getLevel();
        int attack = move.getMoveType() == PkmnMoveTypes.PHYSICAL ? attacker.getAttack() : attacker.getSpAtk();
        int defense = move.getMoveType() == PkmnMoveTypes.PHYSICAL ? target.getDefense() : target.getSpDef();
        int power = move.getPower();
        boolean isSTAB = attacker.getType().contains(move.getPkmnType());
        double modifier = isSTAB ? 1.5 : 1;
        modifier = modifier * (Math.random() * (1 - 0.85) + 0.85);
        for (PkmnTypes type : target.getType()){
            modifier = modifier * move.getPkmnType().getModifier(type);
        }
        double damage = ((((((2 * (double)level ) / 5) + 2) * power * ((double)attack / (double)defense)) /50) + 2) * modifier;
        return (int)damage;

    }
}
