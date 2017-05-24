package echo_location.controller;

import echo_location.entity.User;
import echo_location.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody User user) {
        userService.save(user);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getAll(){
        return userService.findAll();
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
