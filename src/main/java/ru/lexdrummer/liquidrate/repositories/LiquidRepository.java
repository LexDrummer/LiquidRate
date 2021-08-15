package ru.lexdrummer.liquidrate.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.lexdrummer.liquidrate.model.Liquid;

import java.util.Set;

public interface LiquidRepository extends CrudRepository<Liquid, Long> {

    Liquid findByName(String name);

}
