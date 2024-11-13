package Viking;

import Engine.Canvas;
import Engine.StaticEntity;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Tree extends StaticEntity {
    private static final String imagePath = "images/tree.png";

    private Image image;
    private Blockade blockade;

    public Tree(int x, int y) {
        load();
        teleport(x, y);
        blockade = new Blockade();
        blockade.resize(30, 16);
    }

    public void blockadeFromBottom() {
        blockade.teleport(worldX +16, worldY+48);

    }

    public void blockadeFromTop() {
        blockade.teleport(worldX +16, worldY+32);
    }

    public void load() {
        try {
            image = ImageIO.read(
                    getClass().getClassLoader().getResourceAsStream(imagePath)
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Canvas canvas) {
        canvas.drawImage(image, worldX, worldY);
        if (GameConfig.isDebugEnabled()) {
            blockade.draw(canvas);
        }
    }
}
