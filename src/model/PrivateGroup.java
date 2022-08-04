package model;

import java.util.List;

public class PrivateGroup extends Group {

	public PrivateGroup(String name, boolean isPrivate) {
		super(name, isPrivate);
		// TODO Auto-generated constructor stub
	}

	public User admin;

}
