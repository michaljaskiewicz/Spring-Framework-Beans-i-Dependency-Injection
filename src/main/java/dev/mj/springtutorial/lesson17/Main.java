package dev.mj.springtutorial.lesson17;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lesson17.xml");

        Component1 component1 = context.getBean("component1", Component1.class);
        Component2 component2 = context.getBean("component2", Component2.class);

        System.out.println(component1.getUsersRepository().getInstanceNumber());
        System.out.println(component2.getUsersRepository().getInstanceNumber());


    }
}
