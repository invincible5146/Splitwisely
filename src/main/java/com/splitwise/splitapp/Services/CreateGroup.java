package com.splitwise.splitapp.Services;

 
import com.splitwise.splitapp.Models.GroupDto;

public interface CreateGroup {
    void createGroup(GroupDto groupDto,Long userId);
}
