package ru.lexdrummer.liquidrate.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.lexdrummer.liquidrate.model.Liquid;
import ru.lexdrummer.liquidrate.model.Manufacturer;
import ru.lexdrummer.liquidrate.repositories.ManufacturerRepository;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    private final ManufacturerRepository manufacturerRepository;

    public ManufacturerServiceImpl(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }

    @Override
    public Manufacturer findByName(String name) {
        return manufacturerRepository.findByName(name);
    }

    @Override
    public Set<Liquid> findProducts() {
        return null;
    }

    public Set<Manufacturer> findAll(){
        Set<Manufacturer> manufacturers = new HashSet<>();
        manufacturerRepository.findAll().forEach(manufacturers::add);
        return manufacturers;
    }

    public Manufacturer findById(Long id){
        return manufacturerRepository.findManufacturerById(id);
    }

    public Set<Manufacturer> findByCountry(String country){
        return manufacturerRepository.findAllByCountry(country.toLowerCase());
    }
}
