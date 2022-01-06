package ru.lexdrummer.liquidrate.services;

import ru.lexdrummer.liquidrate.model.Liquid;
import ru.lexdrummer.liquidrate.model.Manufacturer;

import java.util.Set;

public interface ManufacturerService {

    Set<Manufacturer> findAll();

    Manufacturer findByName(String name);

    Manufacturer findById(Long id);

    Set<Manufacturer> findByCountry(String country);

    Set<Liquid> findProducts();


}
