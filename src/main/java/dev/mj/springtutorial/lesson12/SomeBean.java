package dev.mj.springtutorial.lesson12;

import lombok.Getter;
import lombok.Setter;

import java.util.Locale;
import java.util.Map;
import java.util.Properties;

@Getter
@Setter
class SomeBean {
    private Map<String, Locale> locales;
    private Properties settings;
}
