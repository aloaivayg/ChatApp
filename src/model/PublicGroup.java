package model;

import java.util.List;

public class PublicGroup extends Group{
	
	public String inviteCode;
	public PublicGroup(String id, String name, User admin, List<User> userList) {
		
	}
	public String getInviteCode() {
		return inviteCode;
	}
	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}
	
}
