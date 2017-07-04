package dev.mj.springtutorial;

import dev.mj.springtutorial.api.UsersRepository;
import dev.mj.springtutorial.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

        UsersRepository usersRepository = context.getBean("usersRepository", UsersRepository.class);
        User jan = usersRepository.createUser("Jan");
    }
}
