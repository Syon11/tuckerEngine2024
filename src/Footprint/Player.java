package Footprint;

import Engine.Canvas;

import java.awt.*;

public class Player {
    private GamePad gamePad;
    private int x;
    private int y;
    private int speed;

    public Player(GamePad gamePad) {
        this.gamePad = gamePad;
        x = 200;
        y = 200;
        speed = 3;
    }

    public void update() {
        if (gamePad.isDownPressed()) {
            y += speed;
        }
        if (gamePad.isUpPressed()) {
            y -= speed;
        }
        if (gamePad.isLeftPressed()) {
            x -= speed;
        }
        if (gamePad.isRightPressed()) {
            x += speed;
        }
    }

    public void draw (Canvas canvas) {
        canvas.drawRectangle(x, y, 20, 50, Color.WHITE);
    }
}
