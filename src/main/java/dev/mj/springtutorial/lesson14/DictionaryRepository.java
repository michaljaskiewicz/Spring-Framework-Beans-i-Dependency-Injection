package dev.mj.springtutorial.lesson14;

import java.util.HashMap;
import java.util.Map;

class DictionaryRepository {
    Map<String, String> getMap() {
        Map<String, String> result = new HashMap<>();
        result.put("a", "b");
        return result;
    }
}
