package controller;

import model.StudentGroup;
import service.GroupService;
import view.GroupView;

// Open/Closed Principle - использование GroupService позволяет расширять функциональность без изменения существующего кода
// Dependency Inversion Principle - GroupController зависит от абстракции GroupService, а не от конкретной реализации

public class GroupController{

    private StudentGroup model;

    private GroupView view;

    private GroupService service;

    public GroupController(StudentGroup model, GroupView view, GroupService service) {
        this.model = model;
        this.view = view;
        this.service = service;
    }

    public void updateViewOfGroup() {
        view.printGroupDetails(model.getGroupNumber(), model.getTeacher().getName(), service.getListOfStudents(model.getStudents()));
    }   
}
