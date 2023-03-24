package org.example;

import java.util.Date;

public abstract class User {


    //  1) Single Responsibility Principle  собдюден. Класс отвечает только за сущность User.
    // 3) Liskov substitution principle - порожденные классы (User, Teacher) не изменяют поведение родительского класса

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
