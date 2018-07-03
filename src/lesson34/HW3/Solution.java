package lesson34.HW3;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Solution {

    public void copyFileContent(String fileFromPath, String fileToPath) throws Exception {
        validate(fileFromPath, fileToPath);

        File fileFrom = new File(fileFromPath);
        File fileTo = new File(fileToPath);

        try {
            Files.copy(fileFrom.toPath(), fileTo.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            throw new Exception("Copying file was wrong");
        }
    }

    public void copyFileContentApacheIO(String fileFromPath, String fileToPath) throws Exception {
        validate(fileFromPath, fileToPath);

        File fileFrom = new File(fileFromPath);
        File fileTo = new File(fileToPath);

        try {
            FileUtils.copyFile(fileFrom, fileTo);
        } catch (Exception e) {
            throw new Exception("Copying file was wrong");
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
            throw new Exception("File " + fileTo + " does not have permission to be read");
        }
    }
}