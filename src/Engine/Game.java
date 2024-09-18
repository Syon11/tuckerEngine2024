package Engine;

import java.awt.event.KeyListener;
import java.security.Key;

public abstract class Game {

    private boolean playing = true;
    private GameTime gameTime;
    private RenderingEngine renderingEngine;

    protected abstract void initialize();
    protected abstract void update();
    protected abstract void draw(Canvas canvas);

    public Game() {
        renderingEngine = new RenderingEngine();
    }

    public final void start() {
        initialize();
        run();
    }

    public final void stop() {
        playing = false;
    }

    public void addKeyListener(KeyListener keyListener) {
        renderingEngine.addKeyListener(keyListener);
    }

    private void run() {
        renderingEngine.start();
        gameTime = new GameTime();
        while (playing) {
            update();
            draw(renderingEngine.buildCanvas());
            renderingEngine.drawBufferOnScreen();
            gameTime.synchronize();
        }
        renderingEngine.stop();
    }


}
