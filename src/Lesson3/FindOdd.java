package Lesson3;

public class FindOdd {
    public static void main(String[] args) {
        int a = -1;
        int sum = 0;
        while (a < 1000) {
            a++;
            if (a % 2 != 0) {
                System.out.println("Found");
                sum += a;
            }
        }
        if (sum * 5 > 5000)
            System.out.println("Bigger");
        else
            System.out.println("Smaller or equal");
    }
}
