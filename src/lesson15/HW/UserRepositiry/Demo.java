package lesson15.HW.UserRepositiry;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {


        User user = new User(1, "Andrey", "aaa1");
        User user1 = new User(2, "Ann", null);
        User user2 = new User(0, "Ihor", "aaa3");
        User user3 = new User(4, null, "aaa4");
        User user4 = null;
        User user5 = new User(5, null, "aaa4");
        User user6 = new User(5, "Ihor", "aaa4");


        User[] users = new User[]{user, user1, user2, user3, null};
        User[] users1 = null;
        UserRepository userRepository = new UserRepository(users);
        UserRepository userRepository1 = new UserRepository(users1);


     //   System.out.println(Arrays.toString(userRepository.getUserNames()));
        System.out.println(Arrays.toString(userRepository.getUsers()));
      ////  System.out.println(Arrays.toString(userRepository.getUserIds()));

      //  System.out.println(Arrays.toString(userRepository1.getUserNames()));
        System.out.println(Arrays.toString(userRepository1.getUsers()));
     //   System.out.println(Arrays.toString(userRepository1.getUserIds()));

        userRepository.findById(2);
      //  userRepository.getUserByName(null);
        userRepository.delete(2);
        System.out.println();
        userRepository1.findById(2);
       // userRepository1.getUserByName(null);
        userRepository.delete(2);
        System.out.println(Arrays.toString(userRepository.getUsers()));
        System.out.println();

       // userRepository1.getUserBySessionId(null);
        System.out.println();
        userRepository.save(user5);
        System.out.println(Arrays.toString(userRepository.getUsers()));
        userRepository.update(user6);
        System.out.println(Arrays.toString(userRepository.getUsers()));
        System.out.println();
     //   System.out.println(userRepository.getUserById(1));
        System.out.println();
     //   System.out.println(userRepository.getUserByName("Ihor"));
     //   System.out.println(userRepository.getUserNameById(1));

    }
}
