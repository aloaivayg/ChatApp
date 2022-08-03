package service;

import model.DataStorage;
import model.User;

public class UserService {
    private final DataStorage dataStorage;
    private User currentUser;

    public UserService() {
        dataStorage = DataStorage.createStorage();
    }

    private void signUp(String username, String pwd) {
        if (dataStorage.addUser(username, pwd)) {
            System.out.println("Successful");
        } else {
            System.out.println("User existed");
        }
    }

    private void signIn(String username, String pwd) {
        currentUser = dataStorage.getUser(username);
        if (currentUser!= null) {
            if (currentUser.getHashPassword().equals(pwd)){
                System.out.println("Logged in successful");
            }
        } else {
            System.out.println("Failed");
        }
    }

    private void update(String pwd) {

    }

    public User findUser(String username) {
        User user = dataStorage.getUser(username);
        return user;
    }

    public void addFriend(String username) {
        User targetUser = dataStorage.getUser(username);
        if (currentUser!=null) {
            if (targetUser!=null)
            dataStorage.addFriendRequest(currentUser, targetUser);
        }
    }

    public void removeFriend(String username) {
        int targetIndex = dataStorage.getUserIndex(username);
        if (currentUser!=null) {
            if (targetIndex != -1) {
                dataStorage.removeFriendRequest(currentUser, targetIndex);
            }
        }
    }

    private void sendMessage() {

    }

}
