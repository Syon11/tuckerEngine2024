package Engine;

import java.util.*;
import java.util.function.Consumer;

public class CollidableRepository implements Iterable<StaticEntity> {
    private static CollidableRepository instance;

    private final List<StaticEntity> registeredEntities ;

    private CollidableRepository() {
        // Singleton pattern
        registeredEntities = new ArrayList<>();
    }

    public static CollidableRepository getInstance() {
        if (instance == null) {
            instance = new CollidableRepository();
        }
        return instance;
    }

    public int count() {
        return registeredEntities.size();
    }

    public void register(StaticEntity entity) {
        registeredEntities.add(entity);
    }

    public void register(Collection<StaticEntity> entities) {
        registeredEntities.addAll(entities);
    }

    public void unregister(StaticEntity entity) {
        registeredEntities.remove(entity);
    }

    public void unregister(Collection<StaticEntity> entities) {
        registeredEntities.removeAll(entities);
    }

    @Override
    public Iterator<StaticEntity> iterator() {
        return registeredEntities.iterator();
    }
}