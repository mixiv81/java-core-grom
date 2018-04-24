package lesson25.hw;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws Exception {
        File file1 = new File(1, "aaa");
        File file2 = new File(2, "bbb");
        File file3 = new File(3, "ccc");
        File file4 = new File(4, "ddd");
        File file5 = new File(5, "eee");
        File file6 = new File(6, "fff");
        File file7 = new File(7, "ggg");
        File file8 = new File(8, "hhh");
        File file9 = new File(9, "jjj");
        File file10 = new File(10, "kkk");
        File file11 = new File(11, "lll");

        String string = "jhhghjg";
        Short sh = 5;


        GeneralDAO<File> generalDAO = new GeneralDAO<>();
        GeneralDAO<String> generalDAO1 = new GeneralDAO<>();
        GeneralDAO<Short> generalDAO2 = new GeneralDAO<>();



        System.out.println(generalDAO.save(file1));
        System.out.println(generalDAO.save(file2));
        System.out.println(generalDAO.save(file3));
        System.out.println(generalDAO.save(file4));
        System.out.println(generalDAO.save(file5));
        System.out.println(generalDAO.save(file6));
        System.out.println(generalDAO.save(file7));
//        System.out.println(generalDAO.save(file8));
//        System.out.println(generalDAO.save(file9));
//        System.out.println(generalDAO.save(file10));
//        System.out.println(generalDAO.save(file11));
        System.out.println(generalDAO1.save(string));
        System.out.println(generalDAO2.save(sh));

        System.out.println(Arrays.deepToString(generalDAO.getAll()));
        System.out.println(Arrays.deepToString(generalDAO1.getAll()));
        System.out.println(Arrays.deepToString(generalDAO2.getAll()));

    }
}
