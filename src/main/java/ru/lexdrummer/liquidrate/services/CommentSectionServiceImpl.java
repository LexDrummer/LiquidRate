package ru.lexdrummer.liquidrate.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.lexdrummer.liquidrate.model.CommentSection;
import ru.lexdrummer.liquidrate.repositories.CommentSectionRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Slf4j
@Service
public class CommentSectionServiceImpl implements CommentSectionService {

    private final CommentSectionRepository commentSectionRepository;

    public CommentSectionServiceImpl(CommentSectionRepository commentSectionRepository) {
        this.commentSectionRepository = commentSectionRepository;
    }

    @Override
    public Set<CommentSection> findAllByLiquidName(String name) {
        return commentSectionRepository.findAllByLiquidName(name);
    }

    public Set<CommentSection> findAllByLiquidId(Long id){
        return commentSectionRepository.findAllByLiquidId(id);
    }

    public Double findRateByLiquidName(String name) {
        List<Double> rates = new ArrayList<>();
        commentSectionRepository.findAllByLiquidName(name).forEach(i -> rates.add(i.getRate()));
        double rate = (rates.stream().mapToDouble(i -> i).sum()) / rates.size();
        return rate;
    }
}
