import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import controller.GroupController;
import model.Student;
import model.StudentGroup;
import model.Teacher;
import service.GroupService;
import view.GroupView;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Иванов Иван Иванович", "s345");
        Student student2 = new Student("Петров Петр Петрович", "s12");
        Student student3 = new Student("Семенов Семен Семенович", "s4567");
        Teacher teacher = new Teacher("Васильева Вера Васильевна", "t45");
        List<Student> groupStudents = new ArrayList<>(Arrays.asList(student1, student2, student3));
        
        StudentGroup studentGroup = new StudentGroup("51МнВБ", groupStudents, teacher);

        GroupView groupView = new GroupView();

        GroupService groupService = new GroupService();
        
        GroupController groupController = new GroupController(studentGroup, groupView, groupService);

        groupController.updateViewOfGroup();
    }
}
