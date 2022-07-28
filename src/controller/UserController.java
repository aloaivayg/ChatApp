package controller;

import object.DataStorage;
import object.User;

public class UserController {
    private final DataStorage dataStorage;

    public UserController() {
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
}
