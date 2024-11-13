package Tank;

import Engine.Canvas;
import Engine.CollidableRepository;
import Engine.Game;
import Engine.StaticEntity;

import java.util.ArrayList;

public class TankGame extends Game{
    private GamePad gamePad;
    private Tank tank;
    private ArrayList<Missile> missiles;
    private ArrayList<Brick> bricks;
    private ArrayList<StaticEntity> killedEntities;

    @Override
    protected void initialize() {
        gamePad = new GamePad();
        tank = new Tank(gamePad);
        missiles = new ArrayList<>();
        bricks = new ArrayList<>();
        killedEntities = new ArrayList<>();
        bricks.add(new Brick(500, 100));
        bricks.add(new Brick(500, 116));
        bricks.add(new Brick(500, 132));
        bricks.add(new Brick(484, 148));
        bricks.add(new Brick(500, 164));


    }

    @Override
    protected void update() {
        tank.update();
        if (gamePad.isQuitPressed()) {
            stop();
        }
        if (gamePad.isFirePressed() && tank.canFire()) {
            missiles.add(tank.fire());
        }

        for (Missile missile : missiles) {
            missile.update();
            for (Brick brick: bricks) {
                if (missile.hitBoxIntersectWith(brick)) {
                    killedEntities.add(missile);
                    killedEntities.add(brick);
                }
            }
        }

        for (StaticEntity entity: killedEntities) {
            if (entity instanceof Missile) {
                missiles.remove(entity);
            }
            if (entity instanceof Brick) {
                bricks.remove(entity);
            }
        }
        CollidableRepository.getInstance().unregister(killedEntities);
        killedEntities.clear();
    }

    @Override
    protected void draw(Canvas canvas) {
        tank.draw(canvas);
        for (Missile missile : missiles) {
            missile.draw(canvas);
        }
        for (Brick brick : bricks) {
            brick.draw(canvas);
        }
    }
}
