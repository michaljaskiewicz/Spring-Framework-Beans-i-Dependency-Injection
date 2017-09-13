package dev.mj.springtutorial.lesson11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
public class SomeBean {
    List<String> stringsList;
    Set<Integer> integersSet;
    Long[] longsArray;
}
