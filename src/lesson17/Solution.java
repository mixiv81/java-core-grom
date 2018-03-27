package lesson17;



public class Solution {

    public int countWords(String input) {
        if (input == null)
            return 0;
        int count = 0;
        String string = input.trim();
            for (int i = 0; i < string.length(); i++) {
                    if (string.charAt(i) == ' ' && string.charAt(i + 1) != ' ')
                        count++;
            }
            return count + 1;
        }
    }
