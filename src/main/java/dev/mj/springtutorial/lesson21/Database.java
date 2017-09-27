package dev.mj.springtutorial.lesson21;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
class Database {
    private String host;
    private String port;
    private String user;
    private String password;
}
