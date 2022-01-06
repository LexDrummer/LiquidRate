package ru.lexdrummer.liquidrate.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.lexdrummer.liquidrate.model.Manufacturer;

import java.util.Set;

public interface ManufacturerRepository extends CrudRepository<Manufacturer, Long> {

    Manufacturer findByName(String name);

    Manufacturer findManufacturerById(Long id);

    Set<Manufacturer> findAllByCountry(String country);

}
