package dev.mj.springtutorial.api;

import dev.mj.springtutorial.domain.User;

public interface UsersRepository {
    User createUser(String name);
}
