package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Group {
    private String id;
    private String name;
    private List<User> userList;
    private boolean isPrivate;

    public Group(String name, boolean isPrivate) {
    	this.name = name;
    	this.userList = new ArrayList<>();
    	this.isPrivate = isPrivate;
    }
    

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public boolean isPrivate() {
		return isPrivate;
	}


	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
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
