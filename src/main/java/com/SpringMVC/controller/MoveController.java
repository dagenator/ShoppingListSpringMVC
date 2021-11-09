package com.SpringMVC.controller;

import com.SpringMVC.model.ShoppingList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MoveController {

    @RequestMapping(value = "/moveInDone",method = RequestMethod.POST)
    public RedirectView MoveToDone(@RequestParam(required = true, name = "id") int id){
        ShoppingList.moveToDoneList(id);
        return new RedirectView("/home");
    }
    @RequestMapping(value = "/moveInToDo",method = RequestMethod.POST)
    public RedirectView MoveToDo(@RequestParam(required = true, name = "id") int id){
        ShoppingList.moveInToDoList(id);
        return new RedirectView("/home");
    }
}
