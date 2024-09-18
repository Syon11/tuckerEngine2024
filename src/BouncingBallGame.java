import java.awt.*;
import java.util.ArrayList;

public final class BouncingBallGame extends Game {

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
    protected void draw(Canvas canvas) {
        for (Ball ball: balls) {
            ball.draw(canvas);
        }
        canvas.drawString("Score: " + score, 10, 20, Color.WHITE);
        canvas.drawString(GameTime.getElapsedFormattedTime(), 10, 40, Color.WHITE);
        canvas.drawString("FPS: " + GameTime.getCurrentFps(), 10, 60, Color.WHITE);
    }

    private void initBalls() {
        balls = new ArrayList<Ball>();
        balls.add(new Ball(25));
        balls.add(new Ball(50));
        balls.add(new Ball(75));
    }
}
