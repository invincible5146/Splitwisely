// package com.splitwise.splitapp.Services;

// import java.util.HashMap;
// import java.util.Map;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;




// import com.splitwise.splitapp.Models.User;
// import com.splitwise.splitapp.Repository.UserRepository;

// @Service
// public class AuthenticationServiceImpl implements AuthenticationService {

//     @Autowired
//     private UserRepository userRepository;
    
//     @Override
//     public Map<String, String> verify(String userName, String password) {
//          Map<String,String> response=new HashMap<String,String>();
//          User user = userRepository.getUser(userName);
//          if(user == null){
//              response.put("result", "User Not Registered");
//          } else if(password.equals(user.getPassword())){
//             response.put("result", "VERIFIED");
//             response.put("id", String.valueOf(user.getUserId()));
//          } else{
//             response.put("result", "Wrong Password");
//          }
//          return response;
//     }

//     @Override
//     public Map<String, String> registerUser(String userName, String password, String phoneNumber) {
//         User user=new User();
//         user.setPassword(password);
//         user.setUserName(userName);
//         user.setPhoneNumber(phoneNumber);
//         userRepository.save(user);
//         Map<String,String>response=new HashMap<>();
//         response.put("Registration Successful","");
//         response.put("Registered User Id is",String.valueOf(user.getUserId()));
//         return response;
//     }
    
    
// }
