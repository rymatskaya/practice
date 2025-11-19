package by.task13.service;

import by.task13.entity.User;
import by.task13.exception.NotCorrectPasswordException;
import by.task13.repository.UserRepository;

public class UserService {
    public User authenticate (String login, String password) {
        UserRepository userRepository = new UserRepository();
        User user = userRepository.searchUserByLogin(login);
        if (user.getPassword().equals(password)) {
           return user;
        }
        throw new NotCorrectPasswordException("Пароль не совпадает!");
    }
}
