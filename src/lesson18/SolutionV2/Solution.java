package lesson18.SolutionV2;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String test = "   Ther e is Test  55 sdf / 0 4.5 8,1 b 5 or new 100 o5r sdfs  b jot. something  word op o5r";
        System.out.println(Arrays.toString(findNumbers(test)));

    }

    public static int[] findNumbers(String text) {
        String[] words = text.trim().split(" ");
        int[] numbers = new int[countWords(text)];
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty() && checkDigit(word)) {
                numbers[count] = Integer.parseInt(word);
                count++;
            } else {
                System.out.println(word + " not a number");
            }
        }
        return numbers;
    }

    private static int countWords(String input) {
        String[] words = input.trim().split(" ");
        int count = 0;
        for (String word : words) {
            if (checkDigit(word))
                count++;
        }
        return count;
    }

    private static boolean checkDigit(String input) {
        for (char ch : input.toCharArray()) {
            if (!Character.isDigit(ch))
                return false;
        }
        return true;
    }
}
