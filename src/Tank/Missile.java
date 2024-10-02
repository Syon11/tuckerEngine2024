package Tank;

import Engine.Canvas;
import Engine.Direction;
import Engine.MovableEntity;

import java.awt.*;

public class Missile extends MovableEntity{

    private final Direction tankDirection;

    public Missile(Tank tank) {
        tankDirection = tank.getDirection();
        resize(10, 10);
        setSpeed(5);
        teleport(tank.getX(), tank.getY());
    }

    @Override
    public void update() {
        move(tankDirection);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRectangle(this, Color.YELLOW);
    }
}
