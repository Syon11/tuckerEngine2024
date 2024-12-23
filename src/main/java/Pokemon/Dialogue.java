package Pokemon;

import Engine.Canvas;
import Pokemon.Enums.GameState;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.*;
import java.util.ArrayList;

public class Dialogue {
    private int index;
    private int currentCharacter;
    private int dialogueSpeed;
    private final int TYPING_SPEED;
    private ArrayList<String> lines;
    private boolean isIdle;
    private boolean debouncePress;

    public Dialogue(ArrayList<String> strings, int typingSpeed) {
        TYPING_SPEED = typingSpeed;
        index = 0;
        currentCharacter = 0;
        dialogueSpeed = 0;
        lines = strings;
    }

    public void addString(String string){
        lines.add(string);
    }

    public void update() {
        dialogueSpeed--;
        if (dialogueSpeed <= 0) {
            if (currentCharacter < lines.get(index).length()) {
                currentCharacter++;
            }
            dialogueSpeed = TYPING_SPEED;
        }
    }

    public void skipDialogue() {
        currentCharacter = lines.get(index).length();
    }

    public void nextLine() {
        currentCharacter = 0;
        dialogueSpeed = TYPING_SPEED;
        index++;

        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream audio = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResourceAsStream("sfx/murloc.wav"));
            clip.open(audio);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Draw(Canvas canvas) {
        if (index < lines.size()) {
            canvas.drawRectangle(0, 400, 800, 200, Color.BLACK);
            canvas.drawRectangle(1, 401, 798, 198, Color.WHITE);
            canvas.drawRectangle(2, 402, 796, 196, Color.BLACK);
            canvas.drawRectangle(3, 403, 794, 194, Color.WHITE);
            canvas.drawString(lines.get(index).substring(0, currentCharacter), 10, 420, Color.BLACK);
        }
    }

    public GameState handle(GamePad gamePad) {
        if (gamePad.isAcceptKeyPressed() && !debouncePress) {
            debouncePress = true;
            if (isIdle) {
                if (isAtDialogueEnd()) {
                    return GameState.MOVING;
                }
                nextLine();
                isIdle = false;
            } else {
                skipDialogue();
            }
        }
        if (!gamePad.isAcceptKeyPressed()) {
            debouncePress = false;
        }
        if (currentCharacter == lines.get(index).length()) {
            isIdle = true;
        }
        return GameState.DIALOGUE;
    }

    public boolean isAtLineEnd() {
        return currentCharacter >= lines.get(index).length();
    }

    public boolean isAtDialogueEnd() {
        return index >= lines.size() - 1;
    }
}
