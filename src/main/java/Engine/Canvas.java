package Engine;

import java.awt.*;

public class Canvas {

    private Graphics2D graphics;

    public Canvas(Graphics2D graphics) {
        this.graphics = graphics;
    }

    public void drawString(String text, int x, int y, Paint paint) {
        graphics.setPaint(paint);
        graphics.drawString(text, x, y);
    }

    public void drawCircleFromCenter(int x, int y, int radius, Paint paint) {
        graphics.setPaint(paint);
        graphics.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    public void drawCircle(int x, int y, int radius, Paint paint) {
        graphics.setPaint(paint);
        graphics.fillOval(x, y, radius * 2, radius * 2);
    }

    public void drawRectangle(int x, int y, int width, int height, Paint paint) {
        graphics.setPaint(paint);
        graphics.fillRect(x, y, width, height);
    }

    public void drawRectangle(StaticEntity staticEntity, Paint paint) {
        drawRectangle(staticEntity.getWorldX(), staticEntity.getY(), staticEntity.getWidth(), staticEntity.getHeight(), paint);
    }

    public void drawImage(Image image, int x, int y) {
        graphics.drawImage(image, x, y, null);
    }

    public void drawScaledImage(Image image, int x, int y, int width, int height) {
        graphics.drawImage(image, x, y, width, height, null);
    }
}
