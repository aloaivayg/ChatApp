package model.repository;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IRepository {

    List<User> userList = new ArrayList<>();


    public UserRepository() {

    }

    @Override
    public User get(String username) {
        for (User user: userList) {
            if (username.equals(user.getUsername())) {
                return user;
            }
        }
        return null;
    }

    @Override
    public int getIndex(String username) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<User> getAll() {
        return userList;
    }

    @Override
    public void add(Object obj) {
    	if (!userList.contains((User) obj)) {
    		userList.add((User) obj);
		}
    }
    public void saveFriend(int senderIndex, User receiver) {
        userList.get(senderIndex).getFriendList().add(receiver);
    }

    public void removeFriend(int userIndex, int targetId) {
        userList.get(userIndex).getFriendList().remove(targetId);
    }

    @Override
    public void update(Object obj) {

    }

    @Override
    public void remove(String id) {

    }

    public void removeById(int id) {

    }




}
