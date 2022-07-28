package object;

import java.util.List;

public class PublicGroup extends Group{
	private String name;
	private List<User> listUsers;
	public PublicGroup(String name, List<User> listUsers) {
		super();
		this.name = name;
		this.listUsers = listUsers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<User> getListUsers() {
		return listUsers;
	}
	public void setListUsers(List<User> listUsers) {
		this.listUsers = listUsers;
	}
	
	
	
}
