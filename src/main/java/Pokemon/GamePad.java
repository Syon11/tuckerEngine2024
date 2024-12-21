package Pokemon;

import Engine.MovementController;

import java.awt.event.KeyEvent;

public class GamePad extends MovementController {
    private int cancelKey = KeyEvent.VK_X;
    private int cancelKey2 = KeyEvent.VK_ESCAPE;
    private int acceptKey = KeyEvent.VK_Z;
    private int acceptKey2 = KeyEvent.VK_ENTER;
    private int menuKey = KeyEvent.VK_C;
    private int menuKey2 = KeyEvent.VK_BACK_SPACE;
    private int tempQuitKey = KeyEvent.VK_Q;

    public GamePad() {
        bindKey(cancelKey);
        bindKey(cancelKey2);
        bindKey(acceptKey);
        bindKey(acceptKey2);
        bindKey(tempQuitKey);
        bindKey(menuKey);
        bindKey(menuKey2);
    }

    public boolean isCancelKeyPressed() {
        return isKeyPressed(cancelKey) || isKeyPressed(cancelKey2);
    }

    public boolean isAcceptKeyPressed() {
        return isKeyPressed(acceptKey) || isKeyPressed(acceptKey2);
    }

    public boolean isMenuKeyPressed() {
        return isKeyPressed(menuKey) || isKeyPressed(menuKey2);
    }

    public boolean isAnyKeyPressed() {
        return isKeyPressed(cancelKey) || isKeyPressed(cancelKey2) || isKeyPressed(acceptKey) || isKeyPressed(acceptKey2) || isKeyPressed(menuKey) || isKeyPressed(menuKey2);
    }

    public boolean isQuitKeyPressed() {
        return isKeyPressed(tempQuitKey);
    }
}