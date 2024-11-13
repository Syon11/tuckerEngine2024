package Engine;

import java.awt.*;

public abstract class StaticEntity {
    protected int worldX;
    protected int worldY;
    protected int width;
    protected int height;


    public abstract void draw(Canvas canvas);

    public void teleport(int x, int y) {
        this.worldX = x;
        this.worldY = y;
    }

    public void resize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    protected Rectangle getBounds() {
        return new Rectangle(worldX, worldY, width, height);
    }

    public boolean collidesWith(StaticEntity other) {
        return getBounds().intersects(other.getBounds());
    }


    public int getWorldX() {
        return worldX;
    }

    public int getY() {
        return worldY;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
