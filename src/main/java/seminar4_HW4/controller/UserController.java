package seminar4_HW4.controller;

import seminar4_HW4.model.User;

import java.util.List;

public interface UserController<T extends User> {
    void create(String fullName, Integer age, String phoneNumber);
    void editUser(String fullName, Integer age, String phoneNumber);
    List<T> getAllSortUsers();
    List<T> getAllSortUsersByFamilyName();
    List<T> getAll();
    List<T> getAllSortUsersByAge();
    boolean removeUser(String fullName);

}
