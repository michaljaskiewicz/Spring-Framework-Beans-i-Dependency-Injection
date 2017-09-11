package dev.mj.springtutorial.lesson8;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Locale;

@AllArgsConstructor
@ToString
public class User {
    private String name;
    private int age;
    private Locale locale;
}
