package Footprint;

import Engine.Canvas;
import Engine.ControllableEntity;

import java.awt.*;

public class Player extends ControllableEntity {
    public Player(GamePad gamePad) {
        super(gamePad);
        teleport(200, 200);
        resize(20, 60);
        setSpeed(3);
    }

    public Player(GamePad gamePad, Color color) {
        this(gamePad);
    }

    @Override
    public void update() {
        moveWithController();
    }

    @Override
    public void draw (Canvas canvas) {
        canvas.drawRectangle(this, Color.WHITE);
    }

    public Footprint createFootprint() {
        return new Footprint(worldX, worldY);
    }
}
