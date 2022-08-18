//package model;
//
//import java.util.List;
//
//public class PrivateGroup extends Group{
//	public User admin;
//	public PrivateGroup(String id, String name, List<User> userList) {
//
//	}
//
//}
//
//

package model;

import java.util.List;

public class PrivateGroup extends Group {
	public User admin;
	public PrivateGroup(String name, boolean isPrivate) {
		super(name, isPrivate);
		// TODO Auto-generated constructor stub
	}
	

}
