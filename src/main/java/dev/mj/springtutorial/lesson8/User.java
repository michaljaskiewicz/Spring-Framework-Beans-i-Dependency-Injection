package dev.mj.springtutorial.lesson8;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Locale;

@AllArgsConstructor
@ToString
class User {
    private String name;
    private int age;
    private Locale locale;
}
