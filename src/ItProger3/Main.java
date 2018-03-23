package ItProger3;

import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    protected void askAge(){
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);
    }
}
