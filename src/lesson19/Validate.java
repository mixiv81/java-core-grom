package lesson19;

public class Validate {

    //поиск файла по Id в хранилище
    protected File findFile(Storage storage, long id) {
        for (File file1 : storage.getFiles()) {
            if (file1 != null && file1.getId() == (id))
                return file1;
        }
        return null;
    }

    //проверка Id в хранилищах
    protected void checkFileInStorage(Storage storageFrom, Storage storageTo, long id) throws Exception {

        if (findFile(storageFrom, id) == null || findFile(storageTo, id) != null)
            throw new Exception("The file with id:" + id + " can not be added to storage id:" + storageTo.getId());
    }


    // проверка файлов на формат, достуность свободного места
    protected void checkFiles(Storage storage, File file) throws Exception {

        for (String storage1 : storage.getFormatsSupported()) {
            if (storage1.equals(file.getFormat()) && storage.getStorageSize() - getFilesSize(storage) > file.getSize()
                    && findFile(storage, file.getId()) == null)
                return;
        }
        throw new Exception("The file with id: " + file.getId() + " can't be added to the storage with id: " + storage.getId());
    }


    // подсчет переносимых файлов
    // подсчет доступных мест
    protected void checkStorageSize(Storage storageFrom, Storage storageTo) throws Exception {
        int countFrom = 0;
        for (int i = 0; i < storageFrom.getFiles().length; i++) {
            if (storageFrom.getFiles()[i] != null) {
                countFrom++;
            }
        }
        int countTo = 0;
        for (int i = 0; i < storageTo.getFiles().length; i++) {
            if (storageTo.getFiles()[i] == null)
                countTo++;
        }
        if (countFrom > countTo || getFilesSize(storageFrom) + getFilesSize(storageTo) > storageTo.getStorageSize()) {                                              // проверка необходимомого места для переноса файлов
            throw new Exception("The storage id:" + storageFrom.getId() + " can't be moved to the storage id:" + storageTo.getId() + " because there isn't enough space");
        }
    }


    // получить размер файлов в хранилище
    private int getFilesSize(Storage storage) throws Exception {
        int res = 0;
        for (int i = 0; i < storage.getFiles().length; i++) {
            if (storage.getFiles()[i] != null)
                res += storage.getFiles()[i].getSize();
        }
        return res;
    }
}
