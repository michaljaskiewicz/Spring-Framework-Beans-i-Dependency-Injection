package dev.mj.springtutorial.lesson15;

import org.springframework.beans.factory.InitializingBean;

class SomeBean implements InitializingBean{
    void init() {
        System.out.println("SomeBean initialization");
    }

    void checkIsWorking() {
        System.out.println("I'm working!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After properties set initialization!");
    }
}
