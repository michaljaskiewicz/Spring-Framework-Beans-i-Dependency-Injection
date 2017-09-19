package dev.mj.springtutorial.lesson14;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
//@Setter
@AllArgsConstructor
class Application {
    private DictionaryRepository dictionaryRepository;
    private UsersRepository usersRepository;
}
