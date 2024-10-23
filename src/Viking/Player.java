package Viking;

import Engine.Canvas;
import Engine.ControllableEntity;
import Engine.MovementController;
import MovingRectangle.GamePad;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Player extends ControllableEntity {
    private static final String SPRITE_PATH = "images/player.png";
    private BufferedImage sprite;
    private Image[] rightFrames;
    private Image[] leftFrames;
    private Image[] upFrames;
    private Image[] downFrames;

    public Player(MovementController controller) {
        super(controller);
        resize(32, 32);
        setSpeed(3);
        load();
    }

    public void update() {
        super.update();
        moveWithController();
    }

    public void draw(Canvas canvas) {
        canvas.drawImage(downFrames[1], x, y);
    }

    private void load() {
        loadSpriteSheet();
        loadAnimationFrames();
    }

    private void loadSpriteSheet() {
        try {
            sprite = ImageIO.read(
                    getClass().getClassLoader().getResourceAsStream(SPRITE_PATH)
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadAnimationFrames() {
        downFrames = new Image[3];
        downFrames[0] = sprite.getSubimage(0, 128, 32, 32);
        downFrames[1] = sprite.getSubimage(32, 128, 32, 32);
        downFrames[2] = sprite.getSubimage(64, 128, 32, 32);
        rightFrames = new Image[3];
        rightFrames[0] = sprite.getSubimage(0, 192, 32, 32);
        rightFrames[1] = sprite.getSubimage(32, 192, 32, 32);
        rightFrames[2] = sprite.getSubimage(64, 192, 32, 32);
        upFrames = new Image[3];
        upFrames[0] = sprite.getSubimage(0, 224, 32, 32);
        upFrames[1] = sprite.getSubimage(32, 224, 32, 32);
        upFrames[2] = sprite.getSubimage(64, 224, 32, 32);
        leftFrames = new Image[3];
        leftFrames[0] = sprite.getSubimage(0, 160, 32, 32);
        leftFrames[1] = sprite.getSubimage(32, 160, 32, 32);
        leftFrames[2] = sprite.getSubimage(64, 160, 32, 32);
    }
}
