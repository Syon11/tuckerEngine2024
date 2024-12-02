package Pokemon;

import Engine.Canvas;
import Engine.Map;
import Engine.TileSet;
import Engine.Utility.Vector;

import java.awt.*;

public class World {
    private static final String mapPath = "maps/Level_0.ldtkl";
    private static final String tilesetPath = "images/tileset.png";
    TileSet tileset;
    private Map map;

    public void load() {
        tileset = new TileSet(16, 16, 1, 1, 1, tilesetPath);
        map = new Map(mapPath, tileset);
    }

    public void update(Vector worldPosition) {
        map.update(worldPosition);
    }

    public void draw(Engine.Canvas canvas, Vector worldPosition) {
        map.drawEarly(canvas, worldPosition);
        map.drawLate(canvas, worldPosition);
    }

    public void drawBackground(Engine.Canvas canvas, Vector worldPosition) {
        map.drawEarly(canvas, worldPosition);
    }

    public void drawForeground(Canvas canvas, Vector worldPosition) {
        map.drawLate(canvas, worldPosition);
    }
}
