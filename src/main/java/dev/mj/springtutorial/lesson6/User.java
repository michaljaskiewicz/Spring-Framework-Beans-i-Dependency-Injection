package dev.mj.springtutorial.lesson6;

import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
class User {
    private String name;
    private int age;

    static User getInstance(String name, int age) {
        User user = new User();
        user.name = name;
        user.age = age;
        return user;
    }
}
