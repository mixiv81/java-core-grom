package lesson15.HW.UserRepositiry;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {


        User user = new User(1, "Andrey", "aaa1");
        User user1 = new User(2, "Ann", "aaa2");
        User user2 = new User(3, "Ihor", "aaa3");
        User user3 = new User(4, null, "aaa4");
        User user4 = null;

        User[] users = new User[]{user, user1, user2, user3, user4};
        UserRepository userRepository = new UserRepository(users);

        System.out.println(Arrays.toString(userRepository.getUserNames()));
        System.out.println(Arrays.toString(userRepository.getUsers()));
        System.out.println(Arrays.toString(userRepository.getUserIds()));


        userRepository.findById(4);
        userRepository.getUserByName("Ihor");
        userRepository.delete(4);

    }
}
