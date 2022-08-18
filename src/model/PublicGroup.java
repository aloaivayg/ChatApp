package model;

import java.util.List;

public class PublicGroup extends Group {

	public PublicGroup(String name, boolean isPrivate) {
		super(name, isPrivate);
	}

	public String inviteCode;

	public String getInviteCode() {
		return inviteCode;
	}

	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}

}
