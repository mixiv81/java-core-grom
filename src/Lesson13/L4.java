package Lesson13;

import Lesson4.CountExample;
import Lesson4.MethodExample;
import Lesson4.SumExercise;

public class L4 {

    public static void main(String[] args) {

        //methodExample
        MethodExample methodExample = new MethodExample();
        System.out.println(methodExample.increaser(5, 6));
        System.out.println(methodExample.increaser(5, Integer.MAX_VALUE));
        System.out.println(methodExample.increaser(5, 0));
        System.out.println(methodExample.increaser(-2, -2));
        //min
        System.out.println(methodExample.min(0,0));
        System.out.println(methodExample.min(0,2));
        System.out.println(methodExample.min(2,0));
        // findDivExample
        CountExample countExample = new CountExample();
        System.out.println(countExample.findDivCount((short)4,(short)15,2));
        System.out.println(countExample.findDivCount((short)15,(short)4,2));
        System.out.println();
        System.out.println(countExample.findDivCount((short)4,(short)15,0));
        // compareSums
        SumExercise sumExercise = new SumExercise();
        System.out.println(sumExercise.compareSums(5,6,1,2));
        System.out.println(sumExercise.compareSums(0,0,Integer.MIN_VALUE,2));
        System.out.println(sumExercise.compareSums(Integer.MAX_VALUE,6,1,2));
        //sum
        System.out.println(sumExercise.sum(4,5));
        System.out.println(sumExercise.sum(Integer.MAX_VALUE, Integer.MIN_VALUE));
        System.out.println(sumExercise.sum(Integer.MAX_VALUE, Integer.MAX_VALUE));

    }
}
