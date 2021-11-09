package com.SpringMVC.controller;

import com.SpringMVC.model.ShoppingList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AddController {

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public RedirectView AddInToDo( @RequestParam(required = true, name = "record") String s){
        ShoppingList.addNewInToDo(s);
         return new RedirectView("/home");
    }

}
