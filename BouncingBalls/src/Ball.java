import java.awt.*;
import java.util.Random;

public class Ball {
    public static final int DEFAULT_SPEED = 5;

    private int radius;
    private int speed;
    private int x;
    private int y;
    private int dx;
    private int dy;

    public Ball(int radius, int speed) {
        this.radius = radius;
        this.speed = speed;
        initializePosition();
    }

    public Ball(int radius) {
        this(radius, DEFAULT_SPEED);
    }

    public int update() {
        x += dx;
        y += dy;
        if (hasTouchedVertical()) {
            dy *= -1;
            return 10;
        }
        if (hasTouchedHorizontal()) {
            dx *= -1;
            return 10;
        }
        return 0;
    }

    public boolean hasTouched(){
        return hasTouchedHorizontal() || hasTouchedVertical();
    }

    public void draw(Graphics2D bufferedEngine){
        bufferedEngine.setPaint(Color.RED);
        bufferedEngine.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    private int randomNumber(int min, int max) {
        return (new Random()).nextInt((max - min) + 1) + min;
    }

    private void initializePosition() {
        this.x = randomNumber(radius * 2, 800 - radius * 2);
        this.y = randomNumber(radius * 2, 600 - radius * 2);
        this.dx = randomNumber(0, 1) == 0 ? speed : -speed;
        this.dy = randomNumber(0, 1) == 0 ? speed : -speed;
    }

    private boolean hasTouchedVertical() {
        return y <= radius || y >= 600 - radius;
    }

    private boolean hasTouchedHorizontal() {
        return x <= radius || x >= 800 - radius;
    }

}
