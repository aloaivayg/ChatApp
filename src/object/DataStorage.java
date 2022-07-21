package object;

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

    public User getUser(String firstName) {
        return userRepository.get(firstName);
    }

    public void addUser() {
        User user = new User();
        user.setFirstName("Bao");
        userRepository.add(user);
    }

}
