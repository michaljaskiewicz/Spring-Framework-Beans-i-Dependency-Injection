package dev.mj.springtutorial.implementations;

import dev.mj.springtutorial.api.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Qualifier("withDateLoggerAnnotationQualifier")
public class WithDateLogger implements Logger {

    public void log(String message) {
        System.out.println(new Date() + " : " + message);
    }
}
