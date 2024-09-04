import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private JPanel panel;

    public GameWindow() {
        InitWindow();
        InitPanel();
        add(panel);
    }

    public void start() {
        setVisible(true);
    }

    private void InitWindow() {
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Bouncing Balls");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setState(JFrame.NORMAL);
    }

    private void InitPanel() {
        panel = new JPanel();
        panel.setBackground(Color.BLUE);
        panel.setFocusable(true);
        panel.setDoubleBuffered(true);
    }
}
