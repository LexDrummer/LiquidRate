package ru.lexdrummer.liquidrate.services;

import ru.lexdrummer.liquidrate.model.CommentSection;

import java.util.Set;

public interface CommentSectionService {

    Set<CommentSection> findAllByLiquidName(String name);

    Set<CommentSection> findAllByLiquidId(Long id);

    void deleteAllByLiquidId(Long id);

    Double findRateByLiquidId(Long id);

}
