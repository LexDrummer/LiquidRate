package ru.lexdrummer.liquidrate.model;

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
    @OneToMany
    private Set<CommentSection> comments = new HashSet<>();
}
