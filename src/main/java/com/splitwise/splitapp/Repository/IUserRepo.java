package com.splitwise.splitapp.Repository;

import java.util.List;
import java.util.Set;

import com.splitwise.splitapp.Models.User;



public interface IUserRepo {
	 User findById(Long id);
	 User findByUserName(String userName);
	 Set<User> getUsers(List<String> participants);
	 boolean isUserPresent(String userName);
	 void saveUser(User u);
	 User saveUser(String userName, String password, String phNo);
}
