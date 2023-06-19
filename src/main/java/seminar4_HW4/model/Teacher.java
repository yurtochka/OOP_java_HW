package seminar4_HW4.model;


import lombok.*;

@Getter
@EqualsAndHashCode(callSuper = true)

public class Teacher extends User implements Comparable<Teacher> {

    public Teacher(Long id, String fullName, Integer age, String phoneNumber) {
        super(id, fullName, age, phoneNumber);
    }

    @Override
    public int compareTo(Teacher o) {
        return getFullName().compareTo(o.getFullName());
    }

    @Override
    public String toString() {
        return String.format("%s\t%s\t%s\t%s", getId(), getFullName(), getAge(), getPhoneNumber());
    }
}
