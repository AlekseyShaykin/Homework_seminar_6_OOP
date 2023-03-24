package org.example;

import java.util.Date;
import java.util.List;

public class UserSrvice implements DataService{


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
