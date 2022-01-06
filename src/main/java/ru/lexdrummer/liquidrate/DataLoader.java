package ru.lexdrummer.liquidrate;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.lexdrummer.liquidrate.repositories.CommentSectionRepository;
import ru.lexdrummer.liquidrate.repositories.LiquidRepository;
import ru.lexdrummer.liquidrate.repositories.ManufacturerRepository;
import ru.lexdrummer.liquidrate.repositories.UserRepository;

@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {

    private final LiquidRepository liquidRepository;
    private final ManufacturerRepository manufacturerRepository;
    private final UserRepository userRepository;
    private final CommentSectionRepository commentSectionRepository;

    public DataLoader(LiquidRepository liquidRepository, ManufacturerRepository manufacturerRepository,
                      UserRepository userRepository, CommentSectionRepository commentSectionRepository) {
        this.liquidRepository = liquidRepository;
        this.manufacturerRepository = manufacturerRepository;
        this.userRepository = userRepository;
        this.commentSectionRepository = commentSectionRepository;
    }

        @Override
        @Transactional
        public void onApplicationEvent (ContextRefreshedEvent contextRefreshedEvent){
        /*
        Manufacturer maxwells = new Manufacturer();
            maxwells.setCountry("Russia");
            maxwells.setName("Maxwells");
            Liquid shoria = new Liquid();
            shoria.setName("Shoria");
            shoria.setManufacturer(maxwells);
            shoria.setType(Type.CLASSIC);
            Set<Tastes> shoriaTastes = new HashSet<>();
            shoriaTastes.add(Tastes.NEEDLES);
            shoriaTastes.add(Tastes.ICE);
            shoriaTastes.add(Tastes.BERRIES);
            shoria.setTastes(shoriaTastes);
            shoria.setVolume(120);
            Set<Tastes> richTastes = new HashSet<>(Arrays.asList(Tastes.ICE, Tastes.BERRIES));
            Liquid rich = Liquid.builder().name("Rich").manufacturer(maxwells).tastes(richTastes)
                    .description("Mix of watermelon, melon and strawberry with ice").type(Type.CLASSIC)
                    .volume(120).rate(4.0).build();
            User alex = User.builder().nickname("lexdrummer").firstName("Alex").lastName("Rubin").
                    city("Koenig").birthdate(LocalDate.of(1991,4,14)).email("alexandr@mail.ru").build();
            CommentSection alexComment = CommentSection.builder().user(alex).comment("Top of the top.").liquid(shoria)
                    .liquidVolume(120).nicotine(3).rate(5.0).build();
            CommentSection alexComment1 = CommentSection.builder().user(alex).comment("Probably bad batch").liquid(shoria)
                    .liquidVolume(120).nicotine(3).rate(3.0).build();
            liquidRepository.save(shoria);
            liquidRepository.save(rich);
            manufacturerRepository.save(maxwells);
            userRepository.save(alex);
            commentSectionRepository.save(alexComment);
            commentSectionRepository.save(alexComment1);

            */

        }
    }

