package lesson4;

public class CountExample {
    public int findDivCount(short a, short b, int n) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (n != 0 && i % n == 0)
                count++;
        }
        return count;
    }
}





