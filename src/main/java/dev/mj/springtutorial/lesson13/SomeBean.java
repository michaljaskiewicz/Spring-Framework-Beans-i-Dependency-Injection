package dev.mj.springtutorial.lesson13;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SomeBean {
    private InjectedBean injectedBean;
    private InjectedBean injectedBean2;
}
