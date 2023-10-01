package nitish.eCommerce.controller;

import nitish.eCommerce.model.User;
import nitish.eCommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;
   @PostMapping("user")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @GetMapping("user/id/{id}")
    public User getUserById(@PathVariable Integer id){
       return userService.getUserById(id);
    }
}
