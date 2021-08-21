package ru.lexdrummer.liquidrate.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.lexdrummer.liquidrate.model.Liquid;
import ru.lexdrummer.liquidrate.repositories.CommentSectionRepository;
import ru.lexdrummer.liquidrate.repositories.LiquidRepository;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class LiquidServiceImpl implements LiquidService {

    private final LiquidRepository liquidRepository;
    private final CommentSectionRepository commentSectionRepository;

    public LiquidServiceImpl(LiquidRepository liquidRepository, CommentSectionRepository commentSectionRepository) {
        this.liquidRepository = liquidRepository;
        this.commentSectionRepository = commentSectionRepository;
    }

    @Override
    public Set<Liquid> findAllByManufacturersName(String manufacturer) {
        Set<Liquid> liquids = new HashSet<>();
        liquidRepository.findAll().forEach(liquid -> {
                if (liquid.getManufacturer().getName().equals(manufacturer)) liquids.add(liquid);}
        );
        return liquids;
    }

    @Override
    public Set<Liquid> findByRate(Long min, Long max) {
        Set<Liquid> liquids = new HashSet<>();
        return liquids;
    }

    @Override
    public Liquid findByName(String name) {
        return liquidRepository.findByName(name);
    }

}
