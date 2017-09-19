package dev.mj.springtutorial.lesson15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lesson15.xml");
        SomeBean someBean = context.getBean("someBean", SomeBean.class);
        someBean.checkIsWorking();
    }
}
