package MovingRectangle;

import Engine.Canvas;

import java.awt.*;

public class Npc {

    private int x;
    private int y;
    private int speed;
    private boolean path1 = true;
    private boolean path2 = false;
    private boolean path3 = false;
    private boolean path4 = false;

    public Npc() {
        this.x = 400;
        this.y = 200;
        this.speed = 2;
    }

    public void update() {
        if (path1) {
            x -= speed;
            if (x <= 100) {
                path1 = false;
                path2 = true;
            }
        }
        if (path2) {
            y += speed;
            if (y >= 500) {
                path2 = false;
                path3 = true;
            }
        }
        if (path3) {
            x += speed;
            if (x >= 400) {
                path3 = false;
                path4 = true;
            }
        }
        if (path4) {
            y -= speed;
            if (y <= 200) {
                path4 = false;
                path1 = true;
            }
        }
    }

    public void draw(Canvas canvas) {
        canvas.drawRectangle(x, y, 10, 10, Color.YELLOW);
    }
}
