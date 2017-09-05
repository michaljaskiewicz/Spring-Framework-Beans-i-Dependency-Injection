package dev.mj.springtutorial.implementations;

import dev.mj.springtutorial.api.Logger;
import dev.mj.springtutorial.api.UsersRepository;
import dev.mj.springtutorial.domain.User;
import lombok.AllArgsConstructor;

public class UsersRepositoryImpl implements UsersRepository {
    private Logger logger;

    public UsersRepositoryImpl(Logger logger, String location) {
        this.logger = logger;
        logger.log("Lokalizacja repozytorium: " + location);
    }

    public User createUser(String name) {
        logger.log("Tworzenie użytkownika " + name);
        return new User(name);
    }

}
