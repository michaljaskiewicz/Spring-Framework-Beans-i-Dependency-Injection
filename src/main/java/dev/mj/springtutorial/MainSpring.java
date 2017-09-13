package dev.mj.springtutorial;

import dev.mj.springtutorial.implementations.SomeBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

        SomeBean bean = context.getBean("someBean", SomeBean.class);
    }
}
