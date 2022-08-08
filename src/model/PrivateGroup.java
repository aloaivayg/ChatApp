package model;

import java.util.List;

public class PrivateGroup extends Group{
	public PrivateGroup(String name, boolean isPrivate) {
		super(name, isPrivate);

	}

	public User admin;

	public User getAdmin() {
		return admin;
	}

	public void setAdmin(User admin) {
		this.admin = admin;
	}


}