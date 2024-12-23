package Pokemon;

import Engine.Canvas;
import Engine.Game;
import Engine.RenderingEngine;
import Engine.Screen;
import Pokemon.Battle.Battle;
import Pokemon.EncounterTables.Encounter;
import Pokemon.Enums.Encounters;
import Pokemon.Enums.GameState;
import Viking.GameConfig;

import java.awt.*;
import java.util.ArrayList;

public class PokemonGame extends Game {

    private Player player;
    private GamePad gamePad;
    private World world;
    private GameState gameState;
    private Dialogue dialogue;
    private Battle battle;

    @Override
    protected void initialize() {
        GameConfig.setDebugEnabled(true);
        gamePad = new GamePad();
        player = new Player(gamePad);
        world = new World();
        world.load();
        RenderingEngine.getInstance().getScreen().fullscreen();
        RenderingEngine.getInstance().getScreen().hideCursor();
        gameState = GameState.MOVING;
    }

    @Override
    protected void update() {
        if (gamePad.isQuitKeyPressed()) {
            stop();
        }
        player.update(gameState);
        if (gameState == GameState.DIALOGUE) {
            dialogue.update();
            gameState = dialogue.handle(gamePad);

        }
        if (gameState == GameState.MOVING) {
            world.update(player.getWorldPosition());
            if (player.hasMoved()){
                checkEncounters();

            }
            if (gamePad.isMenuKeyPressed()) {
                ArrayList<String> strings = new ArrayList<>();
                strings.add("This is a test dialogue");
                strings.add("With multiple texts of varying lenghts");
                strings.add("And no Lorem Ipsum, we promise");
                dialogue = new Dialogue(strings, 4);
                gameState = GameState.DIALOGUE;
            }
        }
        if (gameState == GameState.BATTLE) {

        }
    }

    private void checkEncounters() {
        ArrayList<Encounter> enc = new ArrayList<>();

        enc.add(Encounters.CAVE.checkEncounter(player.getPlayerPosition()));
        enc.add(Encounters.FOREST.checkEncounter(player.getPlayerPosition()));
        enc.add(Encounters.GRASSLAND.checkEncounter(player.getPlayerPosition()));
        enc.add(Encounters.RIVER.checkEncounter(player.getPlayerPosition()));
        enc.add(Encounters.MARSH.checkEncounter(player.getPlayerPosition()));
        enc.add(Encounters.MOUNTAIN.checkEncounter(player.getPlayerPosition()));

        for (Encounter e : enc) {
            if (e != null) {
                ArrayList<String> strings = new ArrayList<>();
                strings.add(e.getSpecies().name());
                dialogue = new Dialogue(strings, 4);
                gameState = GameState.DIALOGUE;
            }
        }
        enc.clear();
    }

    @Override
    protected void draw(Canvas canvas) {
        canvas.drawRectangle(0, 0, Screen.getWidth(), Screen.getHeight(), Color.BLUE);
        world.drawBackground(canvas, player.getWorldPosition());
        player.draw(canvas);
        world.drawForeground(canvas, player.getWorldPosition());
        if (gameState == GameState.DIALOGUE) {
            dialogue.Draw(canvas);
        }
        if (gameState == GameState.BATTLE) {
            //battle.draw(canvas);
        }
    }

}
