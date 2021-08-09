package ru.lexdrummer.liquidrate.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class User {

    private Long id;
    private String nick;
    private String firstName;
    private String lastName;
    private String city;
    private LocalDate birthdate;
}
