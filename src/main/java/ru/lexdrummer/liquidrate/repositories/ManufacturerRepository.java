package ru.lexdrummer.liquidrate.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.lexdrummer.liquidrate.model.Manufacturer;

public interface ManufacturerRepository extends CrudRepository<Manufacturer, Long> {

    Manufacturer findByName(String name);

}
