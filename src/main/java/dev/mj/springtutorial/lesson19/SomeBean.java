package dev.mj.springtutorial.lesson19;

import org.springframework.beans.factory.InitializingBean;

public class SomeBean implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialization of some bean");
    }
}
