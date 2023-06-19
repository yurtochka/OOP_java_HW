package seminar4_HW4.controller;

import seminar4_HW4.model.Student;
import seminar4_HW4.service.StudentService;
import seminar4_HW4.service.UserService;

import java.util.List;

public class StudentController implements UserController<Student> {

    public StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        studentService.create(fullName, age, phoneNumber);
    }

    @Override
    public void editUser(String fullName, Integer age, String phoneNumber) {
        studentService.editUser(fullName, age, phoneNumber);
    }

    @Override
    public List<Student> getAllSortUsers() {
        return studentService.getAllSortUsers();
    }

    @Override
    public List<Student> getAllSortUsersByFamilyName() {
        return studentService.getAllSortUsersByFamilyName();
    }

    @Override
    public List<Student> getAllSortUsersByAge() {
        return studentService.getAllSortUsersByAge();
    }

    @Override
    public boolean removeUser(String fullName) {
        studentService.removeUser(fullName);
        return true;
    }

    @Override
    public List<Student> getAll() {
        return studentService.getAll();
    }

}
