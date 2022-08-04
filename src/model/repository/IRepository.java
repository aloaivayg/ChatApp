package model.repository;

import javax.swing.text.html.parser.Entity;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public interface IRepository<Entity> {
    List<Entity> get(Predicate<Entity> predicate, Comparator<Entity> filter);

    Entity find(Predicate<Entity> predicate);

    void insert(Entity entity);

    void update(Entity entity, Entity entity1);

    void delete(Entity entity);

}
