package model;

import java.util.List;

public class PrivateGroup extends Group{
	public User admin;
	public PrivateGroup(String id, String name, List<User> userList) {
		super(id, name, userList);
	}
	
}


