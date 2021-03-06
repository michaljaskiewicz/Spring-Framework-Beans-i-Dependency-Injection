package dev.mj.springtutorial.lesson10;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
class Address {
    private String locality;
    private String zipCode;
    private String street;
    private String streetNumber;
}
