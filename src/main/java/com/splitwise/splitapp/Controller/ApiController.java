package com.splitwise.splitapp.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
public class ApiController {
    
    @PutMapping(value = "/add-group")
    public boolean addGroup(){
        return false;
    }
}
