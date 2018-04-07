package lesson17;

public class Demo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String test = "https://org.org.org";
        System.out.println(solution.validate(test));
        String test1 = null;
        System.out.println(solution.validate(test1));

    }
}
