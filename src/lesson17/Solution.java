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


    public boolean checkNumbersAndSymbols(String input) {
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

    public String findArrNum(String input) {
        if (input == null)
            return null;
        if (input.isEmpty())
            return null;
        int[] numbersOfLetters = new int[countWords(input)];
        String[] strings = input.split(" ");
        int count = 0;
        for (String string : strings) {
            if (checkNumbersAndSymbols(string)) {
                numbersOfLetters[count] = string.length();
                count++;
            }
        }
        int max = 0;
        for (int numbersOfLetter : numbersOfLetters) {
            if (numbersOfLetter > max)
                max = numbersOfLetter;
        }

        for (String string : strings) {
            if (string.length() == max)
                return string;
        }
        return null;
    }
}
