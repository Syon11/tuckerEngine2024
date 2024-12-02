package Pokemon;

import Engine.Canvas;

import java.awt.*;
import java.util.ArrayList;

public class Dialogue {
    int index;
    int currentCharacter;
    int dialogueSpeed;
    final int TYPING_SPEED;
    private ArrayList<String> lines;


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

    public boolean isAtLineEnd() {
        return currentCharacter >= lines.get(index).length();
    }

    public boolean isAtDialogueEnd() {
        return index >= lines.size() - 1;
    }
}
