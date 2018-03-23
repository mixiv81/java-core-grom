package Lesson13;

import Lesson5.SortArray;
import Lesson5.SortArrays;
import Lesson5.WithdrawalFromBalances;

import java.util.Arrays;

public class L5 {
    public static void main(String[] args) {
        SortArrays sortArrays = new SortArrays();
        int[] array = {10, 5, 2, 7, 0, 3, 4, 1};
        int[] array1 = {0};
        int[] array2 = {10, Integer.MAX_VALUE, 2, 7, 0, 3, 4, 1};
        int[] array3 = {};
        int[] array4 = null;

        String[] names = {"Andrey", "Oleg", "Alex", "Sem"};
        String[] names1 = {"Andrey", null, "Alex", "Sem"};

        int[] balances = {500, 200, 300, 200};

        //SortArrays sortArrays.array
        System.out.println(Arrays.toString(sortArrays.array_sortAscending(array)));
        System.out.println(Arrays.toString(sortArrays.array_sortAscending(array1)));
        System.out.println(Arrays.toString(sortArrays.array_sortAscending(array2)));
        System.out.println(Arrays.toString(sortArrays.array_sortAscending(array3)));
        System.out.println(Arrays.toString(sortArrays.array_sortAscending(array4)));        // добавил != null

        ////SortArrays array_sortDescending
        System.out.println(Arrays.toString(sortArrays.array_sortDiscending(array)));
        System.out.println(Arrays.toString(sortArrays.array_sortDiscending(array1)));
        System.out.println(Arrays.toString(sortArrays.array_sortDiscending(array2)));
        System.out.println(Arrays.toString(sortArrays.array_sortDiscending(array4)));        // добавил != null

        WithdrawalFromBalances withdrawalFromBalances = new WithdrawalFromBalances();
        System.out.println(withdrawalFromBalances.withdraw(names, balances, "Oleg", 50));
        System.out.println(withdrawalFromBalances.withdraw(names1, balances, "Oleg", 50));



    }
}
