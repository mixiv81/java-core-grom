package Lesson10.polyexample;

public class Child extends Human {

    public Child(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Child class call...");
        super.run();
    }
}
