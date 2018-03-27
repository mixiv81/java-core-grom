package lesson17;

public class Demo {
    public static void main(String[] args) {

        Solution solution = new Solution();

        String test = "   There is Test    something new or jot sdf sdf sdf word Test op or";
        String test1 =null;
        String test2 = "poporn";
        String test3 = "";
        String test4 = "   The7re is Test    something new or jot s/df sdf sdf word Test op or";

        System.out.println("------------ countWords--------------");
        System.out.println(solution.countWords(test));
        System.out.println(solution.countWords(test1));
        System.out.println(solution.countWords(test2));
        System.out.println(solution.countWords(test3));
        System.out.println(solution.countWords(test4));

        System.out.println("------------ checkNumbersAndSymbols--------------");
        System.out.println(solution.checkNumbersAndSymbols(test));
        System.out.println(solution.checkNumbersAndSymbols(test1));
        System.out.println(solution.checkNumbersAndSymbols(test2));
        System.out.println(solution.checkNumbersAndSymbols(test3));
        System.out.println(solution.checkNumbersAndSymbols(test4));

    }
}
