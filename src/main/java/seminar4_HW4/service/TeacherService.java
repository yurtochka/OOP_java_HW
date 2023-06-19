package seminar4_HW4.service;


import seminar4_HW4.model.Student;
import seminar4_HW4.model.Teacher;
import seminar4_HW4.model.User;
import seminar4_HW4.repository.TeacherRepository;
import seminar4_HW4.repository.UserRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    public final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        Teacher teacher = new Teacher(teacherRepository.getMaxId() + 1, fullName, age, phoneNumber);
        teacherRepository.add(teacher);
    }

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.getAll();
    }

    @Override
    public List<Teacher> getAllSortUsers() {
        List<Teacher> teachers = teacherRepository.getAll();
        Collections.sort(teachers);
        return teachers;
    }

    @Override
    public List<Teacher> getAllSortUsersByFamilyName() {
        List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort(new UserComparator<>());
        return teachers;
    }

    @Override
    public List<Teacher> getAllSortUsersByAge() {
        List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort(Comparator.comparing(Teacher::getAge));
        return teachers;
    }

    @Override
    public List<Student> getAllUsers() {
        return null;
    }

    @Override
    public List<Student> getAllUsersByFamilyName() {
        return null;
    }

    @Override
    public void removeUser(String fullName) {
        teacherRepository.remove(fullName);
    }

    @Override
    public void editUser(String fullName, Integer age, String phoneNumber) {
        for (Teacher teacher : teacherRepository.getAll()) {
            if (teacher.getFullName().equals(fullName)) {
                System.out.println("Найдена запись: " + fullName);
                teacherRepository.remove(fullName);
                Teacher editT = new Teacher(teacher.getId(), fullName, age, phoneNumber);
                teacherRepository.add(editT);
                return;
            }
        }
        System.out.println("Запись " + fullName + " не найдена!");
    }

}
