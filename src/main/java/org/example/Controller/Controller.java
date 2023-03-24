package org.example.Controller;

//import org.example.MVS_School.Student;
//import org.example.MVS_School.Teacher;
//import org.example.MVS_School.User;
//import org.example.MVS_School.UserSrvice;
//import org.example.MVS_School.View.View;

import org.example.Student;
import org.example.Teacher;
import org.example.User;
import org.example.UserSrvice;
import org.example.View.View;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Controller {
    public static void main(String[] args) {

        UserSrvice userSrvice = new UserSrvice();
//        userSrvice.create(new Student());;
//        userService.create(new Teacher());
        List<User> users = new ArrayList<>();
        users.add(userSrvice.create(new Student(new Date(), "ds",548,4)));
        users.add(userSrvice.create(new Teacher()));
        userSrvice.read(users);

        View view = new View();
        System.out.println(view.StudentView(users));

        System.out.println("------------------");

    }
}
