package Engine;

import java.awt.*;

public class Collision {
    private final MovableEntity entity;

    public Collision(MovableEntity entity) {
        this.entity = entity;
    }

    public int getAllowedSpeed() {
        return switch (entity.getDirection()) {
            case UP -> getAllowedUpSpeed();
            case DOWN -> getAllowedDownSpeed();
            case LEFT -> getAllowedLeftSpeed();
            case RIGHT -> getAllowedRightSpeed();
            case NONE -> 0;
        };
    }

    private int getAllowedUpSpeed() {
        return distance(other -> entity.getY() - (other.getY() + other.getHeight()));
    }

    private int getAllowedDownSpeed() {
        return distance(other -> other.getY() - (entity.getY() + entity.getHeight()));
    }

    private int getAllowedLeftSpeed() {
        return distance(other -> entity.getWorldX() - (other.getWorldX() + other.getWidth()));
    }

    private int getAllowedRightSpeed() {
        return distance(other -> other.getWorldX() - (entity.getWorldX() + entity.getWidth()));
    }

    private int distance(DistanceCalculator calculator) {
        Rectangle collisionBounds = entity.getHitbox();
        int allowedDistance = entity.getSpeed();
        for (StaticEntity other: CollidableRepository.getInstance()){
            if(collisionBounds.intersects(other.getBounds())){
                allowedDistance = Math.min(allowedDistance, calculator.calculateWith(other));
            }
        }
        return allowedDistance;
    }

    public interface DistanceCalculator {
        int calculateWith(StaticEntity other);
    }
}
