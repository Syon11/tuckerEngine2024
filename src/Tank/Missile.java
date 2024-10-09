package Tank;

import Engine.Canvas;
import Engine.Direction;
import Engine.MovableEntity;

import java.awt.*;

public class Missile extends MovableEntity{

    private final Direction direction;

    private final int WIDTH = 8;
    private final int HEIGHT = 4;
    private final int OFFSET = 1;

    public Missile(Tank tank) {
        direction = tank.getDirection();
        setSpeed(5);
        initialize(tank);

    }

    @Override
    public void update() {
        move(direction);
        if (x > 820 ) {
            x = -20;
        }
        else if (x < -20) {
            x = 820;
        }
        else if (y > 620) {
            y = -20;
        }
        else if (y < -20) {
            y = 620;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRectangle(this, Color.YELLOW);
    }

    private void initialize(Tank tank) {
        if (direction == Direction.RIGHT) {
            resize(WIDTH, HEIGHT);
            teleport(tank.getX() + tank.getWidth() + OFFSET, tank.getY() + tank.getHeight() / 2 - HEIGHT / 2);
        }
        else if (direction == Direction.LEFT) {
            resize(WIDTH, HEIGHT);
            teleport(tank.getX() - WIDTH - OFFSET, tank.getY() + tank.getHeight() / 2 - HEIGHT / 2);
        }
        else if (direction == Direction.UP) {
            resize(HEIGHT, WIDTH);
            teleport(tank.getX() + tank.getWidth()/2 - HEIGHT/2, tank.getY() - WIDTH - OFFSET);
        }
        else if (direction == Direction.DOWN) {
            resize(HEIGHT, WIDTH);
            teleport(tank.getX() + tank.getWidth()/2 - HEIGHT/2, tank.getY() + tank.getHeight() + OFFSET);
        }



    }
}
