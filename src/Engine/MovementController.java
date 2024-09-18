package Engine;

import java.awt.event.KeyEvent;

public class MovementController extends Controller{

    private int upKey = KeyEvent.VK_UP;
    private int downKey = KeyEvent.VK_DOWN;
    private int leftKey = KeyEvent.VK_LEFT;
    private int rightKey = KeyEvent.VK_RIGHT;

    public MovementController() {
        bindKey(upKey);
        bindKey(downKey);
        bindKey(leftKey);
        bindKey(rightKey);
    }

    public boolean isUpPressed() {
        return isKeyPressed(upKey);
    }

    public boolean isDownPressed() {
        return isKeyPressed(downKey);
    }

    public boolean isLeftPressed() {
        return isKeyPressed(leftKey);
    }

    public boolean isRightPressed() {
        return isKeyPressed(rightKey);
    }

    public boolean isMoving() {
        return isUpPressed() || isDownPressed() || isLeftPressed() || isRightPressed();
    }

    public void setUpKey(int keyCode) {
        unbindKey(upKey);
        bindKey(keyCode);
        upKey = keyCode;
    }

    public void setDownKey(int keyCode) {
        unbindKey(downKey);
        bindKey(keyCode);
        downKey = keyCode;
    }

    public void setLeftKey(int keyCode) {
        unbindKey(leftKey);
        bindKey(keyCode);
        leftKey = keyCode;
    }

    public void setRightKey(int keyCode) {
        unbindKey(rightKey);
        bindKey(keyCode);
        rightKey = keyCode;
    }



}
