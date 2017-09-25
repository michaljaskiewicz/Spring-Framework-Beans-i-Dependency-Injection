package dev.mj.springtutorial.lesson18;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;

class SomeBean implements BeanNameAware, ApplicationContextAware {
    private String name;
    private ApplicationContext applicationContext;

    @Override
    public void setBeanName(String name) {
        this.name = name;
    }

    void init() {
        Map<String, SomeBean> beansOfType = applicationContext.getBeansOfType(SomeBean.class);
        System.out.println("Creating bean with name " + name +
                ". Number of beans of someBean type is: " + beansOfType.size());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
