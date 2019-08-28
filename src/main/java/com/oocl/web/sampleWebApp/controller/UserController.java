package com.oocl.web.sampleWebApp.controller;

import com.oocl.web.sampleWebApp.Entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private  static List<User> userList=new ArrayList<>();

    @PostMapping
    public ResponseEntity addUser(@RequestBody User user ){
        userList.add(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity getUsers(){
        return ResponseEntity.ok(userList);
    }
}
