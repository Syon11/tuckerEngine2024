package Engine.Enums;

import java.awt.*;
import java.util.Objects;

public enum CollisionType {
    NONE(new Rectangle(0, 0, 0, 0)),
    TOP(new Rectangle(0, 0, 2, 1)),
    TOP_RIGHT_FULL(new Rectangle(0,0,2,1), new Rectangle(1, 0, 1, 2)),
    TOP_RIGHT_SQUARE(new Rectangle(1,0,1,1)),
    RIGHT(new Rectangle(1, 0, 1, 2)),
    BOTTOM_RIGHT_FULL(new Rectangle(0, 1, 2, 1), new Rectangle(1,0,1,2)),
    BOTTOM_RIGHT_SQUARE(new Rectangle(1, 1, 1, 1)),
    BOTTOM(new Rectangle(0, 1, 2, 1)),
    BOTTOM_LEFT_FULL(new Rectangle(0,0,1,2), new Rectangle(0, 1, 2, 1)),
    BOTTOM_LEFT_SQUARE(new Rectangle(0,1,1,1)),
    LEFT(new Rectangle(0,0,1,2)),
    TOP_LEFT_FULL(new Rectangle(0, 0, 1, 2), new Rectangle(0, 0, 2, 1)),
    TOP_LEFT_SQUARE(new Rectangle(0, 0, 1, 1)),
    FULL(new Rectangle(0, 0, 2, 2));

    private final Rectangle collision1;
    private final Rectangle collision2;

    CollisionType(Rectangle rect) {
        collision1 = rect;
        collision2 = new Rectangle(0,0,0,0);
    }

    CollisionType(Rectangle rect1, Rectangle rect2) {
        collision1 = rect1;
        collision2 = rect2;
    }

    public Rectangle[] getCollisions() {
        Rectangle[] collisions = new Rectangle[1];
        if (!Objects.equals(collision2, new Rectangle(0, 0, 0, 0))) {
            collisions = new Rectangle[2];
        }
        collisions[0] = collision1;
        if (collisions.length > 1) {
            collisions[1] = collision2;
        }
        return collisions;
    }
}
