package Lesson5;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        //int[] array = {10, 5, 6, 7, 8, 3, 4, 2};
        //System.out.println(Arrays.toString(arraySortAscending(array)));
    }

    public int[] arraySortAscending(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            int min = arr[i];
            int min_i = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
                res = arr;
            }
        }
        return res;
    }
}