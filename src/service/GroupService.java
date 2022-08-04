package service;

import java.util.List;

import model.DataStorage;
import model.Group;
import model.PrivateGroup;
import model.PublicGroup;
import model.User;

public class GroupService {
	DataStorage dataStorage;

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

	boolean findPrivateGroupAdmin(List<User> users, User admin) {
		if (users.contains(admin)) {
			return true;
		}
		return false;
	}

}
