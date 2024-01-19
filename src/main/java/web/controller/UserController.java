package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.servise.UserService;
import web.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
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
    //------------------------------  creat
    @GetMapping("/creat_user")
    public String getCreatUser(Model model) {
         model.addAttribute("user", new User());
        return "creat_user";
    }

    @PostMapping()
    public String getAddUser(@ModelAttribute("user") User user1) {
        userService.addUser(user1);
        return "redirect:/";
    }
    //------------------------------------- delete
 @GetMapping("/delete_user")
    public String getWhatDeleteUser(@RequestParam("id") int userId, Model model) {
        model.addAttribute("userDelete", userService.getUser(userId));
        return "delete_user";
    }
    @DeleteMapping("/delete_user")
    public String getDeleteUser(@RequestParam("id") int userId) {
        userService.deleteUser(userId);
        return "redirect:/";
    }
    //-------------------------------------------- update
    @GetMapping("/update_user")
    public String getWhatUpdateUser(@RequestParam("id") int userId, Model model) {
        model.addAttribute("userUpdate", userService.getUser(userId));
        return "update_user";
    }
    @PatchMapping("/update_user")
    public String getUpdateUser(@RequestParam("id") int id, @ModelAttribute("userUpdate") @Valid User user1) {
        userService.updateUser(id, user1);
        return "redirect:/";
    }
}
