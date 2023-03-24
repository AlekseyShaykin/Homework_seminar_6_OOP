package org.example;

import java.util.Date;
import java.util.List;

public class Teacher extends User {

    int exp;
    List<Integer> group;

    public Teacher(Date dateBirth, String fio, int ID) {
        super(dateBirth, fio, ID);
        this.exp = exp;
        this.group = group;
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "group=" + group +
                ", dateBirth=" + dateBirth +
                ", fio='" + fio + '\'' +
                ", ID=" + ID +
                '}';
    }
}
