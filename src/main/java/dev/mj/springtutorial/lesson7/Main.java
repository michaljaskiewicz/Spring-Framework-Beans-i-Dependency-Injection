package dev.mj.springtutorial.lesson7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Main {

    static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lesson7.xml");
        User user = context.getBean("someUser", User.class);
        System.out.println(user);
    }
}
