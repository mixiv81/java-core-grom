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
        if (!valid(input))
            return null;
        String[] strings = input.split(" ");
        String findWord = "";
        for (String string : strings) {
            if (checkNumbersAndSymbols(string) && string.length() >= findWord.length()) {
                findWord = string;
            }
        }
        if (findWord.equals(""))
            return null;
        else
            return findWord;
    }

    public String minWord(String input) {
        if (!valid(input))
            return null;
        String[] strings = input.split(" ");
        String findWord = "";
        for (String string : strings) {
            if (checkNumbersAndSymbols(string)) {
                findWord = string;
            }
        }
        if (findWord.equals(""))
            return null;
        for (String string : strings) {
            if (checkNumbersAndSymbols(string) && findWord.length() > string.length()) {
                findWord = string;
            }
        }
        return findWord;
    }

    public String mostCountedWord(String input) {
        if (!valid(input))
            return null;
        String[] strings = input.split(" ");
        String findWord = "";
        int max = 0;
        for (String string : strings) {
            if (checkNumbersAndSymbols(string) && countDuplicates(string, strings) > max) {
                findWord = string;
                max = countDuplicates(string, strings);
            }
        }
        if (valid(findWord))
            return findWord;
        else
            return null;
    }

    public int countDuplicates(String string, String[] strings) {
        if (!valid(string))
            return 0;
        int count = -1;
        for (String stringElem : strings) {
            if (stringElem.equals(string))
                count++;
        }
        return count;
    }

    private boolean checkNumbersAndSymbols(String input) {
        if (!valid(input))
            return false;
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isLetter(input.charAt(i)))
                return false;
        }
        return true;
    }
    private boolean valid(String input) {
        return input != null && !input.isEmpty();
    }

}
