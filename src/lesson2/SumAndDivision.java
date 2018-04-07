package lesson2;

public class SumAndDivision {
    public static void main(String[] args) {
        int sum = 0;
        int x = 1;
        while (x < 1000) {
            x++;
            sum += x;
        }
        //System.out.println(sum);
        int a = sum / 1234;
        //System.out.println(a);
        int b = sum % 1234;
        //System.out.println(b);

        boolean d = b > a;
        System.out.println(d);
    }
}