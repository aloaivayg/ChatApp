package dao;

import object.User;

public interface DAO {
    void create(User user);
    void read(String id);
    void update(User user);
    void delete(String id);

}
