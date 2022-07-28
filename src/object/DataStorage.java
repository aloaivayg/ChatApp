package object;

import object.repository.UserRepository;

public class DataStorage {
    private static DataStorage storage = null;
    UserRepository userRepository;

    private DataStorage() {
        userRepository = new UserRepository();
    }

    public static DataStorage createStorage() {
        if (storage == null) {
            storage = new DataStorage();
        }
        return storage;
    }

    public User getUser(String username) {
        return userRepository.get(username);
    }

    public boolean addUser(String un, String pwd) {
       User res = userRepository.get(un);
       if (res!=null) {
           User user = new User(un, pwd);
           userRepository.add(user);
           return true;
       }
       return false;
    }

    public boolean removeUser(String un) {
        int res = userRepository.getId(un);
        if (res!=-1) {
            userRepository.remove(res);
            return true;
        }
        return false;
    }

}
