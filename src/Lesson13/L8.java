package Lesson13;


import Lesson8.ArithmeticAdd.Adder;
import Lesson8.ArithmeticAdd.Arithmetic;


public class L8 {
    public static void main(String[] args) {

        int[] arr = {50, 65, 56, 150, 54, 55, 56};
        int[] arr2 = {50, 65, 56, 150, 54, 55, Integer.MAX_VALUE};
        int[] arr3 = {50, 65, 56, 150, 54, 55, Integer.MIN_VALUE};
        int[] arr1 = null;

        //arithmetic
        Arithmetic arithmetic = new Arithmetic();
        System.out.println(arithmetic.check(arr1));
        System.out.println(arithmetic.check(arr));
        System.out.println(arithmetic.check(arr2));
        System.out.println(arithmetic.check(arr3));


        //add
        Adder adder = new Adder();
        System.out.println(adder.add(1,3));
        System.out.println(adder.add(Integer.MAX_VALUE,3));
        System.out.println(adder.add(Integer.MIN_VALUE,Integer.MIN_VALUE));


    }
}