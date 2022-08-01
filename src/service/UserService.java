package service;

import model.DataStorage;
import model.User;

public class UserService {
    private final DataStorage dataStorage;

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
        User temp = dataStorage.getUser(username);
        if (temp!= null) {
            if (temp.getHashPassword().equals(pwd)){
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
    private void sendMessage() {

    }

}
