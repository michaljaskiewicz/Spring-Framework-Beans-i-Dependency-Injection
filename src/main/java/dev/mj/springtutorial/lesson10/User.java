package dev.mj.springtutorial.lesson10;

import lombok.*;

@Getter
@Setter
@ToString
class User {
    private String name;
    private Address address;

    User(String name) {
        this.name = name;
    }
}
