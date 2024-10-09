package Tank;

import Engine.Canvas;
import Engine.StaticEntity;

import java.awt.*;

public class Brick extends StaticEntity {

    private final int WIDTH = 16;
    private final int HEIGHT = 16;

    public Brick(int x, int y) {
        teleport(x, y);
        resize(16, 16);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRectangle(this, Color.GRAY);
    }
}
