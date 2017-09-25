package dev.mj.springtutorial.lesson19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lesson19.xml");
        context.getBean("someBean", SomeBean.class);
        context.getBean("someBean", SomeBean.class);
    }
}