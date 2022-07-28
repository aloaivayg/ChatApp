package model.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import model.Group;


public class GroupRepository implements IRepository<Group>{
	
	List<Group> listGroups;
	String groupID;

	public GroupRepository( String groupID) {
		super();
		this.groupID = groupID;
		this.listGroups = new ArrayList<>();
	}

	@Override
	public Group get(String id) {
		for (int i = 0; i < listGroups.size(); i++) {
            if (listGroups.get(i).getId().equalsIgnoreCase(id)) {
				return listGroups.get(i);
			}
        }
        return null;
	}

	@Override
	public int getId(String id) {
		for (int i = 0; i < listGroups.size(); i++) {
            if (listGroups.get(i).getId().equalsIgnoreCase(id)) {
				return i;
			}
        }
		return -1;
	}

	@Override
	public List<Group> getAll() {
		// TODO Auto-generated method stub
		return listGroups;
	}


	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Group obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Group obj) {
		// TODO Auto-generated method stub
		
	}

}
