package Lesson4;


public class SumExercise {

    public boolean compareSums(int a, int b, int c, int d) {
        return sum(a, b) > sum(c, d);
    }

    public long sum(int from, int to) {
        int res = 0;
                for (long i = from; i <= to; i++) {
            res += i;
        }
        return  res;
    }
}
