package Lesson10.polyexample;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Human class call...");
        System.out.println(name + " is running");
    }
}
