package com.splitwise.splitapp.Controller;

import java.util.List;
import java.util.Map;

import com.splitwise.splitapp.Models.Group;
import com.splitwise.splitapp.Models.GroupDto;
import com.splitwise.splitapp.Services.AuthenticationService;
import com.splitwise.splitapp.Services.CreateGroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
public class ApiController {
    
    @Autowired
    public CreateGroup createGroup;

    @Autowired
    public AuthenticationService authenticationService;

    @GetMapping(value = "/authenticate")
    public Map<String,String> verifyUser(@RequestParam("email") String email,@RequestParam("password") String password){
         return authenticationService.verify(email,password);
    }

    @PutMapping(value = "/register")
    public Map<String,String> register(@RequestParam("email") String email,@RequestParam("password") String password){
        return authenticationService.registerUser(email,password);
    }

    @PutMapping(value = "/add-group")
    public ResponseEntity<HttpStatus> addGroup(@RequestBody GroupDto groupDto){
        try {
            createGroup.createGroup(groupDto);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
