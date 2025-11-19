package by.task13.repository;

import by.task13.entity.User;
import by.task13.exception.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public static List<User> users = new ArrayList<>();

    static {
        User user1 = new User("Masha", "qwerty", "Маша", "Коровина");
        User user2 = new User("Sasha", "123456", "Саша", "Моровина");
        User user3 = new User("Dasha", "159753", "Даша", "Норовина");
        User user4 = new User("Glasha", "asdgh", "Глаша", "Поровина");
        User user5 = new User("Egor", "dsggh", "Егор", "Петров");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

    }

    public User searchUserByLogin(String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
//        System.out.println("Такого пользователя с логином не найдено!");
//        return new User();
        throw new UserNotFoundException("Такого пользователя с логином не найдено! ");
    }
}
