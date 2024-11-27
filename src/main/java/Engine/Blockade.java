package Engine;

import java.awt.*;

public class Blockade extends StaticEntity {

    public Blockade() {
        CollidableRepository.getInstance().register(this);
    }

    @Override
    public void draw(Canvas canvas){
        canvas.drawRectangle(this, new Color(255,0,0,125));
    }
}
