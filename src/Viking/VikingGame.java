package Viking;

import Engine.Canvas;
import Engine.Game;

public class VikingGame extends Game {
    private Player player;
    private GamePad gamepad;
    private World world;

    @Override
    protected void initialize() {
        gamepad = new GamePad();
        player = new Player(gamepad);
        world = new World();
        world.load();
    }

    @Override
    protected void update() {
        if (gamepad.isQuitPressed()) {
            stop();
        }
        if (gamepad.isFirePressed()) {
            // Fire
        }
        player.update();
    }

    @Override
    protected void draw(Canvas canvas) {
        world.draw(canvas);
        player.draw(canvas);
    }
}
