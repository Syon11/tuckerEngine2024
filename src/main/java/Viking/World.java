package Viking;

import Engine.Canvas;
import Engine.Map;
import Engine.TileSet;
import Engine.Utility.Vector;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class World {
    private static final String mapPath = "images/demo.png";

    private Image background;
    private Map map;

    public void load() {

        map = new Map("maps/Level_0.ldtkl", new TileSet(16, 16, 1, 1, 1, "images/tileset.png"));

    }

    public void update(Vector worldPosition) {
        map.update(worldPosition);
    }

    public void draw(Canvas canvas, Vector worldPosition) {
        map.drawEarly(canvas, worldPosition);
        map.drawLate(canvas, worldPosition);
        canvas.drawString("World PositionX: " + worldPosition.getX(), 10, 10, Color.WHITE);
        canvas.drawString("World PositionY: " + worldPosition.getY(), 10, 20, Color.WHITE);
    }
}
