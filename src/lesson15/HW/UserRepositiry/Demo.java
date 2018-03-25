package lesson15.HW.UserRepositiry;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {


        User user = new User(1, "Andrey", "aaa1");
        User user1 = new User(2, "Ann", null);
        User user2 = new User(0, "Ihor", "aaa3");
        User user3 = new User(4, null, "aaa4");
        User user4 = null;
        User user5 = new User(5, null, "aaa5");
        User user6 = new User(5, "Ihor", "aaa4");


        User[] users = new User[]{user, user1, user2, user3, null, user4};
        User[] users1 = null;
        UserRepository userRepository = new UserRepository(users);
        UserRepository userRepository1 = new UserRepository(users1);


        System.out.println(Arrays.toString(userRepository.getUserNames()));
        System.out.println(Arrays.toString(userRepository.getUsers()));
        System.out.println(Arrays.toString(userRepository.getUserIds()));

        System.out.println(Arrays.toString(userRepository1.getUserNames()));
        System.out.println(Arrays.toString(userRepository1.getUsers()));
        System.out.println(Arrays.toString(userRepository1.getUserIds()));

        System.out.println(userRepository1.findById(2));
        userRepository1.getUserByName(null);
        userRepository1.delete(2);
        System.out.println();
        userRepository1.findById(2);
        userRepository1.getUserByName(null);
        userRepository.delete(2);
        System.out.println(Arrays.toString(userRepository1.getUsers()));
        System.out.println();

        userRepository1.getUserBySessionId(null);
        System.out.println();
        userRepository1.save(user4);
        System.out.println(Arrays.toString(userRepository1.getUsers()));
        userRepository1.update(user4);
        System.out.println(Arrays.toString(userRepository1.getUsers()));
        System.out.println();
        System.out.println(userRepository1.getUserById(1));
        System.out.println();
        System.out.println(userRepository1.getUserByName("Ihor"));
        System.out.println(userRepository1.getUserNameById(1));

        System.out.println(userRepository1.findById(2));


    }
}
