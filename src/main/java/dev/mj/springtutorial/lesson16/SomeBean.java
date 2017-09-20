package dev.mj.springtutorial.lesson16;

import org.springframework.beans.factory.DisposableBean;

class SomeBean implements DisposableBean {
    void destroyMethod() {
        System.out.println("Destroying bean!");
    }

    void isWorking() {
        System.out.println("Is working!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying bean from disposable!");
    }
}
