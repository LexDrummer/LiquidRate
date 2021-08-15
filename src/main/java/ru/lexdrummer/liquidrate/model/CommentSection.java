package ru.lexdrummer.liquidrate.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

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
    @Nullable
    private Integer liquidVolume;
    private Integer nicotine;
    private Long rate;

    @Builder

    public CommentSection(Liquid liquid, User author, String comment,
                          @Nullable Integer liquidVolume, Integer nicotine, Long rate) {
        this.liquid = liquid;
        this.author = author;
        this.comment = comment;
        this.liquidVolume = liquidVolume;
        this.nicotine = nicotine;
        this.rate = rate;
    }
}
