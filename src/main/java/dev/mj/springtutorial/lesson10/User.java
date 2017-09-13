package dev.mj.springtutorial.lesson10;

import lombok.*;

@Getter
@Setter
@ToString
public class User {
    private String name;
    private Address address;

    public User(String name) {
        this.name = name;
    }
}
