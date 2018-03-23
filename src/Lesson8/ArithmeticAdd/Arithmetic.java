package Lesson8.ArithmeticAdd;

public class Arithmetic {

    public boolean check(int[] array) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[max])
                max = i;
            else if (array[i] < array[min])
                min = i;
        }
        return array[max] + array[min] > 100;
    }
}