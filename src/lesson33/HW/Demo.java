package lesson33.HW;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        WriteFromConsole writeFromConsole = new WriteFromConsole();
        writeFromConsole.writeToFileFromConsole("C:/Users/User/Desktop/test2.txt");

//        WriteFromConsole.writeFile("C:/Users/User/Desktop/test2.txt", "C:/Users/User/Desktop/test2.txt");
    }
}
