package ru.lexdrummer.liquidrate;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.lexdrummer.liquidrate.model.*;
import ru.lexdrummer.liquidrate.repositories.CommentSectionRepository;
import ru.lexdrummer.liquidrate.repositories.LiquidRepository;
import ru.lexdrummer.liquidrate.repositories.ManufacturerRepository;
import ru.lexdrummer.liquidrate.repositories.UserRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {

    private final LiquidRepository liquidRepository;
    private final ManufacturerRepository manufacturerRepository;
    private final UserRepository userRepository;
    private final CommentSectionRepository commentSectionRepository;

    public DataLoader(LiquidRepository liquidRepository, ManufacturerRepository manufacturerRepository, UserRepository userRepository, CommentSectionRepository commentSectionRepository) {
        this.liquidRepository = liquidRepository;
        this.manufacturerRepository = manufacturerRepository;
        this.userRepository = userRepository;
        this.commentSectionRepository = commentSectionRepository;
    }

        @Override
        @Transactional
        public void onApplicationEvent (ContextRefreshedEvent contextRefreshedEvent){
            Manufacturer maxwells = new Manufacturer();
            maxwells.setCountry("Russia");
            maxwells.setName("Maxwells");
            Liquid shoria = new Liquid();
            shoria.setName("shoria");
            shoria.setManufacturer(maxwells);
            shoria.setType(Type.CLASSIC);
            shoria.setRates(new ArrayList<>());
            shoria.setTastes(new HashSet<>());
            shoria.setVolume(120);
            User alex = User.builder().nickname("lexdrummer").firstName("Alex").lastName("Rubin").
                    city("Koenig").birthdate(LocalDate.of(1991,4,14)).email("alexandr@mail.ru").build();
            CommentSection alexComment = CommentSection.builder().author(alex).comment("Top of the top.").liquid(shoria)
                    .liquidVolume(120).nicotine(3).rate(5L).build();
            CommentSection alexComment1 = CommentSection.builder().author(alex).comment("Probably bad batch").liquid(shoria)
                    .liquidVolume(120).nicotine(3).rate(3L).build();
            shoria.getRates().add(alexComment.getRate());
            alexComment1.getLiquid().getRates().add(alexComment1.getRate());
            liquidRepository.save(shoria);
            manufacturerRepository.save(maxwells);
            userRepository.save(alex);
            commentSectionRepository.save(alexComment);
            commentSectionRepository.save(alexComment1);



        }
    }

