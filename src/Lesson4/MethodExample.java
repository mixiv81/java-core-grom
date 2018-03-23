package Lesson4;

public class MethodExample {
    public static void main(String[] args) {
//        System.out.println(increaser(5, 20));
//        System.out.println(min(increaser(10,5),11));
    }

    public int increaser(int a, int index) {
        System.out.println("method invoked");
        a += index;
        System.out.println("method before return");
        return a;
    }

    public int min(int a, int b) {
        return a < b ? a : b;
    }
}
