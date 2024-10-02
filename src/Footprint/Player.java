package Footprint;

import Engine.Canvas;
import Engine.MovableEntity;

import java.awt.*;

public class Player extends MovableEntity {
    private GamePad gamePad;

    public Player(GamePad gamePad) {
        this.gamePad = gamePad;
        teleport(200, 200);
        resize(20, 60);
        setSpeed(3);
    }

    public void update() {
        if (gamePad.isMoving()) {
            move(gamePad.getDirection());
        }
    }

    public void draw (Canvas canvas) {
        canvas.drawRectangle(this, Color.WHITE);
    }

    public Footprint createFootprint() {
        return new Footprint(x, y);
    }
}
