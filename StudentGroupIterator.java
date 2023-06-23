package Seminar_5_DZ_1;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    private int counter;
    private final List<Student> students;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.counter = 0;
        this.students = studentGroup.getStudents();
    }


    @Override
    public boolean hasNext() {
        return counter < students.size() - 1;
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;

        }

        counter++;
        return students.get(counter);
    }
}


