package com.alldata.alldata.components.users;

import com.alldata.alldata.database.User;
import com.alldata.alldata.database.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/getAll")
    public List<User> getAll(){
        return userService.getAll();
    }

    @PostMapping(path ="/save")
    public void save(@RequestBody User user){
        userService.save(user);
    }

    @GetMapping(path = "/getJosue")
    public User getJosue(){
        return userService.findJosue();
    }
}
