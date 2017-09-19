package dev.mj.springtutorial.lesson10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Main {

    static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lesson10.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user2);
    }
}
