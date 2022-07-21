package object;

import dao.UserDaoImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserRepository implements IRepository {
    UserDaoImpl userDao;
    List<User> userList = new ArrayList<>();

    StringBuilder sb = new StringBuilder();
    public UserRepository() {
        userDao = new UserDaoImpl();
    }

    @Override
    public User get(String firstName) {
        for (User user: userList) {
            if (firstName.equals(user.getFirstName())) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<Object> getAll() {
        return Collections.singletonList(userList);
    }

    @Override
    public void add(Object obj) {
        userList.add((User) obj);
    }

    @Override
    public void update(Object obj) {

    }

    @Override
    public void remove(Object obj) {

    }


}
