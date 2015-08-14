package com.abby.controller;

import com.abby.model.AuthorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by akulygina on 8/4/2015.
 */
@Controller
public class AuthorController {

    @Autowired
    AuthorModel authorModel;

    @RequestMapping(value = "/authors", method = RequestMethod.GET)
    public ModelAndView displayAuthors() {
        ModelAndView mv = new ModelAndView("/authors");
        mv.addObject("objects", authorModel.getAllAuthors());
        return mv;
    }
}
