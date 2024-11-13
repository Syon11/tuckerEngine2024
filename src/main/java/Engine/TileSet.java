package Engine;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

public class TileSet {
    private static int OFFSET;
    private static int OFFSET_HORIZONTAL;
    private static int OFFSET_VERTICAL;

    private static int TILE_WIDTH;
    private static int TILE_HEIGHT;

    private static String FILE_PATH;

    private BufferedImage fullImage;
    private ArrayList<Image> tiles;


    public TileSet(int tileWidth, int tileHeight, String filePath) {
        TILE_WIDTH = tileWidth;
        TILE_HEIGHT = tileHeight;

        OFFSET = 0;
        OFFSET_HORIZONTAL = 0;
        OFFSET_VERTICAL = 0;

        FILE_PATH = filePath;

        init();
    }

    public TileSet(int tileWidth, int tileHeight, int offset, String filePath) {
        TILE_WIDTH = tileWidth;
        TILE_HEIGHT = tileHeight;

        OFFSET = offset;
        OFFSET_HORIZONTAL = 0;
        OFFSET_VERTICAL = 0;

        FILE_PATH = filePath;

        init();
    }

    public TileSet(int tileWidth, int tileHeight, int offset, int offsetHorizontal, int offsetVertical, String filePath) {
        TILE_WIDTH = tileWidth;
        TILE_HEIGHT = tileHeight;

        OFFSET = offset;
        OFFSET_HORIZONTAL = offsetHorizontal;
        OFFSET_VERTICAL = offsetVertical;

        FILE_PATH = filePath;

        init();
    }

    public Image getTile(int index) {
        return tiles.get(index);
    }

    public int getTileCount() {
        return tiles.size();
    }

    private void init() {
        try {
            loadFullImage();
            tiles = new ArrayList<>();
            splitTiles();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadFullImage() throws IOException {
        fullImage = ImageIO.read(getClass().getClassLoader().getResource(FILE_PATH));
    }

    private void splitTiles() {
        int rows = fullImage.getHeight() / (TILE_HEIGHT + OFFSET);
        int cols = fullImage.getWidth() / (TILE_WIDTH + OFFSET);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                tiles.add(fullImage.getSubimage(j * (TILE_WIDTH + OFFSET) + OFFSET_HORIZONTAL, i * (TILE_HEIGHT + OFFSET) + OFFSET_VERTICAL, TILE_WIDTH, TILE_HEIGHT));
            }
        }
    }




}
