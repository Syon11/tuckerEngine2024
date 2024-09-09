import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Game {

    private static final int SLEEP = 25;
    private RenderingEngine renderingEngine;

    private boolean playing = true;
    private long before;

    private int score;
    private ArrayList<Ball> balls;


    public Game() {
        renderingEngine = new RenderingEngine();
        initBalls();

    }

    public void start() {
        renderingEngine.start();
        updateSyncTime();
        while (playing) {
            update();
            drawOnBuffer(renderingEngine.buildBuffer());
            renderingEngine.drawBufferOnScreen();
            sleep();
        }
    }

    private void sleep () {
        try {
            Thread.sleep(getSleepTime());
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        updateSyncTime();
    }

    private long getSleepTime() {
        long sleep = SLEEP - (System.currentTimeMillis() - before);
        if (sleep < 4) {
            sleep = 4;
        }
        return sleep;
    }

    private void update() {
        for (Ball ball : balls){
            ball.update();
            if (ball.hasTouched()) {
                score += 10;
            }
        }
    }

    private void drawOnBuffer(Graphics2D bufferEngine) {
        for (Ball ball: balls) {
            ball.draw(bufferEngine);
        }
        bufferEngine.setPaint(Color.WHITE);
        bufferEngine.drawString("Score: " + score, 10, 20);
    }

    private void updateSyncTime() {
        before = System.currentTimeMillis();
    }

    private void initBalls() {
        balls = new ArrayList<Ball>();
        balls.add(new Ball(25));
        balls.add(new Ball(50));
        balls.add(new Ball(75));
    }


}
