package lesson18.exercise1;

public class Task {

    public static void main(String[] args) {
        FileStorage fileStorage = new FileStorage();
        String[] fileNames = {"test1", "test2"};
        fileStorage.setFiles(fileNames);

        System.out.println("Start printing name...");

        printer(fileStorage);

        System.out.println("Done");
    }

    public static void printer(Storage storage) {
        String[] names = storage.getFiles();
        try {
            System.out.println("5th name is " + names[4]);
        } catch (Exception e) {
            System.out.println("5h name can not be found");
            // System.out.println(e.getMessage());
        }
    }
}
