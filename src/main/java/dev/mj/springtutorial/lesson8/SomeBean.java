package dev.mj.springtutorial.lesson8;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SomeBean {
    private String stringValue;
    private int intValue;
    private User user;
}
