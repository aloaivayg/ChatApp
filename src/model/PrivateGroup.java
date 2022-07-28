package model;

import java.util.List;

public class PrivateGroup extends Group{
	private String nameGroup;
	private String adminUser;
	private List<User> listUsers;
	public PrivateGroup(String name,String adminUser, List<User> listUsers) {
		super();
		this.adminUser = adminUser;
		this.nameGroup = name;
		this.listUsers = listUsers;
	}
	public String getName() {
		return nameGroup;
	}
	public void setName(String name) {
		this.nameGroup = name;
	}
	public List<User> getListUsers() {
		return listUsers;
	}
	public void setListUsers(List<User> listUsers) {
		this.listUsers = listUsers;
	}
}


