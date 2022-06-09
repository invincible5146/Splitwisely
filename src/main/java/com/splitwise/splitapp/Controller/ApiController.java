package com.splitwise.splitapp.Controller;

import java.util.List;

import com.splitwise.splitapp.Models.Group;
import com.splitwise.splitapp.Models.GroupDto;
import com.splitwise.splitapp.Services.CreateGroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
public class ApiController {
    
    @Autowired
    public CreateGroup createGroup;

    @PutMapping(value = "/add-group")
    public ResponseEntity<HttpStatus> addGroup(@RequestBody GroupDto groupDto){
        // try {
            System.out.println("controller");
            createGroup.createGroup(groupDto);
            return new ResponseEntity<>(HttpStatus.OK);
        // } catch (Exception e) {
        //     return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        // }
    }
}
