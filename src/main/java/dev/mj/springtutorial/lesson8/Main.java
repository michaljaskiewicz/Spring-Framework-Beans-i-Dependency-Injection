package dev.mj.springtutorial.lesson8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Main {

    static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lesson8.xml");
        SomeBean someBean = context.getBean("someBean", SomeBean.class);
        SomeBean anotherBean = context.getBean("anotherBean", SomeBean.class);
        System.out.println(someBean);
        System.out.println(anotherBean);
    }
}
