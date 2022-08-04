package service;

import java.util.List;

import model.Group;
import model.PrivateGroup;
import model.PublicGroup;
import model.User;
import model.repository.GroupRepository;

public class GroupService {

	PublicGroup publicGroup;
	PrivateGroup privateGroup;
	List<Group> listGroup;
	public GroupService(PublicGroup publicGroup, PrivateGroup privateGroup) {
		super();
		this.publicGroup = publicGroup;
		this.privateGroup = privateGroup;
	}
	void CreateGroupByInvite(String id, User user) {
		for (int i = 0; i < listGroup.size(); i++) {
			
		}
	}

}
