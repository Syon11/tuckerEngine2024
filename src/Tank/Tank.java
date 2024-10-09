package Tank;

import Engine.Canvas;
import Engine.ControllableEntity;
import Engine.MovementController;

import java.awt.*;

public class Tank extends ControllableEntity {

    private int cooldown = 0;

    public Tank(MovementController controller) {
        super(controller);
        resize(30, 30);
        setSpeed(2);
        teleport(200, 200);
    }

    public Missile fire() {
        if (canFire()) {
            cooldown = 40;
            return new Missile(this);
        }
        return null;
    }

    public boolean canFire() {
        return cooldown <= 0;
    }

    @Override
    public void update() {
        moveWithController();
        if (cooldown > 0) {
            cooldown--;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRectangle(this, Color.GREEN);
        if (!canFire()) {
            canvas.drawRectangle(getX(), getY() - 4, getWidth(), 2, Color.RED);
            canvas.drawRectangle(getX(), getY() -4, (int)(getWidth() * ((40.0 -cooldown) / 40.0)), 2, Color.GREEN);
        }
    }

}
