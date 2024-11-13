package Footprint;

import Engine.Canvas;
import Engine.Game;

import java.awt.*;
import java.util.ArrayList;

public class FootprintGame extends Game {
    private GamePad gamePad1;
    private Player player1;
    private GamePad gamePad2;
    private Player player2;
    private ArrayList<Footprint> footprints;
    private int iterator = 0;
    private int iterator2 = 0;
    @Override
    protected void initialize() {
        gamePad1 = new GamePad();
        gamePad2 = new GamePad();
        gamePad2.UseWASD();
        player1 = new Player(gamePad1);
        player2 = new Player(gamePad2);
        footprints = new ArrayList<>();
    }

    @Override
    protected void update() {
        iterator++;
        iterator2++;
        if (gamePad1.isQuitPressed()) {
            stop();
        }
        player1.update();
        player2.update();
        if (gamePad1.isMoving() && iterator > 30) {
            footprints.add(player1.createFootprint());
            iterator = 0;
        }
        if (gamePad2.isMoving() && iterator2 > 30) {
            footprints.add(player2.createFootprint());
            iterator2 = 0;
        }
    }

    @Override
    protected void draw(Canvas canvas) {
        canvas.drawRectangle(0, 0, 800, 600, Color.BLUE);
        for (Footprint footprint : footprints) {
            footprint.draw(canvas);
        }
        player1.draw(canvas);
        player2.draw(canvas);
    }
}
