package model;

import java.util.List;

public abstract class Group {
    private String id;
    private int groupNumber;
    private List<User> userList;

    public Group() {

    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public int getGroupNumber() {
		return userList.size();
	}
    
    
}
