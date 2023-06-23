package Seminar_5_DZ_1.controller;

import java.util.List;
import Seminar_5_DZ_1.Student;
import Seminar_5_DZ_1.StudentGroup;
import Seminar_5_DZ_1.Teacher;
import Seminar_5_DZ_1.service.DataService;
import Seminar_5_DZ_1.service.StudentGroupService;


public class Controller {

    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();

    public StudentGroup createGroup(List<Student> inputList, Teacher teacher) {
        return studentGroupService.createGroup(inputList, teacher);
    }

    public void readGroup(StudentGroup group) {
        studentGroupService.readGroup(group);
    }

    public StudentGroup addStudentToGroup(StudentGroup group, Student student) {
        return studentGroupService.addStudentToGroup(group, student);
    }

    public void create(List<Student> inputList, Teacher teacher) {
        if (inputList != null && teacher != null) {
            dataService.create(inputList, teacher);
        } else {
            System.out.println("Wrong data!");
        }
    }

    public void create(Student inputStudent) {
        dataService.create(inputStudent);
    }

    public void read() {
        dataService.read();
    }

}