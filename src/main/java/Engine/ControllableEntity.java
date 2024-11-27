package Engine;

import Engine.Utility.Vector;

import java.awt.*;

public abstract class ControllableEntity extends MovableEntity{
    private final MovementController controller;

    protected int screenOffsetX;
    protected int screenOffsetY;

    protected Vector size;
    protected Sprite sprite;

    public ControllableEntity(MovementController controller, Vector size, Sprite sprite) {
        this.controller = controller;
        this.size = size;
        this.sprite = sprite;
    }

    public ControllableEntity(MovementController controller) {
        this.controller = controller;
    }

    @Override
    public int getX() {
        return screenOffsetX;
    }

    @Override
    public int getY() {
        return screenOffsetY;
    }

    public void moveWithController() {
        if (controller.isMoving()) {
            move(controller.getDirection());
        }
    }

    @Override
    public void drawHitbox(Canvas canvas) {
        Rectangle rect = getHitbox();
        canvas.drawRectangle(rect.x, rect.y, rect.width, rect.height, Color.RED);
    }

    @Override
    protected Rectangle getLeftHitbox() {
        return new Rectangle(screenOffsetX - speed, screenOffsetY, speed, height);
    }

    @Override
    protected Rectangle getLowerHitbox() {
        return new Rectangle(screenOffsetX, screenOffsetY + height, width, speed);
    }

    @Override
    protected Rectangle getRightHitbox() {
        return new Rectangle(screenOffsetX + width, screenOffsetY, speed, height);
    }

    @Override
    protected Rectangle getUpperHitbox() {
        return new Rectangle(screenOffsetX, screenOffsetY - speed, width, speed);
    }


}
