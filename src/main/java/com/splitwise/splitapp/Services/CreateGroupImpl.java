package com.splitwise.splitapp.Services;

import com.splitwise.splitapp.Models.Group;
import com.splitwise.splitapp.Models.GroupDto;
import com.splitwise.splitapp.Repository.GroupRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateGroupImpl implements CreateGroup{

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public void createGroup(GroupDto groupDto) { 
        Group group = new Group();
        group.setGroupName(groupDto.groupName);
        group.setGroupMembers(groupDto.getGroupMembers());
        groupRepository.save(group);
        System.out.println("done");
    }
    
}
