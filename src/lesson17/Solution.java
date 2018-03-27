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
}
