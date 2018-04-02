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
        if (input == null)
            return null;
        if (input.isEmpty())
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
        if (input == null)
            return null;
        if (input.isEmpty())
            return null;
        String[] strings = input.toLowerCase().split(" ");
        if (strings.length < 2)
            return null;
        String findWord = "";
        int max = 1;
        for (String string : strings) {
            if (checkNumbersAndSymbols(string) && countDuplicates(string, strings) > max) {
                findWord = string;
                max = countDuplicates(string, strings);
            }
        }
        if (!findWord.equals(""))
            return findWord;
        else
            return null;
    }

    public boolean validate(String address) {
        return address != null && !address.isEmpty() && checkDomen(address) && checkHttp(address) && checkHttp(address);
    }


    private int countDuplicates(String string, String[] strings) {
        if (string == null)
            return 0;
        if (string.isEmpty())
            return 0;
        int count = 0;
        for (String stringElem : strings) {
            if (checkNumbersAndSymbols(string) && stringElem.equals(string))
                count++;
        }
        return count;
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

    private boolean checkAddress(String input) {
        if (input == null)
            return false;
        if (input.isEmpty())
            return false;
        for (char chars : input.toCharArray()) {
            if (!Character.isLetterOrDigit(chars))
                return false;
        }
        return true;
    }

    private boolean checkDomen(String address) {
        return address.substring(address.length() - 4).equals(".com") || address.substring(address.length() - 4).equals(".net") || address.substring(address.length() - 4).equals(".com");
    }

    private boolean checkHttp(String address) {
        return address.substring(0, 7).equals("http://") && checkAddress(address.substring(7, address.length() - 4))
                || address.substring(0, 8).equals("https://") && checkAddress(address.substring(8, address.length() - 4))
                || address.substring(0, 11).equals("http://www.") && checkAddress(address.substring(11, address.length() - 4))
                || address.substring(0, 12).equals("https://www.") && checkAddress(address.substring(12, address.length() - 4));
    }

}