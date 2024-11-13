package Engine;

import java.awt.*;

public abstract class MovableEntity extends StaticEntity {

    private int speed = 1;
    private Direction direction = Direction.UP;
    private Collision collision;

    private int lastX = Integer.MIN_VALUE;
    private int lastY = Integer.MIN_VALUE;
    private boolean moved;


    public MovableEntity() {
        collision = new Collision(this);
    }

    public void update() {
        moved = false;
    };

    public void move() {
        int allowedSpeed = collision.getAllowedSpeed();
        worldX += direction.calculateVelocityX(allowedSpeed);
        worldY += direction.calculateVelocityY(allowedSpeed);
        moved = (lastX != worldX || lastY != worldY);
        lastX = worldX;
        lastY = worldY;
    }

    public boolean hasMoved() {
        return moved;
    }

    public void move(Direction direction) {
        this.direction = direction;
        move();
    }

    public void moveUp() {
        move(Direction.UP);
    }

    public void moveDown() {
        move(Direction.DOWN);
    }

    public void moveLeft() {
        move(Direction.LEFT);
    }

    public void moveRight() {
        move(Direction.RIGHT);
    }

    public Rectangle getHitbox() {
        return switch (direction) {
            case UP -> getUpperHitbox();
            case RIGHT -> getRightHitbox();
            case DOWN -> getLowerHitbox();
            case LEFT -> getLeftHitbox();
            case NONE -> getBounds();
        };
    }

    private Rectangle getLeftHitbox() {
        return new Rectangle(worldX - speed, worldY, speed, height);
    }

    private Rectangle getLowerHitbox() {
        return new Rectangle(worldX, worldY + height, width, speed);
    }

    private Rectangle getRightHitbox() {
        return new Rectangle(worldX + width, worldY, speed, height);
    }

    private Rectangle getUpperHitbox() {
        return new Rectangle(worldX, worldY - speed, width, speed);
    }

    public boolean hitBoxIntersectWith(StaticEntity other) {
        if (other == null){
            return false;
        }
        return getHitbox().intersects(other.getBounds());
    }

    public void drawHitbox(Canvas canvas) {
        Rectangle rect = getHitbox();
        canvas.drawRectangle(rect.x, rect.y, rect.width, rect.height, Color.BLUE);
    }

    public int getSpeed() {
        return speed;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
