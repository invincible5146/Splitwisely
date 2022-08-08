package com.splitwise.splitapp.Repository;

import com.splitwise.splitapp.Models.Group;

public interface IGroupRepo {
	
	Group findByID(Long id);
	boolean isGroupPresent(Long id);
	void saveGroup(Group group);

}
