package ru.lexdrummer.liquidrate.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
    private Integer volume;
    @ElementCollection
    private List<Long> rates = new ArrayList<>();
    private Long rate;
    @ElementCollection(targetClass = Tastes.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "tastes")
    @Column(name = "tastes")
    private Set<Tastes> tastes = new HashSet<>();

}
