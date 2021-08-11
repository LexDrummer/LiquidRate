package ru.lexdrummer.liquidrate.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.lexdrummer.liquidrate.model.Liquid;
import ru.lexdrummer.liquidrate.model.Manufacturer;
import ru.lexdrummer.liquidrate.repositories.ManufacturerRepository;

import java.util.Set;

@Slf4j
@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    private final ManufacturerRepository manufacturerRepository;

    public ManufacturerServiceImpl(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }

    @Override
    public Manufacturer findByName() {
        return null;
    }

    @Override
    public Set<Liquid> findProducts() {
        return null;
    }
}
