package Pokemon.Battle;

import Engine.Canvas;
import Pokemon.Enums.BattleState;
import Pokemon.GamePad;
import Pokemon.Moves.PkmnAction;
import Pokemon.Player;
import Pokemon.Model.Pokemon;

import java.awt.*;
import java.util.ArrayList;

public class BattleMenu {

    private PkmnAction[] actions = new PkmnAction[4];
    private ArrayList<Pokemon> party;

    public BattleMenu(Player player) {
        player.getCurrentPokemon().getMoves().toArray(actions);
    }

    public int getBattleAction(GamePad gamePad) {
        if (gamePad.isOnePressed()){
            return 1;
        }
        if (gamePad.isTwoPressed()) {
            return 2;
        }
        if (gamePad.isThreePressed()) {
            return 3;
        }
        if (gamePad.isFourPressed()) {
            return 4;
        }
        return 0;
    }

    public int getMoveSelection(GamePad gamePad) {
        if (gamePad.isOnePressed()) {
            return 1;
        }
        if (gamePad.isTwoPressed()) {
            return 2;
        }
        if (gamePad.isThreePressed()) {
            return 3;
        }
        if (gamePad.isFourPressed()) {
            return 4;
        }
        return 0;
    }


    public void draw(Canvas canvas, BattleState battleState) {
        switch (battleState) {
            case SELECT_ACTION:
                canvas.drawString("1. Fight", 600, 400, Color.WHITE);
                canvas.drawString("2. Bag", 600, 410, Color.WHITE);
                canvas.drawString("3. Pokemon", 600, 420, Color.WHITE);
                canvas.drawString("4. Run", 600, 430, Color.WHITE);
                break;
            case SELECT_MOVE:
                for (int i = 0; i < actions.length; i++) {
                    canvas.drawString((i + 1) + ". " + actions[i].getName(), 400, 400 + (i * 10), actions[i].getRemainingPP() > 0 ? Color.WHITE : Color.RED);
                }
                break;
            case SELECT_ITEM:
                break;
            case SELECT_POKEMON:
                for (int i = 0; i < party.size(); i++) {
                    canvas.drawString( (i + 1) + ". " + party.get(i).getName(), 400, 400 + (i * 10), party.get(i).getCurrentHealth() > 0 ? Color.WHITE : Color.RED);
                }
        }
    }
}
