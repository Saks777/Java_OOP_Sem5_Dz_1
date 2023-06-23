package Seminar_5_DZ_1.service;
import java.util.List;

import Seminar_5_DZ_1.Student;
import Seminar_5_DZ_1.Teacher;

public interface Service {

    public void create(List<Student> inputList, Teacher teacher);

    public void create(Student inputStudent);

    public void read();

}