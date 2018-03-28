package lesson17;


public class Solution {

    public int countWords(String input) {
        if (input == null)
            return 0;
        String[] strings = input.split(" ");
        int count = 0;
        for (String string : strings) {
            if (checkNumbersAndSymbols(string))
                count++;
        }
        return count;
    }

    public String maxWord(String input) {
        if (input == null)
            return null;
        if (input.isEmpty())
            return null;
        String input1 = input.trim();
        String[] strings = input1.split(" ");
        String res = "";
        int max = 0;
        for (String string : strings) {
            if (checkNumbersAndSymbols(string) && string.length() >= max) {
                max = string.length();
                res = string;
            }
        }
        return res;
    }

    public String minWord(String input) {
        if (input == null)
            return null;
        if (input.isEmpty())
            return null;
        String[] strings = input.split(" ");
        String res = "";
        int min = Integer.MAX_VALUE;
        for (String string : strings) {
            if (checkNumbersAndSymbols(string) && string.length() < min) {
                min = string.length();
                res = string;
            }
        }
        return res;
    }


    private boolean checkNumbersAndSymbols(String input) {
        if (input == null)
            return false;
        if (input.isEmpty())
            return false;
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isLetter(input.charAt(i)))
                return false;
        }
        return true;
    }
}
