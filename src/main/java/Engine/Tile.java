package Engine;

import Engine.Enums.CollisionType;
import Engine.Utility.Vector;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile {
    private int tileID;
    private int x;
    private int y;
    private Image gfx;
    private float scale;
    private CollisionType collisionType;
    private Blockade blockade;
    private Blockade blockade2;

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
        boolean isWithinLeftBound = x * scale  >= worldPosition.getX() - (gfx.getWidth(null) * scale);
        boolean isWithinRightBound = (x * scale) + (gfx.getWidth(null) * scale * 5)<= worldPosition.getX() + Screen.getWidth() / 2;
        boolean isWithinUpBound = y * scale >= worldPosition.getY() - (gfx.getWidth(null) * scale);
        boolean isWithingDownBound = (y * scale) - (gfx.getHeight(null) * scale * 2) <= worldPosition.getY() + Screen.getHeight() / 2;

        return isWithinLeftBound && isWithinRightBound && isWithingDownBound && isWithinUpBound;
    }

    public void setCollision(CollisionType type) {
        collisionType = type;
        Rectangle[] collisions = type.getCollisions();
        if (collisionType != CollisionType.NONE) {
            blockade = new Blockade();
            blockade.resize((int)(collisions[0].width * gfx.getWidth(null)), (int)(collisions[0].height * gfx.getHeight(null)));
            CollidableRepository.getInstance().register(blockade);
            if (collisions.length > 1) {
                blockade2 = new Blockade();
                blockade.resize((int)(collisions[1].width * gfx.getWidth(null)), (int)(collisions[1].height * gfx.getHeight(null)));
                CollidableRepository.getInstance().register(blockade2);
            }
        }
    }

    public void update(Vector worldPosition) {
        if (blockade == null) {
            return;
        }
        if (!isInScreen(worldPosition)) {
            blockade.teleport(-100, -100);
            return;
        }
        if(blockade2 != null && collisionType.getCollisions().length > 1) {
            blockade2.teleport((int)(x * scale) - worldPosition.getX() + (collisionType.getCollisions()[1].x * (gfx.getWidth(null)/2)),
                    (int)(y * scale) - worldPosition.getY() + (collisionType.getCollisions()[1].y * (gfx.getHeight(null)/2)));
        }
        blockade.teleport((int)(x * scale) - worldPosition.getX() + (collisionType.getCollisions()[0].x * (gfx.getWidth(null)/2)),
                (int)(y * scale) - worldPosition.getY() + (collisionType.getCollisions()[0].y * (gfx.getHeight(null)/2)));

    }

    private Image fetchImage(int tileID, TileSet tileSet) {
        return tileSet.getTile(tileID);
    }

    public void draw(Canvas canvas, Vector worldPosition) {
        canvas.drawScaledImage(gfx, (int)(x * scale) - worldPosition.getX(), (int)(y * scale) - worldPosition.getY(), (int)(16 * scale), (int)(16 * scale));
        if (blockade != null) {
            blockade.draw(canvas);
        }
        if (blockade2 != null) {
            blockade2.draw(canvas);
        }
    }

}
