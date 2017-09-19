package dev.mj.springtutorial.lesson13;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class SomeBean {
    private InjectedBean injectedBean;
    private InjectedBean injectedBean2;
}
