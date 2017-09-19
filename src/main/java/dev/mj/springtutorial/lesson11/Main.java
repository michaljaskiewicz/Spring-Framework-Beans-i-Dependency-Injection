package dev.mj.springtutorial.lesson11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

class Main {

    static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lesson11.xml");
        SomeBean bean = context.getBean("someBean", SomeBean.class);
        System.out.println(bean.getIntegersSet());
        System.out.println(bean.getStringsList());
        System.out.println(Arrays.toString(bean.getLongsArray()));
    }
}
