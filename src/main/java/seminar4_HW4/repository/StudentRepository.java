package seminar4_HW4.repository;

import seminar4_HW4.model.Student;
import seminar4_HW4.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements UserRepository<Student> {
    private final List<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<>();
    }


    @Override
    public List<Teacher> getAll() { return null; }

    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public void remove(String fullName) {
        for (Student student : students) {
            if (student.getFullName().equals(fullName)) {
                students.remove(student);
                return;
            }
        }
    }

    @Override
    public Long getMaxId() {
        Long maxId = 0L;
        for (Student student : students) {
            if (student.getId() > maxId) {
                maxId = student.getId();
            }
        }
        return maxId;
    }
}
