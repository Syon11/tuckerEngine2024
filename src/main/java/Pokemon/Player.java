package Pokemon;

import Engine.*;
import Engine.Utility.Vector;

public class Player extends ControllableEntity {
    private static final String SPRITE_PATH = "images/trainer.png";
    private static final int ANIMATION_SPEED = 8;
    private static final int SPEED = 3;
    private static final int RUNSPEED = 8;

    public Player(MovementController controller, Vector size, Sprite sprite) {
        super(controller, size, sprite);
        resize(size.getX(), size.getY());
        teleport(100,100);
        setSpeed(SPEED);
        load();
    }

    public Player(MovementController controller) {
        super(controller, new Vector(32, 32), new Sprite(SPRITE_PATH, 4, 3, ANIMATION_SPEED));
        resize(size.getX(), size.getY());
        teleport(100, 100);
        setSpeed(SPEED);
        load();
    }

    public void update(GameState gameState) {
        super.update();
        if (gameState == GameState.MOVING) {
            moveWithController();
            sprite.update(hasMoved());
        }
    }

    public void draw(Canvas canvas) {
        sprite.draw(getDirection(), canvas, screenOffsetX, screenOffsetY);
    }

    public Vector getWorldPosition() {
        return new Vector(worldX, worldY);
    }

    public Vector getPlayerPosition() { return new Vector(worldX + screenOffsetX, worldY + screenOffsetY); }

    private void load() {
        sprite.load();
        screenOffsetX = (Screen.getWidth() - size.getX()) / 2;
        screenOffsetY = (Screen.getHeight() - size.getY()) / 2;
    }



}
