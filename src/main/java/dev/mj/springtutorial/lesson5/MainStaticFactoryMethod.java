package dev.mj.springtutorial.lesson5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.util.Calendar;

class MainStaticFactoryMethod {

    static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lesson5.xml");
        Calendar calendar = (Calendar) context.getBean("calendar");
        DateFormat formatter = (DateFormat) context.getBean("formatter");
        System.out.println(formatter.format(calendar.getTime()));
    }
}
