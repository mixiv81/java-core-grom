package lesson22.arrays;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] array = {10, 5, 2, 6, 7, 8, 3, 4, 2, 45, 62};

        System.out.println(ArrayUtils.maxElement(array));

        System.out.println(ArrayUtils.nCount(array, 2));

        System.out.println(Arrays.toString(ArrayUtils.sortAscending(array)));

        System.out.println(Arrays.toString(ArrayUtils.sortDescending(array)));

    }
}
