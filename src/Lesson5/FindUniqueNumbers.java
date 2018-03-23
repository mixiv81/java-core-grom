package Lesson5;

import java.util.Arrays;

public class FindUniqueNumbers {
    public static void main(String[] args) {
        int[] array = {2, 4, 8, 4, 6, 3, 2, 7, 8, 8};
        System.out.println(uniqueCount(array));
    }

    static int uniqueCount(int[] array) {
        int countUnique = 0;
        int count = 0;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    countUnique++;
                    break;
                }
            }
        }
    return result= count - countUnique;
}
}
