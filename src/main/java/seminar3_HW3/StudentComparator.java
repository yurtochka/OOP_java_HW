package seminar3_HW3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        String familyName1 = o1.getFullName().split("\\s+")[1];
        String familyName2 = o2.getFullName().split("\\s+")[1];
        return familyName1.compareTo(familyName2);
    }
}
