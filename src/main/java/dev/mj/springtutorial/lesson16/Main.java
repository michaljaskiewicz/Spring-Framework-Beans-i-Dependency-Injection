package dev.mj.springtutorial.lesson16;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lesson16.xml");
        context.registerShutdownHook();
        SomeBean someBean = context.getBean("someBean", SomeBean.class);
        someBean.isWorking();
    }
}
