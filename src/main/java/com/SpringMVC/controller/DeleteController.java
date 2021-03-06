package com.SpringMVC.controller;

import com.SpringMVC.model.ShoppingList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class DeleteController {

    @RequestMapping(value = "/deleteInToDo",method = RequestMethod.POST)
    public RedirectView DeleteInToDo(@RequestParam(required = false, name = "id") int id){
        System.out.println(id);
        ShoppingList.deleteInToDoList(id);
        return new RedirectView("/home");
    }

    @RequestMapping(value = "/deleteInDone",method = RequestMethod.POST)
    public RedirectView DeleteInDone(@RequestParam(required = true, name = "id") int id){
        ShoppingList.deleteInDoneList(id);
        return new RedirectView("/home");
    }
}
