package Viking;

import Engine.Canvas;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class World {
    private static final String mapPath = "images/demo.png";

    private Image background;

    public void load() {
        try {
            background = ImageIO.read(
                    getClass().getClassLoader().getResourceAsStream(mapPath)
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Canvas canvas) {
        canvas.drawImage(background, 0, -64);
    }
}
