package lesson18.SolutionV2;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String test = "   Ther e is Test  55 sdf / 0  b 5 or new 100 o5r sdfs  b jot. something  word op o5r";
        String test1 = null;
        String test2 = "";
        String test3 = "4.5 5 8,0 kkl  ";
        String test4 = "0";


        System.out.println(Arrays.toString(findNumbers(test)));
        System.out.println(Arrays.toString(findNumbers(test1)));
        System.out.println(Arrays.toString(findNumbers(test2)));
        System.out.println(Arrays.toString(findNumbers(test3)));
        System.out.println(Arrays.toString(findNumbers(test4)));

    }

    public static int[] findNumbers(String text) {
        if (text == null || text.isEmpty())
            return null;
        String[] words = text.trim().split(" ");
        int[] numbers = new int[words.length];
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

    private static boolean checkDigit(String input) {
        for (char ch : input.toCharArray()) {
            if (!Character.isDigit(ch))
                return false;
        }
        return true;
    }
}
