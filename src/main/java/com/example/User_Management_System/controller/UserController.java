package com.example.User_Management_System.controller;

import com.example.User_Management_System.entity.User;
import com.example.User_Management_System.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/getUser/{userId}")
    public User getUser(@PathVariable Long userId){
        return userService.getUser(userId);


    }

    @GetMapping("/getAllUser")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping("/updateUserInfo/{userId}")
    public User updateUserInfo(@PathVariable Long userId, @RequestBody User updatedUser){
        return userService.updateUserInfo(userId, updatedUser);
    }

    @DeleteMapping("/deleteUser/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
      }
}
