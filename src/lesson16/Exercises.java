package lesson16;

public class Exercises {
    public static void main(String[] args) {
        String test = "There is Test something new or jot sdf sdf sdf word Test op or";

        System.out.println(deleteDuplicates(test));
    }

    static String deleteDuplicates(String input) {
        if (input == null) {
            return null;
        }
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    words[j] = "";
                }
            }
        }
        String res = "";
        for (String word : words) {
            res += word;
            if (!word.isEmpty())
                res += " ";
        }

        return res;
    }
}
