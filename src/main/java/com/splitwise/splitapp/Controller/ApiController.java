package com.splitwise.splitapp.Controller;


import java.util.Map;

// import com.splitwise.splitapp.Models.ExpenseDto;
// import com.splitwise.splitapp.Models.GroupDto;
// import com.splitwise.splitapp.Services.AddExpenseService;
import com.splitwise.splitapp.Services.AuthenticationService;
// import com.splitwise.splitapp.Services.CreateGroup;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
public class ApiController {

    // @Autowired
    // public CreateGroup createGroup;

    @Autowired
    public AuthenticationService authenticationService;

    // @Autowired
    // public AddExpenseService addExpenseService;

    @GetMapping(value = "/authenticate")
    public Map<String,String> verifyUser(@RequestParam("username") String userName,@RequestParam("password") String password){
         return authenticationService.verify(userName,password);
    }

    @PutMapping(value = "/register")
    public Map<String,String> register(@RequestParam("username") String userName,@RequestParam("password") String password,
    @RequestParam("phonenumber")String phoneNumber
     ){
        return authenticationService.registerUser(userName,password,phoneNumber);
    }

    // @PutMapping(value = "/add-group/{userId}")
    // public ResponseEntity<HttpStatus> addGroup(@RequestBody GroupDto groupDto, @PathVariable Long userId){
    //     try {
    //         createGroup.createGroup(groupDto,userId);
    //         return new ResponseEntity<>(HttpStatus.OK);
    //     } catch (Exception e) {
    //         return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    //     }
    // }

    // @PutMapping(value = "/add-expense/{userId}")
    // public ResponseEntity<HttpStatus> addExpense(@PathVariable Long userId, @RequestBody ExpenseDto expense){
    //     // try {
    //          addExpenseService.addExpense(userId, expense);
    //         return new ResponseEntity<>(HttpStatus.OK);
    //     // } catch (Exception e) {
    //         // return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    //     // }
    // }
}