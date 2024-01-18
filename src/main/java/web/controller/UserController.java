package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import web.model.User;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.servise.UserService;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService usersService) {
        this.userService = usersService;
    }

    @GetMapping(value = "/")                            //index
    public String getAllUsers(Model model) {
        List<User> allUsers = userService.getAllUsers();
        model.addAttribute("allUsers", allUsers);
        return "all_users";
    }
    //------------------------------
    @GetMapping("/creat_user")
    public String getCreatUser(Model model) {
         model.addAttribute("user", new User());
        return "creat_user";                                             //new Person
    }

    @PostMapping()
    public String getAddUser(@ModelAttribute("user") User user) {        //creat
        userService.addUser(user);
        return "redirect:/";
    }

}
