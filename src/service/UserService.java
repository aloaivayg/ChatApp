package service;

import model.datastorage.DataStorage;
import model.User;

public class UserService {
    private final DataStorage dataStorage;
    private User currentUser;

    public UserService() {
        dataStorage = DataStorage.createStorage();
    }


    public User getUser(String username){
        return dataStorage.userRepository.find(u -> u.getUsername().equals(username));
    }

    public boolean signUp(String username, String pwd){
        User resUser = getUser(username);
        if (resUser == null) {
            User newUser = new User(username, pwd);
            dataStorage.userRepository.insert(newUser);
            return true;
        } else {
            System.out.println("Username existed");
            return false;
        }
    }

    private boolean signIn(String username, String pwd) {
        currentUser = getUser(username);

        if (currentUser!= null) {
            if (currentUser.getHashPassword().equals(pwd)){
                System.out.println("Logged in successful");
            }
            return true;
        } else {
            System.out.println("Failed");
            return false;
        }
    }


    //need to handle duplicate request
    public void sendFriendRequest(String username) {
        User targetUser = getUser(username);
        if (currentUser!=null) {
            if (targetUser!=null) {
                targetUser.setFriendRequest(currentUser, false);
            }
        }
    }

    public void acceptFriendRequest(String username) {
        User targetUser = getUser(username);
        targetUser.setFriendRequest(targetUser, true);
        currentUser.getFriendList().add(targetUser);
    }

    public boolean removeUser(String username) {
        if (currentUser!=null) {
            dataStorage.userRepository.delete(currentUser);
            return true;
        }
        return false;
    }

    public void getGroupOfUsers(User user) {
    }




}
