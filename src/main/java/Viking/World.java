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
    }

    public void drawBackground(Canvas canvas, Vector worldPosition) {
        map.drawEarly(canvas, worldPosition);
    }

    public void drawForeground(Canvas canvas, Vector worldPosition) {
        map.drawLate(canvas, worldPosition);
    }
}
