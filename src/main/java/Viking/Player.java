package Viking;

import Engine.*;
import Engine.Canvas;
import Engine.Utility.Vector;

public class Player extends ControllableEntity {
    private static final String SPRITE_PATH = "images/trainer.png";
    private static final int ANIMATION_SPEED = 8;
    private int speed = 3;

    private Vector size = new Vector(32, 32);
    private Sprite sprite = new Sprite(SPRITE_PATH, 4, 3, ANIMATION_SPEED);

    private int screenX;
    private int screenY;


    public Player(MovementController controller) {
        super(controller);
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
        sprite.draw(getDirection(), canvas, screenX, screenY);
    }

    public Vector getWorldPosition() {
        return new Vector(worldX, worldY);
    }

    private void load() {
        sprite.load();
        screenX = (Screen.getWidth() - size.getX()) / 2;
        screenY = (Screen.getHeight() - size.getY()) / 2;
    }

}
