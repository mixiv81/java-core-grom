package lesson33;


import org.apache.commons.io.IOUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadWriteFile {

    public static void main(String[] args) {
        readFile("C:/Users/User/Desktop/test.txt");
    }

    private static void readFile(String path){
        FileReader reader;
        try{
            reader = new FileReader(path);
        }catch (FileNotFoundException e){
            System.err.println("File does not exist");
            return;
        }

        BufferedReader br = new BufferedReader(reader);

        try {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e){
            System.err.println("Reading from file " + path + " failed");
        }finally {
            IOUtils.closeQuietly(reader);
            IOUtils.closeQuietly(br);
        }
    }
}
