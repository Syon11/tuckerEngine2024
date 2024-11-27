package Engine;

import Engine.Enums.CollisionType;
import Engine.Utility.Vector;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.IntNode;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Map {
    private TileSet tileSet;
    private ArrayList<Tile> layer1;
    private ArrayList<Tile> layer2;
    private ArrayList<Tile> layer3;
    private ArrayList<Tile> collisionLayer;

    private String jsonMapPath;
    private InputStream is;

    public Map(String mapPath, TileSet tileSet) {
        this.jsonMapPath = mapPath;
        this.tileSet = tileSet;
        layer1 = new ArrayList<>();
        layer2 = new ArrayList<>();
        layer3 = new ArrayList<>();
        collisionLayer = new ArrayList<>();
        try {
            loadInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void update(Vector worldPosition) {
        for(Tile tile : layer1) {
            tile.update(worldPosition);
        }
    }

    public void drawEarly(Canvas canvas, Vector worldPosition) {
        canvas.drawString("Screen size: X: " + Screen.getWidth() + "  Y: " + Screen.getHeight(), 100, 100, Color.WHITE);
        canvas.drawString("World position: X " + worldPosition.getX() + "  Y: " + worldPosition.getY(), 100, 120, Color.WHITE);
        drawLayer(layer1, canvas, worldPosition);
        drawLayer(layer2, canvas, worldPosition);
    }

    public void drawLate(Canvas canvas, Vector worldPosition) {
        drawLayer(layer3, canvas, worldPosition);
    }

    private void drawLayer(ArrayList<Tile> layer, Canvas canvas, Vector worldPosition) {
        for(Tile tile : layer) {
            if (tile.isInScreen(worldPosition)) {
                tile.draw(canvas, worldPosition);
            }
        }
    }

    public void loadInputStream() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        is = this.getClass().getClassLoader().getResourceAsStream(jsonMapPath);
        JsonNode jsonNode = mapper.readTree(is);
        loadLayer(layer3, jsonNode.get("layerInstances").get(1).get("gridTiles"));
        loadLayer(layer2, jsonNode.get("layerInstances").get(2).get("gridTiles"));
        loadLayer(layer1, jsonNode.get("layerInstances").get(3).get("gridTiles"));
        loadCollisionLayer(layer1, jsonNode.get("layerInstances").get(0).get("intGridCsv"));
        System.out.println("Blah");
    }

    private void loadLayer(ArrayList<Tile> layer, JsonNode node) {
        for (JsonNode row : node){
            Tile tile = new Tile(row.get("t").asInt(), row.get("px").get(0).asInt(), row.get("px").get(1).asInt(), tileSet);
            layer.add(tile);
        }
    }

    private void loadCollisionLayer(ArrayList<Tile> layer, JsonNode node) {
        int currentTile = 0;
        for (JsonNode collisionType : node) {
            switch(collisionType.asInt()) {
                case 1: layer.get(currentTile).setCollision(CollisionType.TOP_LEFT_FULL);
                case 2: layer.get(currentTile).setCollision(CollisionType.TOP);
                case 3: layer.get(currentTile).setCollision(CollisionType.TOP_RIGHT_FULL);
                case 4: layer.get(currentTile).setCollision(CollisionType.RIGHT);
                case 5: layer.get(currentTile).setCollision(CollisionType.BOTTOM_RIGHT_FULL);
                case 6: layer.get(currentTile).setCollision(CollisionType.BOTTOM);
                case 7: layer.get(currentTile).setCollision(CollisionType.BOTTOM_LEFT_FULL);
                case 8: layer.get(currentTile).setCollision(CollisionType.LEFT);
                case 9: layer.get(currentTile).setCollision(CollisionType.FULL);
            }
            currentTile++;

        }
    }



}

