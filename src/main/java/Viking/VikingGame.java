package Viking;

import Engine.Canvas;
import Engine.Game;
import Engine.RenderingEngine;
import Engine.Screen;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.*;

public class VikingGame extends Game {
    private Player player;
    private GamePad gamepad;
    private World world;

    private int soundCooldown;

    @Override
    protected void initialize() {
        GameConfig.setDebugEnabled(true);
        gamepad = new GamePad();
        player = new Player(gamepad);
        world = new World();
        world.load();
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream audio = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResourceAsStream("sfx/music.wav"));
            clip.open(audio);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

        RenderingEngine.getInstance().getScreen().fullscreen();
        RenderingEngine.getInstance().getScreen().hideCursor();
    }

    @Override
    protected void update() {
        if (gamepad.isQuitPressed()) {
            stop();
        }

        if (soundCooldown > 0) {
            --soundCooldown;
        }

        if (gamepad.isFirePressed() && soundCooldown <= 0) {
            soundCooldown = 100;
            SoundEffect.FIRE.play();
        }
        player.update();
        world.update(player.getWorldPosition());

    }

    @Override
    protected void draw(Canvas canvas) {
        canvas.drawRectangle(0, 0, Screen.getWidth(), Screen.getHeight(), Color.BLUE);
        world.drawBackground(canvas, player.getWorldPosition());
        player.draw(canvas);
        world.drawForeground(canvas, player.getWorldPosition());
        player.drawHitbox(canvas);
    }
}
