package MovingRectangle;

import Engine.Canvas;
import Engine.Controller;

import java.awt.*;

public class Player {

    private int x;
    private int y;
    private int speed;
    private GamePad gamePad;

    public Player(GamePad gamePad) {
        this.x = 200;
        this.y = 200;
        this.speed = 3;
        this.gamePad = gamePad;
    }

    public void update() {
        if(gamePad.isDownPressed()) {
            y += speed;
        }
        else if(gamePad.isUpPressed()) {
            y -= speed;
        }
        else if(gamePad.isLeftPressed()) {
            x -= speed;
        }
        else if(gamePad.isRightPressed()) {
            x += speed;
        }
    }

    public void draw(Canvas canvas) {
        canvas.drawRectangle(x, y, 20, 60, Color.WHITE);
    }
}
