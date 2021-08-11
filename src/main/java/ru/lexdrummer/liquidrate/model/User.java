package ru.lexdrummer.liquidrate.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nickname;
    private String email;
    private String firstName;
    private String lastName;
    private String city;
    private LocalDate birthdate;


    @Builder(access = AccessLevel.PUBLIC)

    public User(String nickname, String email, String firstName, String lastName, String city, LocalDate birthdate) {
        this.nickname = nickname;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.birthdate = birthdate;
    }

}
