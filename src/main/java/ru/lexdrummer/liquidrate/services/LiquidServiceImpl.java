package ru.lexdrummer.liquidrate.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.lexdrummer.liquidrate.repositories.LiquidRepository;

@Slf4j
@Service
public class LiquidServiceImpl implements LiquidService {

    private final LiquidRepository liquidRepository;

    public LiquidServiceImpl(LiquidRepository liquidRepository) {
        this.liquidRepository = liquidRepository;
    }
}
