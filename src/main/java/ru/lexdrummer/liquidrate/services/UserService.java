package ru.lexdrummer.liquidrate.services;

import org.springframework.stereotype.Service;
import ru.lexdrummer.liquidrate.model.User;

public interface UserService {
    User findByNickname(String nickname);
}
