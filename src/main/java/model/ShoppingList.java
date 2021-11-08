package model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShoppingList {

    private List<String> ToDoList = new ArrayList<String>();
    private List<String> DoneList = new ArrayList<String>();

    @Bean
    public ShoppingList GetShoppingList(){
        return this;
    }

    public List<String> getDoneList() {
        return DoneList;
    }

    public List<String> getToDoList() {
        return ToDoList;
    }

    public void addNewInToDo(String record){
        ToDoList.add(record);
    }

    public void moveToDoneList(int indexInToDoList){
        DoneList.add(ToDoList.get(indexInToDoList));
        ToDoList.remove(indexInToDoList);
    }

}
