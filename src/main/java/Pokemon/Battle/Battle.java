package Pokemon.Battle;

import Engine.Canvas;
import Pokemon.Enums.BattleState;
import Pokemon.Model.Pokemon;
import Pokemon.Player;
import Pokemon.GamePad;

import java.awt.*;
import java.util.ArrayList;

public class Battle {
    private Player player;
    private ArrayList<Pokemon> opponentParty;
    private int playerAction;
    private int selectedMove;
    private GamePad gamePad;
    private int opponentIndex;
    private boolean isBattleLost = false;
    private boolean isBattleDone = false;
    private BattleMenu battleMenu;
    private BattleState battleState;

    public Battle(Player player, ArrayList<Pokemon> opponentParty, GamePad gamepad) {
        this.player = player;
        this.opponentParty = opponentParty;
        opponentIndex = 0;
        battleMenu = new BattleMenu(player);
        this.gamePad = gamepad;
        battleState = BattleState.INIT;
    }

    public void update() {
        if (player.getCurrentPokemon().getCurrentHealth() <= 0) {
            if (player.getParty().stream().anyMatch(pokemon -> pokemon.getCurrentHealth() > 0)) {
                player.setCurrentPokemon(player.getParty().stream().filter(pokemon -> pokemon.getCurrentHealth() > 0).findFirst().get());
            } else {
                isBattleLost = true;
                isBattleDone = true;
            }
        }
        if (opponentParty.get(opponentIndex).getCurrentHealth() <= 0) {
            if (opponentParty.stream().anyMatch(pokemon -> pokemon.getCurrentHealth() > 0)) {
                opponentIndex = opponentParty.indexOf(opponentParty.stream().filter(pokemon -> pokemon.getCurrentHealth() > 0).findFirst().get());
            } else {
                isBattleDone = true;
            }
        }
        if (!isBattleDone) {
            if (battleState == BattleState.INIT) {
                if (player.getCurrentPokemon().getSpeed() > opponentParty.get(opponentIndex).getSpeed()) {
                    battleState = BattleState.SELECT_ACTION;
                }
            }
            if(battleState == BattleState.SELECT_ACTION) {
                playerAction = battleMenu.getBattleAction(gamePad);
                switch (playerAction) {
                    case 1:
                        battleState = BattleState.SELECT_MOVE;
                        break;
                    case 2:
                        battleState = BattleState.SELECT_ITEM;
                        break;
                    case 3:
                        battleState = BattleState.SELECT_POKEMON;
                        break;
                    case 4:
                        battleState = BattleState.ATTEMPT_ESCAPE;
                        break;
                }
            }
            if (battleState == BattleState.SELECT_MOVE) {
                selectedMove = battleMenu.getMoveSelection(gamePad);
                if (selectedMove != 0) {
                    if (player.getCurrentPokemon().getMoves().get(selectedMove).getRemainingPP() == 0) {
                        battleState = BattleState.SELECT_MOVE;
                    } else {
                        player.getCurrentPokemon().getMoves().get(selectedMove).act(player.getCurrentPokemon(), opponentParty.get(opponentIndex));
                        player.getCurrentPokemon().getMoves().get(selectedMove).setReaminingPP(player.getCurrentPokemon().getMoves().get(selectedMove).getRemainingPP() - 1);
                        battleState = BattleState.OPPONENT_TURN;
                    }
                }
            }
            if (battleState == BattleState.OPPONENT_TURN) {
                opponentParty.get(opponentIndex).getMoves().get((int) (Math.random() * 4)).act(opponentParty.get(opponentIndex), player.getCurrentPokemon());
            }
        }
    }

    public void draw(Canvas canvas) {
        canvas.drawRectangle(0,0, 800, 600, Color.BLACK);
        canvas.drawString("Battle Screen", 10, 10, Color.WHITE);
        battleMenu.draw(canvas, battleState);
    }

    public boolean isBattleLost() {
        return isBattleLost;
    }

}
