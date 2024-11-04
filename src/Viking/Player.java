package Viking;

import Engine.*;
import Engine.Canvas;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Player extends ControllableEntity {
    private static final String SPRITE_PATH = "images/Trainer.png";
    private static final int ANIMATION_SPEED = 8;

    private Sprite spritee = new Sprite(SPRITE_PATH, 4, 3);


    public Player(MovementController controller) {
        super(controller);
        resize(32, 32);
        setSpeed(3);
        load();
    }

    public void update() {
        super.update();
        moveWithController();
        spritee.update(hasMoved());
    }

    public void draw(Canvas canvas) {
        spritee.draw(getDirection(), canvas, x, y);
    }

    private void load() {
        spritee.load();
    }

}
