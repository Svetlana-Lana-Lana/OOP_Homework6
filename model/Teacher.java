package model;

// Single Responsibility Principle - класс имеет только одну ответственость - представление данные
// Liskov Substitution Principle - классы Student, Teacher и StudentGroup наследуют общий интерфейс, можно их использовать взаимозаменяемо

public class Teacher {

    private String name;

    private String teacherId;

    public Teacher(String name, String teacherId) {
        this.name = name;
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
}
