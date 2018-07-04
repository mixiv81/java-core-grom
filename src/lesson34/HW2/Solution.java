package lesson34.HW2;

import java.io.*;


public class Solution {
    public void transferSentences(String fileFromPath, String fileToPath, String word) throws Exception {
        StringBuffer res = new StringBuffer();

        validate(fileFromPath, fileToPath);

        String textFromFile = readFromFile(fileFromPath).toString();
        String[] arrText = textFromFile.split("\\.");

        for (String sentence : arrText) {
            if (validateLength(sentence) && sentence.contains(word)) {
                res.append(sentence).append(". ");
                textFromFile = textFromFile.replace(sentence + ".", "");
            }
        }

        writeWithBackup(fileFromPath, fileToPath, res, textFromFile);

    }

    private void writeWithBackup(String fileFromPath, String fileToPath, StringBuffer sentencesToFile, String sentencesFromFile) throws Exception {
        StringBuffer backupTo = null;
        StringBuffer backupFrom = readFromFile(fileFromPath);

        if (fileToPath.isEmpty()) {
            backupTo = readFromFile(fileToPath);
        }

        try {
            writeToFile(fileToPath, sentencesToFile, true);
            writeToFile(fileFromPath, new StringBuffer(sentencesFromFile), false);
        } catch (Exception e) {
            writeToFile(fileFromPath, backupFrom, false);
            writeToFile(fileToPath, backupTo, false);
            throw new Exception("Transfer was wrong");
        }
    }

    private boolean validateLength(String input) {
        String[] arr = input.trim().split(" ");
        for (String str : arr) {
            if (str == null || arr.length < 10)
                return false;
        }
        return true;
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
            throw new IOException("Read from file  " + path + " failed");
        }
        return res;
    }

    private void writeToFile(String path, StringBuffer contentToWrite, boolean bl) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, bl))) {
            bufferedWriter.append(contentToWrite);
        } catch (IOException e) {
            throw new IOException("Write to file  " + path + " failed");
        }
    }


    private void validate(String fileFromPath, String fileToPath) throws Exception {
        File fileFrom = new File(fileFromPath);
        File fileTo = new File(fileToPath);

        if (!fileFrom.exists()) {
            throw new FileNotFoundException("File " + fileFromPath + " does not exist");
        }

        if (!fileTo.exists()) {
            throw new FileNotFoundException("File " + fileTo + " does not exist");
        }

        if (!fileFrom.canRead()) {
            throw new Exception("File " + fileFromPath + " does not have permission to be read");
        }

        if (!fileTo.canWrite()) {
            throw new Exception("File  " + fileTo + " does not have permission to be read");
        }
    }
}

