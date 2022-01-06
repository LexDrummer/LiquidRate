package ru.lexdrummer.liquidrate.services;

import ru.lexdrummer.liquidrate.model.Liquid;

import java.util.Set;

public interface LiquidService {

    Set<Liquid> findAll();

    Set<Liquid> findAllByManufacturersName(String manufacturer);

    Set<Liquid> findByRate(Long min, Long max);

    Liquid findByName(String name);

    Liquid findById(Long id);

}
