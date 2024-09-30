package Footprint;

import Engine.Canvas;
import Engine.StaticEntity;

import java.awt.*;
import java.util.Random;

public class Footprint extends StaticEntity {

    public Footprint(int x, int y) {
        teleport(x, y);
        resize(5, 5);
    }

    public void draw(Canvas canvas) {
        Color color = new Color(getRandomValue(), getRandomValue(), getRandomValue());
        canvas.drawRectangle(this, color);
    }

    private int getRandomValue() {
        return new Random().nextInt(256);
    }
}
