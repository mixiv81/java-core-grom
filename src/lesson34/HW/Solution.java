package lesson34.HW;

import java.io.*;

public class Solution {
    public void transferFileContent(String fileFromPath, String fileToPath) throws Exception {

        validate(fileFromPath, fileToPath);

        writeToFile(fileToPath, readFromFile(fileFromPath));

        cleanFile(fileFromPath);

    }

    private StringBuffer readFromFile(String path) throws IOException {
        StringBuffer res = new StringBuffer();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                res.append(line);
                res.append("\n");
            }
            res.replace(res.length() - 1, res.length(), "");
        } catch (IOException e) {
            throw new IOException("Read from file " + path + " failed");
        }
        return res;
    }

    private void writeToFile(String path, StringBuffer contentToWrite) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            bufferedWriter.append(contentToWrite);
        } catch (IOException e) {
            throw new IOException("Write to file " + path + " failed");
        }
    }


    private void validate(String fileFromPath, String fileToPath) throws Exception {
        File fileFrom = new File(fileFromPath);
        File fileTo = new File(fileToPath);

        if (!fileFrom.exists()) {
            throw new FileNotFoundException("File  " + fileFromPath + " does not exist");
        }

        if (!fileTo.exists()) {
            throw new FileNotFoundException("File  " + fileTo + " does not exist");
        }

        if (!fileFrom.canRead()) {
            throw new Exception("File  " + fileFromPath + " does not have permission to be read");
        }

        if (!fileTo.canWrite()) {
            throw new Exception("File  " + fileTo + " does not have permission to be read");
        }
    }

    private void cleanFile(String fileFrom) throws IOException {
        try (PrintWriter writer = new PrintWriter(fileFrom)) {
            writer.print("");
        } catch (IOException e) {
            throw new IOException("File " + fileFrom + " can't be clean");
        }
    }
}

