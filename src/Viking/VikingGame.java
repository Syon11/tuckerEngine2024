package Viking;

import Engine.Canvas;
import Engine.Game;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class VikingGame extends Game {
    private Player player;
    private GamePad gamepad;
    private Tree tree;
    private World world;

    private int soundCooldown;

    @Override
    protected void initialize() {
        gamepad = new GamePad();
        player = new Player(gamepad);
        world = new World();
        tree = new Tree();
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
            try {
                Clip clip = AudioSystem.getClip();
                AudioInputStream audio = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResourceAsStream("sfx/fire.wav"));
                clip.open(audio);
                clip.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        player.update();
    }

    @Override
    protected void draw(Canvas canvas) {
        world.draw(canvas);
        if (player.getY() < tree.getY() + 52) {
            player.draw(canvas);
            tree.draw(canvas);
        } else {
            tree.draw(canvas);
            player.draw(canvas);
        }

    }
}
