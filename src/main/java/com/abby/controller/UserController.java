package com.abby.controller;

import com.abby.entity.User;
import com.abby.entity.UserRegistration;
import com.abby.model.UserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by akulygina on 8/3/2015.
 */
@Controller
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model) {
        model.put("user", new User());
        return "login";
    }

    @RequestMapping(value = "/login", params = "doLogin",  method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("user") User user, BindingResult result) {
        UserModel userModel = new UserModel();

        if (userModel.isUserInDataBase(user.getLogin(), user.getPassword())) {
            return new ModelAndView("redirect:/authors");
        } else {
            return new ModelAndView("index");
        }
    }

    @RequestMapping(value = "/login", params = "doRegister", method = RequestMethod.POST)
    public String index1(Map<String, Object> model) {
        model.put("user", new User());
        return "registration";
    }


    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView register(@ModelAttribute("user") User user, BindingResult result) {
        UserModel userModel = new UserModel();
        userModel.addUser(user);
        return new ModelAndView("index");
    }

}

