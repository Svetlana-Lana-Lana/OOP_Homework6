package model;

import java.util.List;

// Single Responsibility Principle - класс имеет только одну ответственость - представление данные
// Liskov Substitution Principle - классы Student, Teacher и StudentGroup наследуют общий интерфейс, можно их использовать взаимозаменяемо

public class StudentGroup {
    
    private String groupNumber;

    private List<Student> students;

    private Teacher teacher;

    public StudentGroup(String groupNumber, List<Student> students, Teacher teacher) {
        this.groupNumber = groupNumber;
        this.students = students;
        this.teacher = teacher;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudentList(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
