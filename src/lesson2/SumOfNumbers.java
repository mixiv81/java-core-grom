package lesson2;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int a = 1;
        while (a < 1000) {
            a++;
            sum += a;

        }
        System.out.println(sum);
        int b = sum / 1234;
        System.out.println(b);

        int c = sum % 1234;
        System.out.println(c);

    }
}

