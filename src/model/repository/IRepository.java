package model.repository;

import java.util.List;

public interface IRepository<T> {
    Object get(String id);
    int getIndex(String id);
    List<T> getAll();

    void add(T obj);
    void update(T obj);
    void remove(String id);

}
