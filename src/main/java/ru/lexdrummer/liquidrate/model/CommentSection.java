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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "liquid_id")
    private Liquid liquid;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String comment;
    @Nullable
    private Integer liquidVolume;
    private Integer nicotine;
    private Double rate;

    @Builder

    public CommentSection(Liquid liquid, User user, String comment,
                          @Nullable Integer liquidVolume, Integer nicotine, Double rate) {
        this.liquid = liquid;
        this.user = user;
        this.comment = comment;
        this.liquidVolume = liquidVolume;
        this.nicotine = nicotine;
        this.rate = rate;
    }
}
