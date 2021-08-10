package ru.lexdrummer.liquidrate.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.lexdrummer.liquidrate.model.Liquid;

public interface LiquidRepository extends CrudRepository<Liquid, Long> {

}
