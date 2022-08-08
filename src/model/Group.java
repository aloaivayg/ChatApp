package model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Group {
	private String id;
	private String name;
	private List<User> userList;
	private List<Message> messageList;
	private boolean isPrivate;

	public Group(String name, boolean isPrivate) {
		this.name = name;
		this.userList = new ArrayList<>();
		this.messageList = new ArrayList<>();
		this.isPrivate = isPrivate;
		setId();
	}

	public List<Message> getMessageList() {
		return messageList;
	}

	public void setMessageList(List<Message> messageList) {
		this.messageList = messageList;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	private void setId() {
		this.id = UUID.randomUUID().toString();
	}

	public boolean isPrivate() {
		return isPrivate;
	}

	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
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