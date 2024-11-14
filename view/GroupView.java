package view;

import java.util.List;

public class GroupView {

    public void printGroupDetails(String groupNumber, String teacherName, List<String> listOfStudents) {
        System.out.println("Номер группы: " + groupNumber + "\nПреподаватель: " + teacherName + "\nСписок студентов: " + listOfStudents);
    }
}
