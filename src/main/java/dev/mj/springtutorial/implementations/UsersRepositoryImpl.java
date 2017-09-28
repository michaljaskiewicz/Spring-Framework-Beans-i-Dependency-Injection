package dev.mj.springtutorial.implementations;

import dev.mj.springtutorial.api.Logger;
import dev.mj.springtutorial.api.UsersRepository;
import dev.mj.springtutorial.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service("usersRepository")
public class UsersRepositoryImpl implements UsersRepository {

    @Autowired
    private Logger logger;

    public User createUser(String name) {
        logger.log("Tworzenie użytkownika " + name);
        return new User(name);
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
