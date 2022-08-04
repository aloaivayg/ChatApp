package model;

import model.repository.Repository;

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

    //User
//    public User getUser(String username) {
//        return (User) userRepository.get(username);
//    }
//
//    public int getUserIndex(String username) {
////        return userRepository.getIndex(username);
//        return 0;
//    }
//
//    public boolean addUser(String un, String pwd) {
//       User res = (User) userRepository.get(un);
//       if (res==null) {
//           User user = new User(un, pwd);
//           userRepository.add(user);
//           return true;
//       }
//       return false;
//    }
//
//    public void addFriendRequest(User sender, User receiver) {
//        int senderIndex = userRepository.getIndex(sender.getUsername());
//        User temp = receiver;
//        userRepository.saveFriend(senderIndex, temp);
//    }
//
//    public void removeFriendRequest(User user, int id) {
////        int userIndex = userRepository.getIndex(user.getUsername());
////        userRepository.removeFriend(userIndex, id);
//    }
//
//    //Message Repo
//    public User getMessage(String keyword) {
//        return userRepository.get(keyword);
//    }
//
//    public void sendMessageRequest(String keyword) {
//
//    }



}
