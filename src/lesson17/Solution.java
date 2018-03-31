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
        if (address == null)
            return false;
        if (address.isEmpty())
            return false;
        String[] strings = address.trim().split("://");
        if (!checkHttp(strings[0]))
            return false;
        String[] host = strings[1].split("\\.");
        return host.length == 2 && checkDomen(host[1]) && checkAddress(host[0]) || host.length == 3 && checkwww(host[0]) && checkDomen(host[2]) && checkAddress(host[1]);
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
        return address.equals("com") || address.equals("net") || address.equals("org");
    }

    private boolean checkHttp(String http) {
        return http.equals("http") || http.equals("https");
    }

    private boolean checkwww(String www) {
        return www.equals("www");
    }
}