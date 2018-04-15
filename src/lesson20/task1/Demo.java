package lesson20.task1;

import lesson20.task1.exception.UserNotFoundException;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws Exception {


        User user = new User(1, "Andrey", "aaa1");
        User user1 = new User(2, "Ann", null);
        User user2 = new User(0, "Ihor", "aaa3");
        User user3 = new User(4, null, "aaa4");
        User user4 = null;
        User user5 = new User(5, null, null);
        User user6 = new User(5, "Ihor", "aaa4");


        User[] users = new User[]{user, user1, user2, user3, null, user4};
        User[] users1 = null;
        UserRepository userRepository = new UserRepository(users);
        UserRepository userRepository1 = new UserRepository(users1);
//        System.out.println(".................find.....................");
//        System.out.println(userRepository.findById(2));
//        System.out.println(userRepository.findById(6));
//        System.out.println(userRepository1.findById(0));
//        System.out.println("................getUsers................");
//        System.out.println(Arrays.toString(userRepository.getUsers()));
//        System.out.println(Arrays.toString(userRepository1.getUsers()));
//        System.out.println(".................save.....................");
        System.out.println(userRepository.save(user1));
//        System.out.println(userRepository.save(user5));
//        System.out.println(Arrays.toString(userRepository.getUsers()));
//        System.out.println(userRepository1.save(user4));
//        System.out.println(userRepository1.save(user5));
//        System.out.println(userRepository1.save(user6));
//        System.out.println(Arrays.toString(userRepository1.getUsers()));
//        System.out.println(".............update.....................");
//        System.out.println(userRepository.update(user4));
//        System.out.println(userRepository.update(user5));
//        System.out.println(userRepository.update(user6));
//        System.out.println(Arrays.toString(userRepository.getUsers()));
//        System.out.println(userRepository1.update(user4));
//        System.out.println(userRepository1.update(user5));
//        System.out.println(userRepository1.update(user6));
//        System.out.println(Arrays.toString(userRepository1.getUsers()));
//        System.out.println("...........delete...................");
//        userRepository.delete(5);
//        userRepository.delete(10);
//        System.out.println(Arrays.toString(userRepository.getUsers()));
//        userRepository1.delete(5);
//        userRepository1.delete(10);
//        System.out.println(Arrays.toString(userRepository1.getUsers()));
//        System.out.println("...........count.....................");
//        System.out.println(userRepository.countArrInd());
//        System.out.println(userRepository1.countArrInd());

    }}
