package Tank;

import Engine.Canvas;
import Engine.ControllableEntity;
import Engine.MovementController;

import java.awt.*;

public class Tank extends ControllableEntity {

    public Tank(MovementController controller) {
        super(controller);
        resize(30, 30);
        setSpeed(2);
        teleport(200, 200);
    }

    @Override
    public void update() {
        moveWithController();
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRectangle(this, Color.GREEN);
    }

}
