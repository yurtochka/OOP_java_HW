package seminar4_HW4.view;

import seminar4_HW4.model.User;

public interface UserView<T extends User> {
    void sendOnConsole(String sortType); //get
    void create(String fullName, Integer age, String phoneNumber);//post
    void removeUser(String fullName);//delete
    void editUser(String fullName, Integer age, String phoneNumber);
}
