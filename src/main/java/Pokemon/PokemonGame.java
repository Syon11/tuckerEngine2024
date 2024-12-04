package Pokemon;

import Engine.Canvas;
import Engine.Game;
import Engine.RenderingEngine;
import Engine.Screen;
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
        if (gameState == GameState.DIALOGUE_IDLE) {
            handleIdleDialogue();
        }
        if (gameState == GameState.DIALOGUE_TYPING) {
            handleTypingDialogue();
        }
        if (gameState == GameState.MOVING) {
            world.update(player.getWorldPosition());
            if (gamePad.isMenuKeyPressed()) {
                ArrayList<String> strings = new ArrayList<>();
                strings.add("This is a test dialogue");
                strings.add("With multiple texts of varying lenghts");
                strings.add("And no Lorem Ipsum, we promise");
                dialogue = new Dialogue(strings, 4);
                gameState = GameState.DIALOGUE_TYPING;
            }
        }


    }

    @Override
    protected void draw(Canvas canvas) {
        canvas.drawRectangle(0, 0, Screen.getWidth(), Screen.getHeight(), Color.BLUE);
        world.drawBackground(canvas, player.getWorldPosition());
        player.draw(canvas);
        world.drawForeground(canvas, player.getWorldPosition());
        player.drawHitbox(canvas);
        if (gameState == GameState.DIALOGUE_TYPING || gameState == GameState.DIALOGUE_IDLE) {
            dialogue.Draw(canvas);
        }
    }

    private void handleTypingDialogue() {
        dialogue.update();
        if (gamePad.isCancelKeyPressed()) {
            dialogue.skipDialogue();
        }
        if (dialogue.isAtLineEnd()){
            gameState = GameState.DIALOGUE_IDLE;
        }
    }

    private void handleIdleDialogue() {
        dialogue.update();
        if(gamePad.isAcceptKeyPressed()){
            if (dialogue.isAtDialogueEnd()){
                gameState = GameState.MOVING;
            } else {
                dialogue.nextLine();
                gameState = GameState.DIALOGUE_TYPING;
            }
        }

    }
}
