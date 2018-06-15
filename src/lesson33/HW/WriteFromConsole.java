package lesson33.HW;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class WriteFromConsole {

    public void writeToFileFromConsole(String path) {
        String content = path;
        if (!(new File(content).exists())) {
            System.err.println("File with path " + path + " not found");
            return;
        }

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        System.out.println("Enter file content to write in the file");

        try {
            content = br.readLine();
        } catch (IOException e) {
            System.err.println("Reading from keyboard failed");
        }

        try {
            if (br.readLine().equals("wr"))
                writeToFile(path, content);
        } catch (IOException e) {
            System.err.println("Error. Reading from keyboard failed");
        }finally {
            IOUtils.closeQuietly(reader);
            IOUtils.closeQuietly(br);
        }
    }

    private static void writeToFile(String path, String content) {
        FileWriter writer = null;
        BufferedWriter bw = null;
        try {
            writer = new FileWriter(path, true);
            bw = new BufferedWriter(writer);
            bw.append(" \n");
            bw.append(content);
        } catch (IOException e) {
            System.err.println("Can't write to file with path " + path);
        } finally {
            IOUtils.closeQuietly(bw);
            IOUtils.closeQuietly(writer);
        }
    }
}
