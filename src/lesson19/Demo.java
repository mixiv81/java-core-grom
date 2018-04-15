package lesson19;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws Exception {

        Controller controller = new Controller();


        File file1 = new File(1, "test1", "txt", 100);
        File file2 = new File(2, "test2", "txt", 200);
        File file3 = new File(3, "test3", "png", 300);
        File file4 = new File(4, "test4", "png", 400);
        File file5 = new File(5, "test5671", "txt", 500);
        File file6 = null;
        File file7 = new File(5, "test9gf1", "txt", 50000000);
        File file8 = new File(3, "test4", "png", 400);
        File file9 = new File(4, "test4", "pg", 40000000);

        File[] files = {file1, file2, null, null, null, null};
        File[] files1 = {null, file5, null, file3, file4};
        File[] files2 = {file2, file5, file3, file4};
        File[] files3 = {null, null, null, file2};


        String[] formatsSupported = {"txt", "png"};

        Storage storage = new Storage(1, files, formatsSupported, "Ukraine", 15000);
        Storage storage1 = new Storage(2, files1, formatsSupported, "Ukraine", 15000);
        Storage storage2 = new Storage(3, files2, formatsSupported, "Ukraine", 1500);
        Storage storage3 = new Storage(4, files3, formatsSupported, "Ukraine", 1500);

        Storage storage4 = null;


//        System.out.println(controller.put(storage, file5));
//        System.out.println(controller.put(storage3, file5));
        System.out.println(controller.put(storage, file7));
//        System.out.println(controller.put(storage1, file8));
//        System.out.println(controller.put(storage2, file9));
//
//        controller.delete(storage, file5);
//        controller.delete(storage3, file5);
//        controller.delete(storage, file7);
//        controller.delete(storage1, file8);
//        controller.delete(storage2, file6);
//        controller.delete(storage3, file5);

//        System.out.println(Arrays.toString(controller.transferAll(storage1,storage)));
//        System.out.println(Arrays.toString(controller.transferAll(storage2,storage1)));
//        System.out.println(Arrays.toString(controller.transferAll(storage3,storage1)));
//        System.out.println(Arrays.toString(controller.transferAll(storage3,storage)));
//
//        System.out.println(Arrays.toString(controller.transferFile(storage1,storage, 3)));
//        System.out.println(Arrays.toString(controller.transferFile(storage2,storage1, 0)));
//        System.out.println(Arrays.toString(controller.transferFile(storage3,storage1, 6)));
//        System.out.println(Arrays.toString(controller.transferFile(storage,storage3, 5)));
//        System.out.println(Arrays.toString(controller.transferFile(storage3, storage3, 2)));


    }
}