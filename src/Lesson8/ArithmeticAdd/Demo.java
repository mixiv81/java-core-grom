package Lesson8.ArithmeticAdd;

public class Demo {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(5, 8));

        int[] arr = {50, 40, 56, -36, 54, 10, 56};
        System.out.println(adder.check(arr));
    }
}
