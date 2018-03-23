package Lesson5;

import java.util.Arrays;

public class SortArrays {
            public static void main(String[] args) {
            int[] array = {10, 5, 6, 7, 8, 3, 4, 2, 45, 62};
           // System.out.println(Arrays.toString(array_sortAscending(array)));
            //System.out.println(Arrays.toString(array_sortDiscending(array)));
        }
    public int [] array_sortAscending(int[] array) {
        int tempResult;
        if (array != null)
        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[i]) {
                    tempResult = array[i];
                    array[i] = array[j];
                    array[j] = tempResult;
                }
        return array;
    }
    public int [] array_sortDiscending(int[] array) {
        int tempResult;
        if (array != null)
        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[j] > array[i]) {
                    tempResult = array[i];
                    array[i] = array[j];
                    array[j] = tempResult;
                }
        return array;
    }
}