package object;

import java.util.ArrayList;
import java.util.List;

public interface IRepository<T> {
    User get(String id);
    List<T> getAll();

    void add(T obj);
    void update(T obj);
    void remove(T obj);

}
