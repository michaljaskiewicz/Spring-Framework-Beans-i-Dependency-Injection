package dev.mj.springtutorial;

import dev.mj.springtutorial.api.Logger;
import dev.mj.springtutorial.api.UsersRepository;
import dev.mj.springtutorial.domain.User;
import dev.mj.springtutorial.implementations.LoggerImpl;
import dev.mj.springtutorial.implementations.UsersRepositoryImpl;

public class Main {

    public static void main(String[] args) {
        Logger logger = new LoggerImpl();
        UsersRepository usersRepository = new UsersRepositoryImpl();
        usersRepository.setLogger(logger);

        User user = usersRepository.createUser("Jan");
    }
}
