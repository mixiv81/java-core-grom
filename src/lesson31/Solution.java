package lesson31;

import java.util.HashMap;

import java.util.Map;

public class Solution {


    public static Map<Character, Integer> countSymbols(String text) {
        Map<Character, Integer> map = new HashMap<>();

        char[] chars = text.toCharArray();
        if (chars.length < 1)
            return map;

        for (Character character : chars) {
            if (character != ' ' && Character.isLetter(character)) {
                map.put(character, countElements(chars, character));
            }
        }
        return map;
    }

    public static Map<String, Integer> words(String text) {
        Map<String, Integer> map = new HashMap<>();

        String[] strings = text.trim().split(" ");
        if (strings.length < 1)
            return map;

        for (String elem : strings) {
            if (checkLetters(elem)) {
                map.put(elem, countWords(elem, strings));
            }
        }
        return map;
    }

    private static int countElements(char[] characters, char ch) {
        int findNumbers = 0;
        for (Character character : characters) {
            if (character.equals(ch))
                findNumbers++;
        }
        return findNumbers;
    }

    private static int countWords(String string, String[] strings) {
        int count = 0;
        for (String stringElem : strings) {
            if (stringElem.equals(string))
                count++;
        }
        return count;
    }

    private static boolean checkLetters(String input) {
        if (input.length() < 2)
            return false;
        for (char ch : input.toCharArray()) {
            if (!Character.isLetter(ch))
                return false;
        }
        return true;
    }
}
