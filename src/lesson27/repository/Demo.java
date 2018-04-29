package lesson27.repository;


import java.util.Arrays;

public class Demo {

    public static void main(String[] args) throws Exception {
        UserRepository userRepository = new UserRepository();


        User user1 = new User(1001, "Daniil", "fg55fg5");
        userRepository.save(user1);
        User user4 = null;
//        System.out.println(userRepository.save(user4));

//        userRepository.save(user1);

        System.out.println(userRepository.getUsers());

        User user2 = new User(1002, "Daniil", "fg55fg5");
        userRepository.save(user2);

        System.out.println(userRepository.getUsers());
//
        User user3 = new User(1001, "Test", "fg55fg5");
        userRepository.update(user3);
//
        System.out.println(userRepository.getUsers());
//
        userRepository.delete(1002);

        System.out.println(userRepository.getUsers());

    }
}
