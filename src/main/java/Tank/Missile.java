package Tank;

import Engine.Canvas;
import Engine.CollidableRepository;
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
        CollidableRepository.getInstance().register(this);
    }

    @Override
    public void update() {
        move(direction);
        if (worldX > 820 ) {
            worldX = -20;
        }
        else if (worldX < -20) {
            worldX = 820;
        }
        else if (worldY > 620) {
            worldY = -20;
        }
        else if (worldY < -20) {
            worldY = 620;
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
