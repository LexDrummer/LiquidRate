package ru.lexdrummer.liquidrate.services;

import ru.lexdrummer.liquidrate.model.User;

public interface UserService {
    User findByNickname(String nickname);
}
