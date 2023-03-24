package org.example;

import java.util.List;

public interface DataService {

    //  2)  Open-closed principle. Соблюден, т.к. есть базовый класс-интерфейс DataService с базовыми методами.
    //      Другой класс UserSrvice импелметит интрефейс и меняет "базовые" методы, так как ему нужно.


    User create(Student student);
    User create(Teacher teacher);
    List<User> read(List<User> users);
}
