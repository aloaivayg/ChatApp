package model.repository;

import dao.MessageDAO;
import model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserRepository implements IRepository {
    MessageDAO userDao;
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
    public List<Object> getAll() {
        return Collections.singletonList(userList);
    }

    @Override
    public void add(Object obj) {
    	if (!userList.contains(obj)) {
    		userList.add((User) obj);
		}
    }

    @Override
    public void update(Object obj) {
    	for (int i = 0; i < li.size(); i++) {
			if(this.list.get(i).getUserName().equalsIgnoreCase(user.getUserName())) {
				this.list.remove(i);
				this.list.add(i, user);
				res = true;
				break;
			}
		}

    }

    @Override
    public void remove(int index) {
        userList.remove(index);
    }


}
