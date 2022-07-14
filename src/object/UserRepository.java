package object;

public interface UserRepository {
    User get(String id);
    void add(User user);
    void update(User user);
    void remove(User user);

}
