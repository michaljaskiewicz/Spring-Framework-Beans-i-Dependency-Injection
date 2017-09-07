package dev.mj.springtutorial.lesson7;

import java.util.logging.Logger;

public class UsersCreator {

    Logger logger = Logger.getLogger(User.class.getName());

    public User createUser(String username) {
        logger.info("Tworzenie użytkownika " + username);
        User user = new User();
        user.setName(username);
        return user;
    }
}
