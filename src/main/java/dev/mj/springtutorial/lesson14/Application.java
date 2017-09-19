package dev.mj.springtutorial.lesson14;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Application {
    private DictionaryRepository dictionaryRepository;
    private UsersRepository usersRepository;
}
