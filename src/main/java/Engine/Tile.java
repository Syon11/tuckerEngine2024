package Engine;

import Engine.Utility.Vector;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile {
    private int tileID;
    private int x;
    private int y;
    private Image gfx;
    private float scale;

    public Tile(int tileID, int x, int y, TileSet tileSet) {
        this.tileID = tileID;
        this.gfx = fetchImage(this.tileID, tileSet);
        this.x = x;
        this.y = y;
        this.scale = 2;
    }

    public Tile(int tileID, int x, int y, TileSet tileSet, float scale) {
        this.tileID = tileID;
        this.gfx = fetchImage(this.tileID, tileSet);
        this.x = x;
        this.y = y;
        this.scale = scale;
    }

    public boolean isInScreen(Vector worldPosition) {
        //worldPosition.getX() == X position of player in world
        //Screen.getWidth = width of screen.
        // x = tile's X position in world.

        boolean isWithinLeftBound = x * scale  >= worldPosition.getX() - (gfx.getWidth(null) * scale);
        boolean isWithinRightBound = (x * scale) + (gfx.getWidth(null) * scale * 5)<= worldPosition.getX() + Screen.getWidth() / 2;
        boolean isWithinUpBound = y * scale >= worldPosition.getY() - (gfx.getWidth(null) * scale);
        boolean isWithingDownBound = (y * scale) - (gfx.getHeight(null) * scale * 2) <= worldPosition.getY() + Screen.getHeight() / 2;

        return isWithinLeftBound && isWithinRightBound && isWithingDownBound && isWithinUpBound;
    }

    private Image fetchImage(int tileID, TileSet tileSet) {
        return tileSet.getTile(tileID);
    }

    public void draw(Canvas canvas, Vector worldPosition) {
        canvas.drawScaledImage(gfx, (int)(x * scale) - worldPosition.getX(), (int)(y * scale) - worldPosition.getY(), (int)(16 * scale), (int)(16 * scale));
    }

}
