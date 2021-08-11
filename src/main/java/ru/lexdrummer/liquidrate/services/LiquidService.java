package ru.lexdrummer.liquidrate.services;

import ru.lexdrummer.liquidrate.model.Liquid;

import java.util.Set;

public interface LiquidService {

    Set<Liquid> findByManufacturer(String manufacturer);

    Set<Liquid> findByRate(Long min, Long max);

    Liquid findByName(String name);

    Long getRateByLiquidName(String name);


}
