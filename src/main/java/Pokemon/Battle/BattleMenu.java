package Pokemon.Battle;

import Engine.Canvas;
import Pokemon.Enums.BattleState;
import Pokemon.GamePad;
import Pokemon.Moves.PkmnAction;
import Pokemon.Player;
import Pokemon.Model.Pokemon;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class BattleMenu {

    private PkmnAction[] actions = new PkmnAction[4];
    private List<Pokemon> party;

    public BattleMenu(Player player) {
        player.getCurrentPokemon().getMoves().toArray(actions);
        party = player.getParty();
    }

    public int getMenuSelection(GamePad gamePad, boolean buttonDebounce) {
        if (!buttonDebounce) {
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
        }
        return 0;
    }

    public void refreshActions(Pokemon pokemon) {
        actions = new PkmnAction[4];
        pokemon.getMoves().toArray(actions);
    }

    public void draw(Canvas canvas, BattleState battleState) {
        switch (battleState) {
            case SELECT_ACTION:
                canvas.drawString("1. Fight", 200, 200, Color.WHITE); //600 400
                canvas.drawString("2. Bag", 200, 210, Color.WHITE); // 600 410
                canvas.drawString("3. Pokemon", 200, 220, Color.WHITE); // 600 420
                canvas.drawString("4. Run", 200, 230, Color.WHITE); // 600 430
                break;
            case SELECT_MOVE:
                for (int i = 0; i < actions.length; i++) {
                    if (actions[i] == null) {
                        break;
                    }
                    canvas.drawString((i + 1) + ". " + actions[i].getName(), 200, 200 + (i * 10), actions[i].getRemainingPP() > 0 ? Color.WHITE : Color.RED);
                }
                break;
            case SELECT_ITEM:
                canvas.drawString("1. Pokeball", 200, 200, Color.WHITE);
                canvas.drawString("2. Potion", 200, 210, Color.WHITE);
                break;
            case SELECT_POKEMON:
                for (int i = 0; i < party.size(); i++) {
                    canvas.drawString( (i + 1) + ". " + party.get(i).getName(), 200, 200 + (i * 10), party.get(i).getCurrentHealth() > 0 ? Color.WHITE : Color.RED);
                }
        }
    }
}
