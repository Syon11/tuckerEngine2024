package Footprint;

import Engine.Canvas;
import Engine.Game;

import java.awt.*;
import java.util.ArrayList;

public class FootprintGame extends Game {
    private GamePad gamePad;
    private Player player;
    private ArrayList<Footprint> footprints;
    private int iterator = 0;

    @Override
    protected void initialize() {
        gamePad = new GamePad();
        player = new Player(gamePad);
        footprints = new ArrayList<>();
    }

    @Override
    protected void update() {
        iterator++;
        if (gamePad.isQuitPressed()) {
            stop();
        }
        player.update();
        if (gamePad.isMoving() && iterator > 30) {
            footprints.add(player.createFootprint());
            iterator = 0;
        }
    }

    @Override
    protected void draw(Canvas canvas) {
        canvas.drawRectangle(0, 0, 800, 600, Color.BLUE);
        for (Footprint footprint : footprints) {
            footprint.draw(canvas);
        }
        player.draw(canvas);
    }
}
