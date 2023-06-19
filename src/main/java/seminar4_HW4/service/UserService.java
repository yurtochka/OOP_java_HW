package seminar4_HW4.service;

import seminar4_HW4.model.Student;
import seminar4_HW4.model.User;

import java.util.List;

public interface UserService<T extends User> {
    void create(String fullName, Integer age, String phoneNumber);
    void removeUser(String fullName);
    void editUser(String fullName, Integer age, String phoneNumber);
    List<T> getAll();
    List<T> getAllSortUsers();
    List<T> getAllSortUsersByFamilyName();
    List<T> getAllSortUsersByAge();
    List<Student> getAllUsers();
    List<Student> getAllUsersByFamilyName();
}
