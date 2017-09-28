package dev.mj.springtutorial.implementations;

import dev.mj.springtutorial.api.Logger;
import org.springframework.stereotype.Service;

import java.util.Date;

//@Service
public class LoggerImpl implements Logger {

    public void log(String message) {
        System.out.println(new Date() + " : " + message);
    }
}
