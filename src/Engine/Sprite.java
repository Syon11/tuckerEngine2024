package Engine;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Sprite {
    private BufferedImage spritesheet;
    private final String SPRITE_PATH;
    private final int ANIMATION_SPEED = 8;
    private final int IDLE_FRAME = 1;
    private int width;
    private int height;
    private int rows;
    private int cols;
    private Image[][] AnimationFrames;
    private int currentFrame = 1;
    private int nextFrame = 8;
    private int modifier = 1;

    public Sprite(String spritePath, int rows, int cols) {
        this.SPRITE_PATH = spritePath;
        this.rows = rows;
        this.cols = cols;
    }

    public void load() {
        try {
            loadSpriteSheet();
            this.width = spritesheet.getWidth() / cols;
            this.height = spritesheet.getHeight() / rows;
            loadAnimationFrames();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadSpriteSheet() throws IOException{
        spritesheet = ImageIO.read(getClass().getClassLoader().getResource(SPRITE_PATH));
    }

    public void loadAnimationFrames() {
        AnimationFrames = new Image[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                AnimationFrames[i][j] = spritesheet.getSubimage(j * width, i * height, width, height);
            }
        }
    }

    public void update(boolean hasMoved) {
        if (hasMoved){
            --nextFrame;
            if (nextFrame <= 0) {
                nextFrame = ANIMATION_SPEED;
                currentFrame += modifier;
                if (currentFrame >= cols - 1 || currentFrame <= 0) {
                    modifier *= -1;
                }
            }
        } else {
            currentFrame = IDLE_FRAME;
        }
    }

    public void draw(Direction direction, Canvas canvas, int x, int y) {
        if (direction == Direction.RIGHT) {
            canvas.drawImage(AnimationFrames[3][currentFrame], x, y);
        }
        if (direction == Direction.LEFT) {
            canvas.drawImage(AnimationFrames[2][currentFrame], x, y);
        }
        if (direction == Direction.UP) {
            canvas.drawImage(AnimationFrames[0][currentFrame], x, y);
        }
        if (direction == Direction.DOWN) {
            canvas.drawImage(AnimationFrames[1][currentFrame], x, y);
        }
        ;
    }

}
