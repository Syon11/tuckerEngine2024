package MovingRectangle;

import Engine.Canvas;

import java.awt.*;

public class Player {

    private int x;
    private int y;
    private int speed;

    public Player() {
        this.x = 200;
        this.y = 200;
        this.speed = 3;
    }

    public void update() {
        x += speed;
    }

    public void draw(Canvas canvas) {
        canvas.drawRectangle(x, y, 20, 60, Color.WHITE);
    }
}
