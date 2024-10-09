package Engine;

import java.awt.*;

public abstract class StaticEntity {
    protected int x;
    protected int y;
    protected int width;
    protected int height;


    public abstract void draw(Canvas canvas);

    public void teleport(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void resize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    protected Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    public boolean collidesWith(StaticEntity other) {
        return getBounds().intersects(other.getBounds());
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
