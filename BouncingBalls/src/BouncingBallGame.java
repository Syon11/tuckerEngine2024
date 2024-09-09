import java.awt.*;
import java.util.ArrayList;

public class BouncingBallGame extends Game {

    private int score;
    private ArrayList<Ball> balls;

    public BouncingBallGame() {
        super();

    }

    @Override
    protected void initialize() {
        initBalls();
    }

    @Override
    protected void update() {
        for (Ball ball : balls){
            ball.update();
            if (ball.hasTouched()) {
                score += 10;
            }
        }
    }

    @Override
    protected void drawOnBuffer(Graphics2D bufferEngine) {
        for (Ball ball: balls) {
            ball.draw(bufferEngine);
        }
        bufferEngine.setPaint(Color.WHITE);
        bufferEngine.drawString("Score: " + score, 10, 20);
    }

    private void initBalls() {
        balls = new ArrayList<Ball>();
        balls.add(new Ball(25));
        balls.add(new Ball(50));
        balls.add(new Ball(75));
    }
}
