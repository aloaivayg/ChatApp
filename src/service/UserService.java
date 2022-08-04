package service;

import model.DataStorage;
import model.User;

import java.util.function.Predicate;

public class UserService {
    private final DataStorage dataStorage;
    private User currentUser;

    public UserService() {
        dataStorage = DataStorage.createStorage();
    }


    public User getUser(String username){
        return (User) dataStorage.userRepository.find(u -> u.getUsername().equals(username));
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
        User targetUser = dataStorage.userRepository.find(u -> u.getUsername().equals(username));

    }

    public void removeUser(String username) {
        if (currentUser!=null) {
            dataStorage.userRepository.delete(currentUser);
        } else {
            System.out.println("User not existed");
        }
    }


//    private void signUp(String username, String pwd) {
//        if (dataStorage.addUser(username, pwd)) {
//            System.out.println("Successful");
//        } else {
//            System.out.println("User existed");
//        }
//    }
//
//    private void signIn(String username, String pwd) {
//        currentUser = dataStorage.getUser(username);
//        if (currentUser!= null) {
//            if (currentUser.getHashPassword().equals(pwd)){
//                System.out.println("Logged in successful");
//            }
//        } else {
//            System.out.println("Failed");
//        }
//    }
//
//    private void update(String pwd) {
//
//    }
//
//    public User findUser(String username) {
//        User user = dataStorage.getUser(username);
//        return user;
//    }
//
//    public void addFriend(String username) {
//        User targetUser = dataStorage.getUser(username);
//        if (currentUser!=null) {
//            if (targetUser!=null)
//            dataStorage.addFriendRequest(currentUser, targetUser);
//        }
//    }
//
//    public void removeFriend(String username) {
//        int targetIndex = dataStorage.getUserIndex(username);
//        if (currentUser!=null) {
//            if (targetIndex != -1) {
//                dataStorage.removeFriendRequest(currentUser, targetIndex);
//            }
//        }
//    }

    private void sendMessage() {

    }

}
