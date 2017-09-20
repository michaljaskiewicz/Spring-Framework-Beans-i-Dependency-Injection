package dev.mj.springtutorial.lesson17;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class UsersRepository {
    private static int instance = 0;
    private int instanceNumber = ++instance;
}
