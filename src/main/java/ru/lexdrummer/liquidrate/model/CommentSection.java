package ru.lexdrummer.liquidrate.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
public class CommentSection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "liquid_id")
    private Liquid target;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;
    private String comment;
    private Integer liquidVolume;
    private Integer nicotine;


}
