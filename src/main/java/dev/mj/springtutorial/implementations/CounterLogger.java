package dev.mj.springtutorial.implementations;

import dev.mj.springtutorial.api.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("counterLoggerAnnotationQualifier")
public class CounterLogger implements Logger {
    private int counter = 1;

    @Override
    public void log(String message) {
        System.out.println(counter++ + ": " + message);
    }
}
