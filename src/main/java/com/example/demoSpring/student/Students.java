package com.example.demoSpring.student;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.UUID;



public class Students {
    private final UUID studentId;

    //@NotBlank
    @Nullable
    private final String firstName;


    //@NotBlank
    @Nullable
    private final String lastName;

    //@NotBlank
    //@Email <--used this one once I download javax.validation.containers.NotBlank
    @Nullable
    private final String email;

    @NonNull
    private final Gender gender;

    public Students(@JsonProperty("studentId") UUID studentId,
                    @JsonProperty("firstName") String firstName,
                    @JsonProperty("lastName") String lastName,
                    @JsonProperty("email") String email,
                    @JsonProperty("gender") Gender gender) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

    enum Gender{
        MALE,FEMALE
    }

}
