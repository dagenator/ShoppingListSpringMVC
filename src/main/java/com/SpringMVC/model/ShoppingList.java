package com.SpringMVC.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShoppingList {

    private static List<String> ToDoList = new ArrayList<String>();
    private static List<String> DoneList = new ArrayList<String>();

    static{
        ToDoList.add("Buy tomatoes");
        DoneList.add("buy cucumber");
    }

    public static List<String> getDoneList() {
        return DoneList;
    }

    public static List<String> getToDoList() {
        return ToDoList;
    }

    public static void addNewInToDo(String record){
        ToDoList.add(record);
    }

    public static void moveToDoneList(int indexInToDoList){
        DoneList.add(ToDoList.get(indexInToDoList));
        ToDoList.remove(indexInToDoList);
    }

}
