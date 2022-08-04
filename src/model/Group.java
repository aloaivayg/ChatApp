package model;

import java.util.List;

public abstract class Group {
    private String id;
    private String name;
    private List<User> userList;
    private boolean type;

    public Group(String id, String name, List<User> userList) {
    	this.id = id;
    	this.name = name;
    	this.userList = userList;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	
    
    
}
