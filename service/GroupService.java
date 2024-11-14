package service;

import java.util.ArrayList;
import java.util.List;

import model.Student;

// Single Responsibility Principle - класс имеет только одну ответственность - получение и обработку данных о студентах
// Interface Segregation Principle - GroupService определяет отдельный интерфейс для обработки данных о студентах

public class GroupService {

    public List<String> getListOfStudents(List <Student> students){
        List<String> listOfStudents = new ArrayList<>();
        for (Student student : students) {
            listOfStudents.add(student.getName());
        }
        return listOfStudents;
    }
}
