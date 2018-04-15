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

        if (findFile(storageFrom, id) == null)
            throw new Exception("The file with id:" + id + " not found in storage id:" + storageFrom.getId());

        if (findFile(storageTo, id) != null)
            throw new Exception("The file with id:" + id + " have already created in storage id:" + storageTo.getId());
    }

    // проверка файлов на длинну имени, формат, достуность свободного места
    protected void checkFiles(Storage storage, File file) throws Exception {
        if (file.getName().length() > 10)
            throw new Exception("The file id: " + file.getId() + " can't be added. The name of file is too long.");

        if (storage.getStorageSize() - getFilesSize(storage) < file.getSize())
            throw new Exception("The file with id: " + file.getId() + " can't be added to the storage with id: " + storage.getId() + ", because there is't enough space");

        if (findFile(storage, file.getId()) != null)    // если нет null тогда бросаем ошибку
            throw new Exception("The file with id: " + file.getId() + " can't be added to storage with id: " + storage.getId() + ", because such Id was created");

        for (String storage1 : storage.getFormatsSupported()) {
            if (storage1.equals(file.getFormat()))
                return;
        }
        throw new Exception("The file with id: " + file.getId() + " can't be added to the storage with id: " + storage.getId() + ", because format of file is wrong");
    }

    // подсчет переносимых файлов
    // подсчет доступных мест
    protected void countFiles(Storage storageFrom, Storage storageTo) throws Exception {
        int countFrom = 0;
        for (int i = 0; i < storageFrom.getFiles().length; i++) {
            if (storageFrom.getFiles()[i] != null) {
                countFrom++;
            }
        }
        int countTo = 0;
        for (int i = 0; i < storageTo.getFiles().length; i++) {                 //подсчет доступных мест
            if (storageTo.getFiles()[i] == null)
                countTo++;
        }
        if (countFrom > countTo) {                                              // проверка необходимомого места для переноса файлов
            throw new Exception("The storage id:" + storageFrom.getId() + " can't be moved to the storage id:" + storageTo.getId() + " because there isn't enough space");
        }
    }

    // проверка исходящего и принимающего хранилищ
    protected void checkStorage(Storage storageFrom, Storage storageTo) throws Exception {
        if (storageFrom.getId() == storageTo.getId())
            throw new Exception("you can't do it. The storageFrom id:" + storageFrom.getId() + " is the same as the storageTo id:" + storageTo.getId());

        if (getFilesSize(storageFrom) + getFilesSize(storageTo) > storageTo.getStorageSize())
            throw new Exception("The storage id:" + storageFrom.getId() + " can't be moved to the storage id:" + storageTo.getId() + " because there isn't enough size in storage id:" + storageTo.getId());
    }

    // получаем размер файлов в хранилище
    private long getFilesSize(Storage storage) throws Exception {
        long res = 0;
        for (int i = 0; i < storage.getFiles().length; i++) {
            if (storage.getFiles()[i] != null)
                res += storage.getFiles()[i].getSize();
        }
        return res;
    }
}
