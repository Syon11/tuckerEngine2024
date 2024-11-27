package Viking;

import Engine.*;
import Engine.Canvas;
import Engine.Utility.Vector;

import java.awt.*;

public class Player extends ControllableEntity {
    private static final String SPRITE_PATH = "images/trainer.png";
    private static final int ANIMATION_SPEED = 8;
    private int speed = 3;



    public Player(MovementController controller) {
        super(controller, new Vector(32, 32), new Sprite(SPRITE_PATH, 4, 3, ANIMATION_SPEED));
        resize(size.getX(), size.getY());
        teleport(100, 100);
        setSpeed(speed);
        load();
    }

    public void update() {
        super.update();
        moveWithController();
        sprite.update(hasMoved());
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
