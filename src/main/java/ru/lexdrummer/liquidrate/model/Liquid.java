package ru.lexdrummer.liquidrate.model;

import lombok.Data;

import java.util.List;

@Data
public class Liquid {

    private Long id;
    private String name;
    private Manufacturer manufacturer;
    private Type type;
    private Long rate;
    private List<CommentSection> comments;

}
