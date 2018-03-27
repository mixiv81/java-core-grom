package lesson17;


public class Solution {
    public static void main(String[] args) {
        String test = "   There is Test    something new or jot sdf sdf sdf word Test op or";
        String test1 =null;
        String test2 = "poporn";
        String test3 = "";

        System.out.println(countWords(test));
        System.out.println(countWords(test1));
        System.out.println(countWords(test));
        System.out.println(countWords(test));


        System.out.println(checkNumbersAndSymbols(test));
        System.out.println(checkNumbersAndSymbols(test1));
        System.out.println(checkNumbersAndSymbols(test2));
        System.out.println(checkNumbersAndSymbols(test3));

    }

    public static int countWords(String input) {
        if (input == null)
            return 0;
        String[] strings = input.split(" ");
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            if (checkNumbersAndSymbols(strings[i]))
                count++;
        }
        return count;
    }

    private static boolean checkNumbersAndSymbols(String input) {
        if (input == null)
            return false;
        if (input.isEmpty())
            return false;
        for (int i = 0; i < input.length(); i++){
        if (!Character.isLetter(input.charAt(i)))
            return false;
        }
        return true;
    }
}
