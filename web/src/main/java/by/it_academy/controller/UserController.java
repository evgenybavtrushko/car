package by.it_academy.controller;

import by.it_academy.entities.User;
import by.it_academy.services.IUserService;
import by.it_academy.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/registerForm", method = RequestMethod.GET)
    public String getRegisterForm() {
        return "registerForm";
    }
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createUser(@ModelAttribute User user) {
        userService.add(user);
        return "";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute User user) {
        userService.add(user);
        return "/";
    }
}
