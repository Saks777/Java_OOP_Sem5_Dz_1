package Seminar_5_DZ_1.service;

import java.util.List;

import Seminar_5_DZ_1.Student;
import Seminar_5_DZ_1.StudentGroup;
import Seminar_5_DZ_1.Teacher;

public class StudentGroupService {


    public StudentGroup createGroup(List<Student> inputList, Teacher teacher) {
        return new StudentGroup((Teacher) inputList, (List<Student>) teacher);
    }

    public void readGroup(StudentGroup group) {
        System.out.println(group.getTeacher());
        for (int i = 0; i < group.getStudentList().size(); i++) {
            System.out.println(group.getStudentList().get(i));
        }
    }

    public StudentGroup addStudentToGroup(StudentGroup group, Student student) {
        group.getStudentList().add(student);
        return group;
    }
}
