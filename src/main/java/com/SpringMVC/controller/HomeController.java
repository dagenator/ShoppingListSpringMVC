package com.SpringMVC.controller;

import com.SpringMVC.model.ShoppingList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/home")
    public ModelAndView Home(){
        ModelAndView  View = new ModelAndView("home_page");
        View.addObject("ToDo", ShoppingList.getToDoList());
        View.addObject("Done", ShoppingList.getDoneList());
        return View;
    }



}
