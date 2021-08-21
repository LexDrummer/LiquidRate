package ru.lexdrummer.liquidrate.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.lexdrummer.liquidrate.model.CommentSection;

import java.util.Set;

public interface CommentSectionRepository extends CrudRepository<CommentSection, Long> {

    Set<CommentSection> findAllByLiquidName(String name);

}
