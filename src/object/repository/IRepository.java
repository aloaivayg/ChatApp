package object.repository;

import object.User;

import java.util.ArrayList;
import java.util.List;

public interface IRepository<T> {
    User get(String id);
    int getId(String id);
    List<T> getAll();

    void add(T obj);
    void update(T obj);
    void remove(int id);

}
