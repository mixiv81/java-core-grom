package Lesson13;

import Lesson9.HW.User;
import Lesson9.HW.UserRepository;

import java.util.Arrays;

public class L9 {
    public static void main(String[] args) {
        User[] users = new User[10];
        UserRepository userRepository = new UserRepository(users);

        System.out.println(Arrays.toString(userRepository.getUsers()));

//  добавляем юзеров  вмассив
//  проверяем метод "save"


        int i = 1;
        while (i < 15) {
            User user = new User(i, "Ann", "fg5f6");
            System.out.println(userRepository.save(user));
            i++;
        }
        System.out.println(Arrays.toString(userRepository.getUsers()));
        User user = new User(1, "JHJH", "fg5f6");            // добавляем существующего юзера
        System.out.println(Arrays.toString(userRepository.getUsers()));         // ничего не меняется

        System.out.println(userRepository.save(user));                         // null
        System.out.println(userRepository.save(null));                    // null, но сначала выдало ишибку. Добавил user != null


        // метод " update"
        User user1 = new User(1, null, "g45");
        System.out.println(Arrays.toString(userRepository.getUsers()));        // name == null, method is working
        userRepository.update(user1);
        System.out.println(Arrays.toString(userRepository.getUsers()));       // ok

        System.out.println(userRepository.update(null));                 //null, но сначала выдало ишибку. Добавил user != null


        // метод " delete"
        userRepository.delete(1);
        System.out.println(Arrays.toString(userRepository.getUsers()));
        userRepository.delete(1);
        System.out.println(Arrays.toString(userRepository.getUsers()));
        userRepository.delete(0);
        System.out.println(Arrays.toString(userRepository.getUsers()));

        // метод "findById("

        System.out.println(userRepository.findById(2));                       // ok, добавил users[i] != null, т.к. проверка на null  сначала не прошла
        System.out.println(userRepository.findById(0));                       // ok, output null

        // метод getUserBySessionId

        System.out.println(userRepository.getUserBySessionId(null));            //ok
        System.out.println(userRepository.getUserBySessionId("fg5f6"));         //ok
        System.out.println(userRepository.getUserBySessionId("tert"));          //ok
        System.out.println();


        // метод getUserByName
        System.out.println(userRepository.getUserByName(null));            //ok
        System.out.println(userRepository.getUserByName("fg5f6"));         //ok
        System.out.println(userRepository.getUserByName("Ann"));            //ok
        System.out.println();

        //getUserNameById
        System.out.println(userRepository.getUserNameById(0));            //ok
        System.out.println(userRepository.getUserNameById(3));           //ok
        System.out.println(userRepository.getUserNameById(2));            //ok
        System.out.println();

        System.out.println(Arrays.toString(userRepository.getUsers()));
        System.out.println();

        // метод getUserIds
        System.out.println(Arrays.toString(userRepository.getUserIds()));            //ok

        System.out.println();

        // метод getUserNames
        System.out.println(Arrays.toString(userRepository.getUserNames()));            //ok

        System.out.println();
    }
}