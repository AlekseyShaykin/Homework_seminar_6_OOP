package org.example.View;



import org.example.User;

import java.util.List;

public class View {

    //  1) Single Responsibility Principle  собдюден. Класс отвечает только за вывод в консоль списка.

    public String StudentView(List<User> students){
        return students.toString();
    }


}
