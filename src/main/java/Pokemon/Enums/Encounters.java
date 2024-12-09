package Pokemon.Enums;

import Pokemon.EncounterTables.*;

import java.awt.*;
import java.util.ArrayList;


public enum Encounters {
    GRASSLAND(3, 13, new Grassland(), new ArrayList<Rectangle>() {
        {new Rectangle(128, 864, 384, 96);}
    }),
    FOREST(6, 16, new Forest(), new ArrayList<Rectangle>() {
        {new Rectangle(2,2,2,2);}
    }),
    RIVER(8, 20, new River(), new ArrayList<Rectangle>() {
        {new Rectangle(2,2,2,2);}
    }),
    MOUNTAIN(12, 23, new Mountain(), new ArrayList<Rectangle>() {
        {new Rectangle(2,2,2,2);}
    }),
    MARSH(18, 30, new Marsh(), new ArrayList<Rectangle>() {
        {new Rectangle(2,2,2,2);}
    }),
    CAVE(24,50, new Cave(), new ArrayList<Rectangle>() {
        {new Rectangle(2,2,2,2);}
    });

    private final int minLevel;
    private final int maxLevel;
    private final EncounterTable encTable;
    private ArrayList<Rectangle> bounds;

    Encounters(int minLevel, int maxLevel, EncounterTable encTable, ArrayList<Rectangle> bounds) {
        this.minLevel = minLevel;
        this.maxLevel = maxLevel;
        this.encTable = encTable;
    }

    public int getMinLevel() {
        return minLevel;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public EncounterTable getEncTable() {
        return encTable;
    }

    public ArrayList<Rectangle> getBounds() {
        return bounds;
    }



}
