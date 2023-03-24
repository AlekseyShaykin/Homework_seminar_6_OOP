package org.example;

import java.util.Date;

public abstract class User {


    //  1) Single Responsibility Principle  собдюден. Класс отвечает только за сущность User.

    Date dateBirth;
    String fio;
    int ID;

    public User(Date dateBirth, String fio, int ID) {
        this.dateBirth = dateBirth;
        this.fio = fio;
        this.ID = ID;
    }

    public User() {
    }


}
