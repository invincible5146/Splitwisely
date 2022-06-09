package com.splitwise.splitapp.Services;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.splitwise.splitapp.Models.User;
import com.splitwise.splitapp.Repository.UserRepository;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Map<String, String> verify(String email,String password) {
        Map<String, String> response = new HashMap<>();
         User user = userRepository.getUser(email);
         if(user == null){
             response.put("result", "NOT VERIFIED");
         } else if(password.equals(user.getPassword())){
            response.put("result", "VERIFIED");
         } else{
            response.put("result", "Wrong Password");
         }
         return response;
    }

    @Override
    public Map<String, String> registerUser(String email, String password) {
        Map<String, String> response = new HashMap<>();
        User user = userRepository.getUser(email);
        if(user!=null){
            response.put("result", "ALREADY");
        }else{
            User newUser = new User();
            newUser.setEmail(email);
            newUser.setPassword(password);
            userRepository.save(newUser);
            response.put("result", "SUCCESS");
        }
        return response;
    }
    
}
