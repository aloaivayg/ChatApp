package model.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import model.Group;
import model.User;


public class GroupRepository implements IRepository<Group>{
	List<Group> listGroup;
	
	@Override
	public Object get(String id) {
		for (int i = 0; i < listGroup.size(); i++) {
			if (listGroup.get(i).getId().equalsIgnoreCase(id)) {
				return listGroup.get(i);
			}
		}
		return null;
	}

	@Override
	public int getIndex(String id) {
		for (int i = 0; i < listGroup.size(); i++) {
			if (listGroup.get(i).getId().equalsIgnoreCase(id)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public List<Group> getAll() {
		// TODO Auto-generated method stub
		return listGroup;
	}

	@Override
	public void add(Group obj) {
		for (int i = 0; i < listGroup.size(); i++) {
			if (!listGroup.contains(obj)) {
				listGroup.add((Group) obj);
				break;
			}
		}
	}

	@Override
	public void update(Group obj) {
		for (int i = 0; i < listGroup.size(); i++) {
			if (listGroup.get(i).getId().equals(obj)) {
				listGroup.remove(i);
				listGroup.add(i, obj);
				break;
			}
		}
		
	}

	@Override
	public void remove(String id) {
		Object tempGroup = get(id);
		for (int i = 0; i < listGroup.size(); i++) {
			if (listGroup.contains(tempGroup)) {
				listGroup.remove(i);
				break;
			}
		}
	}
	

}
