package dev.mj.springtutorial.lesson20;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lesson20.xml");

        SomeBean someBean = context.getBean("someBean", SomeBean.class);
        System.out.println(someBean.getProperty());

        Database myDatabase = context.getBean("myDatabase", Database.class);
        System.out.println(myDatabase);
    }
}
