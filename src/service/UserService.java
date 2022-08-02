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

    private User signIn(String username, String pwd) {
        currentUser = dataStorage.getUser(username);
        if (currentUser!= null) {
            if (currentUser.getHashPassword().equals(pwd)){
                System.out.println("Logged in successful");
            }
        } else {
            System.out.println("Failed");
        }
        return currentUser;
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

    private void sendMessage() {

    }

}
