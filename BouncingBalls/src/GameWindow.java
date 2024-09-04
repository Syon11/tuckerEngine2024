import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.ArrayList;

public class GameWindow extends JFrame {

    private static final int SLEEP = 25;

    private JPanel panel;
    private boolean playing = true;
    private ArrayList<Ball> balls;
    private BufferedImage bufferedImage;
    private Graphics2D bufferedEngine;
    private long before;
    private int score;


    public GameWindow() {
        InitWindow();
        InitPanel();
        balls = new ArrayList<Ball>();
        balls.add(new Ball(25));
        add(panel);
    }

    public void start() {
        setVisible(true);
        before = System.currentTimeMillis();

        while (playing) {
            bufferedImage = new BufferedImage(800, 600,
                    BufferedImage.TYPE_INT_RGB);
            RenderingHints hints = new RenderingHints(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            hints.put(
                    RenderingHints.KEY_RENDERING,
                    RenderingHints.VALUE_RENDER_QUALITY);
            bufferedEngine = bufferedImage.createGraphics();
            bufferedEngine.setRenderingHints(hints);

            update();
            drawOnBuffer();
            drawBufferOnScreen();

            long sleep = SLEEP - (System.currentTimeMillis() - before);
            if (sleep < 4) {
                sleep = 4;
            }

            try {
                Thread.sleep(sleep);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            before = System.currentTimeMillis();
        }
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
            ball.draw(bufferedEngine);
        }


        bufferedEngine.setPaint(Color.WHITE);
        bufferedEngine.drawString("Score: " + score, 10, 20);
    }

    private void drawBufferOnScreen() {
        Graphics2D graphics = (Graphics2D) panel.getGraphics();
        graphics.drawImage(bufferedImage, 0, 0, panel);
        Toolkit.getDefaultToolkit().sync();
        graphics.dispose();
    }

    private void InitWindow() {
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Bouncing Balls");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setState(JFrame.NORMAL);
    }

    private void InitPanel() {
        panel = new JPanel();
        panel.setBackground(Color.BLUE);
        panel.setFocusable(true);
        panel.setDoubleBuffered(true);
    }


}
