package Pokemon.Enums;

import Engine.Utility.Vector;
import Pokemon.EncounterTables.*;
import Engine.Canvas;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;


public enum Encounters {
    GRASSLAND(3, 13, new Grassland(), new ArrayList<Rectangle>() {{
        add(new Rectangle(128, 864, 384, 96));
    }}),
    FOREST(6, 16, new Forest(), new ArrayList<Rectangle>() {{
        add(new Rectangle(64,512,224,192));
    }}),
    RIVER(8, 20, new River(), new ArrayList<Rectangle>() {{
        add(new Rectangle(736,384,224,64));
        add(new Rectangle(832,352,128,32));
    }}),
    MOUNTAIN(12, 23, new Mountain(), new ArrayList<Rectangle>() {{
        add(new Rectangle(64,64,96,192));
    }}),
    MARSH(18, 30, new Marsh(), new ArrayList<Rectangle>() {{
        add(new Rectangle(768,64,128,224));
    }}),
    CAVE(24,50, new Cave(), new ArrayList<Rectangle>() {{
        add(new Rectangle(224,0,128,160));
    }});

    private final int minLevel;
    private final int maxLevel;
    private final EncounterTable encTable;
    private ArrayList<Rectangle> bounds;

    Encounters(int minLevel, int maxLevel, EncounterTable encTable, ArrayList<Rectangle> bounds) {
        this.minLevel = minLevel;
        this.maxLevel = maxLevel;
        this.encTable = encTable;
        this.bounds = bounds;
    }

    public int getMinLevel() {
        return minLevel;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getRandomLevel() {
        return new Random().nextInt(maxLevel - minLevel) + minLevel;
    }

    public EncounterTable getEncTable() {
        return encTable;
    }

    public ArrayList<Rectangle> getBounds() {
        return bounds;
    }

    public Encounter checkEncounter(Vector playerPosition) {
        for (Rectangle r : this.getBounds()) {
            if (r.contains(playerPosition.getX(), playerPosition.getY())) {
                if (new Random().nextInt(10000) < 150) {
                    return this.getEncTable().getEncounter();
                }
            }
        }
        return null;
    }

    public void DrawBounds(Canvas canvas, Vector playerPosition) {
        for (Rectangle r : this.getBounds()) {
            canvas.drawRectangle(r.x - playerPosition.getX(), r.y - playerPosition.getY(), r.width, r.height, Color.RED);
        }
    }

}
