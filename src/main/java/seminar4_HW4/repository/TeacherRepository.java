package seminar4_HW4.repository;

import seminar4_HW4.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements UserRepository<Teacher> {
    private final List<Teacher> teachers;

    public TeacherRepository() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void add(Teacher student) {
        teachers.add(student);
    }

    @Override
    public void remove(String fullName) {
        for (Teacher teacher: teachers) {
            if (teacher.getFullName().equals(fullName)) {
                teachers.remove(teacher);
                return;
            }
        }
    }

    @Override
    public Long getMaxId() {
        Long maxId = 0L;
        for (Teacher teacher : teachers) {
            if (teacher.getId() > maxId) {
                maxId = teacher.getId();
            }
        }
        return maxId;
    }
}
