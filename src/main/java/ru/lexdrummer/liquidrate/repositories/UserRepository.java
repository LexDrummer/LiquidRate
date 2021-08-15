package ru.lexdrummer.liquidrate.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.lexdrummer.liquidrate.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByNickname(String nickname);
}
