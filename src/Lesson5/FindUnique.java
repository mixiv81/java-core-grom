package Lesson5;

import java.util.Arrays;

public class FindUnique {
    public static void main(String[] args) {
        int[] array = {2, 4, 8, 4, 6, 3, 2, 7, 8, 8};
        System.out.println(Arrays.toString(uniqueCount(array)));
    }

    static int[] uniqueCount(int[] array) {
        int sort = 0;
        for (int i = 0; i <= array.length; i++) {
            for (int k = i + 1; k < array.length; k++)
                if (array[k] < array[i]) {
                    sort = array[i];
                    array[i] = array[k];
                    array[k] = sort;
                }
        }
        int countUnique = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    countUnique++;
                    break;
                }
            }
        }
        int result = count - countUnique;
        int[] uniq = new int[result];

        for (int i = 0; i <= array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }
        int index = 0;
        int resIndex = 0;
        for (int el : array) {
            if (el > 0) {
                uniq[resIndex] = array[index];
                resIndex++;
            }
            index++;
        }
        return uniq;
    }
}