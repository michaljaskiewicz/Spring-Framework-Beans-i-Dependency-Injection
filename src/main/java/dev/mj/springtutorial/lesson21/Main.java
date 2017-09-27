package dev.mj.springtutorial.lesson21;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lesson21.xml");

        System.out.println(context.getBean("database", Database.class));
    }
}
