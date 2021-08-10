package ru.lexdrummer.liquidrate.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Liquid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;
    private Type type;
    private Long rate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "liquid")
    @Column(name = "comments")
    private Set<CommentSection> comments = new HashSet<>();

}
