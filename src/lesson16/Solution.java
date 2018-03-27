package lesson16;



public class Solution {
    public static void main(String[] args) {
        String test = "  There is Test something new"  +  "    or jot sdf sdf sdf word Test op or f  ";
        String test1 = null;
        System.out.println(countWords(test1));
        System.out.println(countWords(test));

    }

    public static int countWords(String input) {
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
