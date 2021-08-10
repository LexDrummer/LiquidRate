package ru.lexdrummer.liquidrate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class CommentSection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "liquid_id")
    private Liquid liquid;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User author;
    private String comment;
    private Integer liquidVolume;
    private Integer nicotine;


}
