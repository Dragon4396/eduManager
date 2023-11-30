package com.example.edumanager.student;

import lombok.Data;
import java.util.UUID;

@Data
public class Student {
    private final UUID studentID;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Gender gender;

    enum Gender {
        MALE, FEMALE
    }
}
