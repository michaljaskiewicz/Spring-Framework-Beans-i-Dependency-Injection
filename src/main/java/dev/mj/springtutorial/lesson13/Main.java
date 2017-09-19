package dev.mj.springtutorial.lesson13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lesson13.xml");

        SomeBean someBean = context.getBean("someBean", SomeBean.class);
        System.out.println(someBean.getInjectedBean());
        System.out.println(someBean.getInjectedBean2());
    }
}
