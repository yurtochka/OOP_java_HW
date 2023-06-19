package seminar4_HW4.service;


import seminar4_HW4.model.Student;
import seminar4_HW4.model.User;
import seminar4_HW4.repository.StudentRepository;
import seminar4_HW4.repository.UserRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class StudentService implements UserService<Student> {
    private final UserRepository<Student> studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        Long id = studentRepository.getMaxId() + 1;
        Student student = new Student(id, fullName, age, phoneNumber);
        studentRepository.add(student);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    @Override
    public List<Student> getAllSortUsers() {
        List<Student> students = studentRepository.getAll();
        Collections.sort(students);

        return students;
    }

    @Override
    public List<Student> getAllSortUsersByFamilyName() {
        List<Student> students = studentRepository.getAll();
        students.sort(new UserComparator<>());

        return students;
    }

    @Override
    public List<Student> getAllSortUsersByAge() {
        List<Student> students = studentRepository.getAll();
/*        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });*/
//        students.sort((o1, o2) -> o1.getAge().compareTo(o2.getAge()));
        students.sort(Comparator.comparing(User::getAge));
        return students;
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
        studentRepository.remove(fullName);
    }

    @Override
    public void editUser(String fullName, Integer age, String phoneNumber) {
        for (Student student : studentRepository.getAll()) {
            if (student.getFullName().equals(fullName)) {
                System.out.println("Найдена запись: " + fullName);
                studentRepository.remove(fullName);
                Student editT = new Student(student.getId(), fullName, age, phoneNumber);
                studentRepository.add(editT);
                return;
            }
        }
        System.out.println("Запись " + fullName + " не найдена!");
    }
}
