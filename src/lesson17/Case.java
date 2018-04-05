package lesson17;

public class Case {
    public static void main(String[] args) {

        Solution solution = new Solution();
        SolutionOld solutionOld = new SolutionOld();

        String test = "   Ther e is Test  5 sdf   b 5 or new o5r sdfs  b jot. something  word op o5r";
        String[] test1 = {"   Ther", "e", "is", null,  "5", "sdf",  "something", "new"," ","or","  ","b"," jot","."};
        // System.out.println(test.length());
        String[] test6 = test.trim().split(" ");
        String test12 = null;
        String test2 = "fsf4343 fsf4343";
        String test3 = "http://https://ergkerg.org.net";
        String test4 = "   hjhjfg      ";

        // System.out.println(test3.substring(0, 11));
//        String test4 = "  op The7re i/s Test    something new  jot s/df  i/s sdf word op or or  " + null + " or or";
        String test5 = null + "hfghhfgh";
        String test7 = "new";

//        System.out.println(solution.mostCountedWord(test));
//        System.out.println(solution.mostCountedWord(test12));
//        System.out.println(solution.mostCountedWord(test2));
//        System.out.println(solution.mostCountedWord(test3));
        System.out.println(solution.mostCountedWord(test4));

        //System.out.println(solution.checkWordsIsValid(test1));

//        System.out.println(solution.validate(test3));
//        System.out.println(solution.validate(test4));
//        System.out.println(solution.validate(test2));
//        System.out.println(solution.validate(test5));


//        private String[] checkWordsIsValid(String[] input) {
//        if (input == null)
//            return null;
//        int count = 0;
//        for (String anInput : input) {
//            if (!anInput.equals("") && checkLetters(anInput)) {
//                count++;
//            }
//        }
//        int countInd = 0;
//        String[] checkedWords = new String[count];
//        for (String anInput : input) {
//            if (!anInput.equals("") && checkLetters(anInput)) {
//                checkedWords[countInd] = anInput;
//                countInd++;
//            }
//        }
//        return checkedWords;
//    }
    }
}
