package dev.mj.springtutorial.lesson14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lesson14.xml");

        Application app = context.getBean("app", Application.class);
        System.out.println(app.getUsersRepository().exists());
        System.out.println(app.getDictionaryRepository().getMap());
    }
}
