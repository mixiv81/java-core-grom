package Lesson10.polyexample;

public class User extends Human {

    public User(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("User class call...");
        super.run();
    }
}
