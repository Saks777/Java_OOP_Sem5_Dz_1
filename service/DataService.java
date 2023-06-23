package Seminar_5_DZ_1.service;
import java.util.ArrayList;
import java.util.List;
import Seminar_5_DZ_1.Student;
import Seminar_5_DZ_1.Teacher;
public class DataService implements Service {

    static Integer idGenerator;
    List<Student> studentList;
    Teacher teacher;

    public DataService() {
        this.studentList = new ArrayList<>();
    }

    @Override
    public void create(List<Student> inputList, Teacher teacher) {
        this.studentList.addAll(inputList);
        this.teacher = teacher;
    }

    @Override
    public void create(Student inputStudent) {
        this.studentList.add(inputStudent);
    }

    @Override
    public void read() {
        System.out.println(this.teacher);
        for (Student s: studentList) {
            System.out.println("\t" + s.toString());
        }
    }

}
