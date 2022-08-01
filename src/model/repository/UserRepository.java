package model.repository;

import dao.MessageDAO;
import model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserRepository implements IRepository {

    List<User> userList = new ArrayList<>();


    public UserRepository() {

    }

    @Override
    public User get(String username) {
        for (User user: userList) {
            if (username.equals(user.getFirstName())) {
                return user;
            }
        }
        return null;
    }

    @Override
    public int getId(String username) {
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
    	if (!userList.contains(obj)) {
    		userList.add((User) obj);
		}
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
