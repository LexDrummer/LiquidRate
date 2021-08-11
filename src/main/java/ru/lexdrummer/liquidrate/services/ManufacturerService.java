package ru.lexdrummer.liquidrate.services;

import ru.lexdrummer.liquidrate.model.Liquid;
import ru.lexdrummer.liquidrate.model.Manufacturer;

import java.util.Set;

public interface ManufacturerService {

    Manufacturer findByName();

    Set<Liquid> findProducts();


}
