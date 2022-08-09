package com.splitwise.splitapp.Controller;

import java.util.Map;

import com.splitwise.splitapp.Models.Dto.ExpenseDto;
import com.splitwise.splitapp.Services.AuthenticationService;
import com.splitwise.splitapp.Services.CreateExpenseWithOtherUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class ApiController {

    @Autowired
    public AuthenticationService authenticationService;

    @Autowired
    public CreateExpenseWithOtherUserService createExpenseWithOtherUserService;
    @GetMapping(value = "/authenticate")
    public Map<String,String> verifyUser(@RequestParam("username") String userName,@RequestParam("password") String password){
         return authenticationService.verify(userName,password);
    }

    @PutMapping(value = "/register")
    public Map<String,String> register(@RequestParam("username") String userName,@RequestParam("password") String password,
    @RequestParam("phonenumber")String phoneNumber){
        return authenticationService.registerUser(userName,password,phoneNumber);
    }

    @PostMapping(value = "/expense-other-user" )
    public String expenseWithOtherUser(@RequestBody ExpenseDto expenseDto){
        return createExpenseWithOtherUserService.createExpenseWithOtherUsers(expenseDto);
    }
}