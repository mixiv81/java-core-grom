package Lesson11.biginterfaceexample;

public class SimpleReader implements Readable {

    @Override
    public void readFileFromStorage(Storage storage) {
        for (File file : storage.getFiles()) {
            if (file != null)
                System.out.println(file.getName());
            else
                System.out.println(file);
        }
    }
}
