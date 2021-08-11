package ru.lexdrummer.liquidrate.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.lexdrummer.liquidrate.model.CommentSection;
import ru.lexdrummer.liquidrate.model.Liquid;
import ru.lexdrummer.liquidrate.repositories.CommentSectionRepository;
import ru.lexdrummer.liquidrate.repositories.LiquidRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
    public Set<Liquid> findByManufacturer(String manufacturer) {
        return liquidRepository.findByManufacturer(manufacturer);
    }

    @Override
    public Set<Liquid> findByRate(Long min, Long max) {
        Set<Liquid> liquids = new HashSet<>();
        liquidRepository.findAll().forEach(liquidItr -> {
            if(liquidItr.getRate() > min && liquidItr.getRate() < max)
                liquids.add(liquidItr);
        });
        return liquids;
    }

    @Override
    public Liquid findByName(String name) {
        return liquidRepository.findByName(name);
    }

    @Override
    public Long getRateByLiquidName(String name) {
        Set<CommentSection> comments = commentSectionRepository.findByLiquidName(name);
        List<Long> rates = new ArrayList<>();
                comments.forEach(comment -> rates.add(comment.getRate()));
                Long rate = rates.stream().reduce(Long::sum).get()/rates.size();
        return rate;
    }
}
