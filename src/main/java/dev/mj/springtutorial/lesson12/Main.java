package dev.mj.springtutorial.lesson12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lesson12.xml");
        SomeBean someBean = context.getBean("someBean", SomeBean.class);
        System.out.println(someBean.getSettings());
        System.out.println(someBean.getLocales());
    }
}
