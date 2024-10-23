package Viking;

import Engine.Canvas;
import Engine.StaticEntity;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Tree extends StaticEntity {
    private static final String imagePath = "images/tree.png";

    private Image image;

    public Tree() {
        load();
        teleport(300, 300);
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
        canvas.drawImage(image, x, y);
    }
}
