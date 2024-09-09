import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Game {

    private static final int SLEEP = 25;

    private JFrame frame;
    private JPanel panel;
    private boolean playing = true;
    private ArrayList<Ball> balls;
    private BufferedImage bufferedImage;
    private Graphics2D bufferEngine;
    private long before;
    private int score;


    public Game() {
        InitWindow();
        InitPanel();
        initBalls();
        frame.add(panel);
    }

    public void start() {
        frame.setVisible(true);
        updateSyncTime();
        while (playing) {
            bufferedImage = new BufferedImage(800, 600,
                    BufferedImage.TYPE_INT_RGB);
            bufferEngine = bufferedImage.createGraphics();
            bufferEngine.setRenderingHints(buildRenderingHints());

            update();
            drawOnBuffer();
            drawBufferOnScreen();
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

    private RenderingHints buildRenderingHints() {
        RenderingHints hints = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        hints.put(
                RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);
        return hints;
    }

    private void update() {
        for (Ball ball : balls){
            ball.update();
            if (ball.hasTouched()) {
                score += 10;
            }
        }
    }

    private void drawOnBuffer() {
        for (Ball ball: balls) {
            ball.draw(bufferEngine);
        }
        bufferEngine.setPaint(Color.WHITE);
        bufferEngine.drawString("Score: " + score, 10, 20);
    }

    private void drawBufferOnScreen() {
        Graphics2D graphics = (Graphics2D) panel.getGraphics();
        graphics.drawImage(bufferedImage, 0, 0, panel);
        Toolkit.getDefaultToolkit().sync();
        graphics.dispose();
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

    private void InitWindow() {
        frame = new JFrame();
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setTitle("Bouncing Balls");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setState(JFrame.NORMAL);
        //frame.setUndecorated(true);
    }

    private void InitPanel() {
        panel = new JPanel();
        panel.setBackground(Color.BLUE);
        panel.setFocusable(true);
        panel.setDoubleBuffered(true);
    }
}
