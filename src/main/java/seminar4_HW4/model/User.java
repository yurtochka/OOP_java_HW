package seminar4_HW4.model;

import lombok.Data;

@Data

public class User {
    private final Long id;
    private final String fullName;
    private final Integer age;
    private final String phoneNumber;
}
