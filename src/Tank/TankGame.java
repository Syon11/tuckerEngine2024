package Tank;

import Engine.Canvas;
import Engine.Game;

public class TankGame extends Game{
    private GamePad gamePad;
    private Tank tank;

    @Override
    protected void initialize() {
        gamePad = new GamePad();
        tank = new Tank(gamePad);
    }

    @Override
    protected void update() {
        tank.update();
        if (gamePad.isQuitPressed()) {
            stop();
        }
    }

    @Override
    protected void draw(Canvas canvas) {
        tank.draw(canvas);
    }





}
