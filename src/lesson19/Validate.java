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


    // проверка файлов на формат,
    protected void checkFormat(Storage storage, File file) throws Exception {

        for (String storage1 : storage.getFormatsSupported()) {
            if (storage1.equals(file.getFormat()))
                return;
        }
        throw new Exception("The file with id: " + file.getId() + " can't be added to the storage with id: " + storage.getId() + " because format of file is wrong");
    }


    //    достуность свободного места
    protected void checkPlace(Storage storage, File file) throws Exception {

        if (findFile(storage, file.getId()) != null || storage.getStorageSize() - getFilesSize(storage) < file.getSize())
            throw new Exception("The file with id: " + file.getId() + " can't be added to the storage with id: " + storage.getId() + " there isn't enough place");
    }


    // подсчет переносимых файлов
    // подсчет доступных мест
    protected void checkStorageSize(Storage storageFrom, Storage storageTo) throws Exception {
        int countFrom = 0;
        for (File file : storageFrom.getFiles()) {
            if (file != null)
                countFrom++;
        }

        int countTo = 0;
        for (File file : storageTo.getFiles()) {
            if (file == null)
                countTo++;
        }
        if (countFrom > countTo || getFilesSize(storageFrom) + getFilesSize(storageTo) > storageTo.getStorageSize()) {                                              // проверка необходимомого места для переноса файлов
            throw new Exception("The storage id:" + storageFrom.getId() + " can't be moved to the storage id:" + storageTo.getId() + " because there isn't enough space");
        }
    }


    // получить размер файлов в хранилище
    private int getFilesSize(Storage storage) {
        int res = 0;
        for (File file : storage.getFiles()) {
            if (file != null)
                res += file.getSize();
        }
        return res;
    }
}
