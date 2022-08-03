package model;

import model.repository.MessageRepository;
import model.repository.UserRepository;

public class DataStorage {
    private static DataStorage storage = null;
    UserRepository userRepository;
    MessageRepository messageRepository;

    private DataStorage() {
        userRepository = new UserRepository();
        messageRepository = new MessageRepository();
    }

    public static DataStorage createStorage() {
        if (storage == null) {
            storage = new DataStorage();
        }
        return storage;
    }

    //User
    public User getUser(String username) {
        return userRepository.get(username);
    }

    public int getUserIndex(String username) {
        return userRepository.getIndex(username);
    }

    public boolean addUser(String un, String pwd) {
       User res = userRepository.get(un);
       if (res==null) {
           User user = new User(un, pwd);
           userRepository.add(user);
           return true;
       }
       return false;
    }

    public void addFriendRequest(User sender, User receiver) {
        int senderIndex = userRepository.getIndex(sender.getUsername());
        User temp = receiver;
        userRepository.saveFriend(senderIndex, temp);
    }

    public void removeFriendRequest(User user, int id) {
        int userIndex = userRepository.getIndex(user.getUsername());
        userRepository.removeFriend(userIndex, id);
    }

    //Message Repo
    public User getMessage(String keyword) {
        return userRepository.get(keyword);
    }



}
