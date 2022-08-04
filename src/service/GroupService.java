package service;

import java.util.List;

import model.DataStorage;
import model.Group;
import model.PrivateGroup;
import model.PublicGroup;
import model.User;

public class GroupService {
	DataStorage dataStorage;
	UserService userService;

	public GroupService() {
		super();
		dataStorage = DataStorage.createStorage();
	}

	void createGroup(String groupName, boolean isPrivate) {
		if (isPrivate == true) {
			PrivateGroup privateGroup = new PrivateGroup(groupName, isPrivate);
			dataStorage.groupRepository.insert(privateGroup);
		} else {
			PublicGroup publicGroup = new PublicGroup(groupName, isPrivate);
			dataStorage.groupRepository.insert(publicGroup);
		}
	}
	
	public boolean joinPublicGroup(String groupId, String userName) {
		var group = getGroupById(groupId);
		if (group == null) {
			return false;
		}
		var user = userService.getUser(userName);
		if (user == null) {
			return false;
		}
		return true;
	}
	
	public boolean removeUserFromPrivateGroup(String adminUsername, String userUsername, String groupId) {
		var group = getGroupById(groupId);
		if (group == null) {
			return false;
		}
		var user = userService.getUser(userUsername);
		if (user == null) {
			return false;
		}
		if (!userService.currentUser.getUsername().equalsIgnoreCase(adminUsername)) {
			return false;
		}
		if (!group.getUserList().contains(user)) {
			return false;
		}
		group.getUserList().remove(user);
		return true;
	}
	
	public boolean addUserToPrivateGroup(String adminUsername, String userUsername, String groupId) {
		var group = getGroupById(groupId);
		if (group == null) {
			return false;
		}
		var user = userService.getUser(userUsername);
		if (user == null) {
			return false;
		}
		if (!userService.currentUser.getUsername().equalsIgnoreCase(adminUsername)) {
			return false;
		}
		if (group.getUserList().contains(user)) {
			return false;
		}
		group.getUserList().add(user);
		return true;
	}
	
	public Group getGroupById(String groupId) {
		return (Group) dataStorage.groupRepository.find(g -> g.getId().equals(groupId));
	}
	
	public Group getGroupByName(String groupName) {
		return (Group) dataStorage.groupRepository.find(g -> g.getName().equals(groupName));
	}

	boolean findPrivateGroupAdmin(List<User> users, User admin) {
		if (users.contains(admin)) {
			return true;
		}
		return false;
	}

}
