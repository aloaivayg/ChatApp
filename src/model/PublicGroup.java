//package model;
//
//import java.util.List;
//
//public class PublicGroup extends Group{
//
//	public String inviteCode;
//	public PublicGroup(String id, String name, User admin, List<User> userList) {
//
//	}
//	public String getInviteCode() {
//		return inviteCode;
//	}
//	public void setInviteCode(String inviteCode) {
//		this.inviteCode = inviteCode;
//	}
//
//}
package model;

import java.util.List;

public class PublicGroup extends Group {

	public PublicGroup(String name, boolean isPrivate) {
		super(name, isPrivate);
		// TODO Auto-generated constructor stub
	}

	public String inviteCode;

	public String getInviteCode() {
		return inviteCode;
	}

	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}

}
