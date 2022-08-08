package model.datastorage;

import model.File;
import model.Group;
import model.Message;
import model.User;
import repository.Repository;

public class DataStorage {

    private static DataStorage storage = null;
    public Repository<User> userRepository;
    public Repository<Group> groupRepository;
    public Repository<File> fileRepository;
    public Repository<Message> messageRepository;

    private DataStorage() {
        userRepository = new Repository<>();
        groupRepository = new Repository<>();
        fileRepository = new Repository<>();
        messageRepository = new Repository<>();
    }

    public static DataStorage createStorage() {
        if (storage == null) {
            storage = new DataStorage();
        }
        return storage;
    }

}
