package lesson32;

import java.util.Scanner;

public class Solution {

    public int readNumbers() {

        Scanner scr = new Scanner(System.in);

        int sum = 0;
        int attempts = 2;

        while (attempts >= 0) {
            System.out.println("Enter your numbers from 1 to 100");
            String[] numbers = scr.nextLine().trim().split(" ");
            if (!validate(numbers)) {
                if (attempts == 0) {
                    System.out.println("Your numbers are wrong. Numbers of attempts exceeded");
                    break;
                } else {
                    System.out.println("Your numbers are wrong. You have " + attempts + " attempts to try again");
                    attempts--;
                }
            } else {
                for (String number : numbers) {
                    sum += Integer.parseInt(number);
                }
                break;
            }
        }
        return sum;
    }


    private boolean validate(String[] input) {
        if (input.length != 10)
            return false;
        for (String number : input) {
            if (!validateDigit(number) || Integer.parseInt(number) > 100)
                return false;
        }
        return true;
    }

    private boolean validateDigit(String string) {
        for (char ch : string.toCharArray()) {
            if (!Character.isDigit(ch))
                return false;
        }
        return true;
    }
}
