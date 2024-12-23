package Pokemon.Battle;

import Engine.Canvas;
import Pokemon.Enums.BattleState;
import Pokemon.Enums.GameState;
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
    private boolean buttonDebounce = false;
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
                return;
            }
        }
        if (opponentParty.get(opponentIndex).getCurrentHealth() <= 0) {
            if (opponentParty.stream().anyMatch(pokemon -> pokemon.getCurrentHealth() > 0)) {
                opponentIndex = opponentParty.indexOf(opponentParty.stream().filter(pokemon -> pokemon.getCurrentHealth() > 0).findFirst().get());
            } else {
                isBattleDone = true;
                return;
            }
        }
        if (!isBattleDone) {
            if (battleState == BattleState.INIT) {
                if (player.getCurrentPokemon().getSpeed() > opponentParty.get(opponentIndex).getSpeed()) {
                    battleState = BattleState.SELECT_ACTION;
                } else {
                    battleState = BattleState.OPPONENT_TURN;
                }
            }
            if(battleState == BattleState.SELECT_ACTION) {
                playerAction = getMenuSelection();
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
                selectedMove = getMenuSelection();
                if (selectedMove > 0 && selectedMove <= player.getCurrentPokemon().getMoves().size()) {
                    if (player.getCurrentPokemon().getMoves().get(selectedMove -1).getRemainingPP() == 0) {
                        battleState = BattleState.SELECT_MOVE;
                    } else {
                        player.getCurrentPokemon().getMoves().get(selectedMove -1).act(player.getCurrentPokemon(), opponentParty.get(opponentIndex));
                        player.getCurrentPokemon().getMoves().get(selectedMove -1).setReaminingPP(player.getCurrentPokemon().getMoves().get(selectedMove -1).getRemainingPP() - 1);
                        battleState = BattleState.OPPONENT_TURN;
                    }
                }
            }
            if (battleState == BattleState.SELECT_ITEM) {
                int selectedItem = getMenuSelection();
                if (selectedItem == 1) {
                    if (player.getParty().size() < 6) {
                        player.addPokemonToParty(opponentParty.get(opponentIndex));
                        isBattleDone = true;
                        return;
                    }
                    battleState = BattleState.OPPONENT_TURN;
                }
                if (selectedItem == 2) {
                    player.getCurrentPokemon().healDamage(20);
                    battleState = BattleState.OPPONENT_TURN;
                }
            }
            if (battleState == BattleState.SELECT_POKEMON) {
                int selectedPokemon = getMenuSelection();
                if (selectedPokemon > 0 && selectedPokemon <= player.getParty().size()) {
                    if (player.getParty().get(selectedPokemon -1).getCurrentHealth() > 0) {
                        player.setCurrentPokemon(player.getParty().get(selectedPokemon-1));
                        battleMenu.refreshActions(player.getCurrentPokemon());
                        battleState = BattleState.SELECT_ACTION;
                    }
                }
            }
            if (battleState == BattleState.ATTEMPT_ESCAPE) {
                if (Math.random() > 0.5) {
                    isBattleDone = true;
                    return;
                } else {
                    battleState = BattleState.OPPONENT_TURN;
                }
            }
            if (battleState == BattleState.OPPONENT_TURN) {
                opponentParty.get(opponentIndex).getMoves().get((int) (Math.random() * opponentParty.get(opponentIndex).getMoves().size())).act(opponentParty.get(opponentIndex), player.getCurrentPokemon());
                battleState = BattleState.SELECT_ACTION;
            }
        }
    }

    public void draw(Canvas canvas) {
        canvas.drawRectangle(0,0, 800, 600, Color.BLACK);
        canvas.drawString("Battle Screen", 10, 10, Color.WHITE);
        battleMenu.draw(canvas, battleState);
        canvas.drawString(player.getCurrentPokemon().getName() + " " + player.getCurrentPokemon().getCurrentHealth() + "/" + player.getCurrentPokemon().getMaxHealth(),100, 100, Color.WHITE);
        canvas.drawString(opponentParty.get(opponentIndex).getName() + " " + opponentParty.get(opponentIndex).getCurrentHealth() + "/" + opponentParty.get(opponentIndex).getMaxHealth(), 100, 120, Color.WHITE);
        canvas.drawString("Battle State: " + battleState, 100, 140, Color.WHITE);
    }

    public boolean isBattleLost() {
        return isBattleLost;
    }

    public boolean isBattleDone() {
        return isBattleDone;
    }

    private int getMenuSelection(){
        if (gamePad.isOnePressed() && !buttonDebounce) {
            buttonDebounce = true;
            return 1;
        }
        if (gamePad.isTwoPressed() && !buttonDebounce) {
            buttonDebounce = true;
            return 2;
        }
        if (gamePad.isThreePressed() && !buttonDebounce) {
            buttonDebounce = true;
            return 3;
        }
        if (gamePad.isFourPressed() && !buttonDebounce) {
            buttonDebounce = true;
            return 4;
        }
        if (!gamePad.isOnePressed() && !gamePad.isTwoPressed() && !gamePad.isThreePressed() && !gamePad.isFourPressed()) {
            buttonDebounce = false;
        }
        return 0;
    }
}
