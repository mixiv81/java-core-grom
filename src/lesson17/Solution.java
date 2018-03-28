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
        String[] strings = input.split(" ");
        int max = 0;
        for (int numbersOfLetter : findArrNumbers(input)) {
            if (numbersOfLetter > max)
                max = numbersOfLetter;
        }

        for (String string : strings) {
            if (string.length() == max)
                return string;
        }
        return null;
    }

    public String minWord(String input) {
        if (input == null)
            return null;
        if (input.isEmpty())
            return null;
        String[] strings = input.split(" ");
        int min = findArrNumbers(input)[0];
        for (int i = 0; i < findArrNumbers(input).length; i++) {
            if (findArrNumbers(input)[i] < min)
                min = findArrNumbers(input)[i];
        }

        for (String string : strings) {
            if (string.length() == min)
                return string;
        }
        return null;
    }

    private int[] findArrNumbers(String input) {
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
        return numbersOfLetters;
    }
    private boolean checkNumbersAndSymbols(String input) {
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
