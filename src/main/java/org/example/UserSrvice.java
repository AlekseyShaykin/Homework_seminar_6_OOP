package org.example;

import java.util.Date;
import java.util.List;

public class UserSrvice implements DataService{

    //  1) Single Responsibility Principle  соблюден. Класс отвечает за создание экзепляров класса.
    // 4) Interface segregation principle соблюден. Данный интерфейс реализуется классом UserSrvice целиком и полностью (все 3 метода).



    @Override
    public User create(Student student) {
        return student;
    }

    @Override
    public User create(Teacher teacher) {
        return new Teacher(new Date(), "teach FIO", 2);
    }

    @Override
    public List<User> read(List<User> users) {
        return users;
    }
}
