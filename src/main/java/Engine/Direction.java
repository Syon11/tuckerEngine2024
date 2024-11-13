package Engine;

public enum Direction {
    UP(0, -1),
    DOWN(0, 1),
    LEFT(-1, 0),
    RIGHT(1, 0),
    NONE(0, 0);

    private final int VelocityX;
    private final int VelocityY;

    Direction(int velocityX, int velocityY) {
        VelocityX = velocityX;
        VelocityY = velocityY;
    }

    public int calculateVelocityX(int speed) {
        return VelocityX * speed;
    }

    public int calculateVelocityY(int speed) {
        return VelocityY * speed;
    }
}
