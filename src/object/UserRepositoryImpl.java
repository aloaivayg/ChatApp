package object;

import dao.UserDaoImpl;

public class UserRepositoryImpl implements UserRepository{
    UserDaoImpl userDao;
    @Override
    public User get(String id) {
        return null;
    }

    @Override
    public void add(User user) {
        userDao.create(user);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void remove(User user) {

    }
}
