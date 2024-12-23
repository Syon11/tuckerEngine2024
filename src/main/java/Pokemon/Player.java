package Pokemon;

import Engine.*;
import Engine.Utility.Vector;
import Pokemon.Enums.GameState;
import Pokemon.Enums.PkmnSpecies;
import Pokemon.Model.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Player extends ControllableEntity {
    private static final String SPRITE_PATH = "images/trainer.png";
    private static final int ANIMATION_SPEED = 8;
    private static final int SPEED = 3;
    private static final int RUNSPEED = 8;
    private int currentPokemon;
    private ArrayList<Pokemon> party;

    public Player(MovementController controller, Vector size, Sprite sprite) {
        super(controller, size, sprite);
        resize(size.getX(), size.getY());
        teleport(100,100);
        setSpeed(SPEED);
        party = new ArrayList<>();
        load();
    }

    public Player(MovementController controller) {
        super(controller, new Vector(32, 32), new Sprite(SPRITE_PATH, 4, 3, ANIMATION_SPEED));
        resize(size.getX(), size.getY());
        teleport(100, 100);
        setSpeed(SPEED);
        party = new ArrayList<>();
        load();
    }

    public void update(GameState gameState) {
        super.update();
        if (gameState == GameState.MOVING) {
            moveWithController();
            sprite.update(hasMoved());
        }
    }

    public void draw(Canvas canvas) {
        sprite.draw(getDirection(), canvas, screenOffsetX, screenOffsetY);
    }

    public Vector getWorldPosition() {
        return new Vector(worldX, worldY);
    }

    public Vector getPlayerPosition() { return new Vector(worldX + screenOffsetX, worldY + screenOffsetY); }

    private void load() {
        sprite.load();
        screenOffsetX = (Screen.getWidth() - size.getX()) / 2;
        screenOffsetY = (Screen.getHeight() - size.getY()) / 2;
        party.add(new Pokemon("Bulbasaur", PkmnSpecies.BULBASAUR));
        party.add(new Pokemon("Charmander", PkmnSpecies.CHARMANDER));
        party.add(new Pokemon("Squirtle", PkmnSpecies.SQUIRTLE));
        party.get(0).setLevel(10);
        party.get(0).setMovesForLevel();
        party.get(0).healDamage(999);
        party.get(0).recoverMoves();
        party.get(1).setLevel(10);
        party.get(1).setMovesForLevel();
        party.get(1).healDamage(999);
        party.get(1).recoverMoves();
        party.get(2).setLevel(10);
        party.get(2).setMovesForLevel();
        party.get(2).healDamage(999);
        party.get(2).recoverMoves();
    }

    public List<Pokemon> getParty() {
        return party;
    }

    public void addPokemonToParty(Pokemon pokemon) {
        if (party.size() >= 6) {
            return;
        }
        party.add(pokemon);
    }

    public int getCurrentPokemonIndex() {
        return currentPokemon;
    }

    public Pokemon getCurrentPokemon() {
        return party.get(currentPokemon);
    }

    public void setCurrentPokemon(Pokemon pokemon) {
        if (party.contains(pokemon)) {
            currentPokemon = party.indexOf(pokemon);
        }
    }
}
