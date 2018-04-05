package lesson17;

public class Solution {

    public boolean validate(String address) {
        if (address == null)
            return false;
        if (address.isEmpty())
            return false;
        String[] strings = address.trim().split("://");
        if (strings.length < 2 || !checkProtocol(strings[0]))
            return false;
        String[] domen = strings[1].split("\\.");
        return domen.length == 2 && checkDomen(domen[1]) && checkNames(domen[0])
                && checkDomenPoint(address) && !checkDomen(domen[0]) && checkLengthDomenName(domen[0])

                || domen.length == 3 && domen[0].equals("www") && checkDomen(domen[2]) && checkNames(domen[1])
                && checkDomenPoint(address) && !checkDomen(domen[0]) && checkLengthDomenName(domen[1]);
    }

    private boolean checkProtocol(String address) {
        return address.equals("http") || address.equals("https");
    }

    private boolean checkDomen(String address) {
        return address.equals("com") || address.equals("net") || address.equals("org");
    }

    private boolean checkDomenPoint(String address) {
        String[] domens = {".com", ".net", ".org"};
        for (String domen : domens) {
            if (address.endsWith(domen))
                return true;
        }
        return false;
    }

    private boolean checkNames(String input) {
        if (input == null)
            return false;
        if (input.isEmpty())
            return false;
        for (char ch : input.toCharArray()) {
            if (!Character.isLetterOrDigit(ch))
                return false;
        }
        return true;
    }

    private boolean checkLengthDomenName(String input) {
        return (input.length() >= 3) && (input.length() <= 63);
    }



    public String mostCountedWord(String input) {
        if (input == null || input.isEmpty())
            return null;
        String[] words = input.trim().split(" ");
        if (words.length == 1 && !checkLetters(words[0]))
            return null;
        int max = 0;
        String findWord = "";

        for (String word : words) {
            if (countDuplicates(word, words) > max) {
                max = countDuplicates(word, words);
                findWord = word;
            }
        }
        if (!findWord.equals(""))
            return findWord;
        else
            return null;
    }



    private boolean checkLetters(String input) {
        for (char ch : input.toCharArray()) {
            if (!Character.isLetter(ch))
                return false;
        }
        return true;
    }

    private int countDuplicates(String string, String[] strings) {
        if (string == null || string.isEmpty())
            return 0;
        int count = 0;
        for (String stringElem : strings) {
            if (checkLetters(string) && stringElem.equals(string))
                count++;
        }
        return count;
    }
}
