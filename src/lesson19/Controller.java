package lesson19;

public class Controller {

    protected File put(Storage storage, File file) throws Exception {
        checkNull(storage, file);       //проверка входящих налов

        checkLengthName(file);          // преверка длинны имени

        checkSize(storage, file);       // проверка размера хранилища куда добавляем файл

        checkFormat(storage, file);     // проверка добавляемого файла

        if (findFile(storage, file.getId()) != null)    // если нет null тогда бросаем ошибку
            throw new Exception("The file with id: " + file.getId() + " can't be added to storage with id: " + storage.getId() + ", because such Id was created");

        for (int i = 0; i < storage.getFiles().length; i++) {           //запись файла в хранилище
            if (storage.getFiles()[i] == null) {
                storage.getFiles()[i] = file;
                return storage.getFiles()[i];
            }
        }
        throw new Exception("The file Id " + file.getId() + " can't be added to storage Id " + storage.getId() + " because there is't free space");
    }



    protected void delete(Storage storage, File file) throws Exception {
        checkNull(storage, file);

        for (int i = 0; i < storage.getFiles().length; i++) {                                               //поиск нужного файла для удаления
            if (storage.getFiles()[i] != null && storage.getFiles()[i].equals(findFile(storage, file.getId()))) {
                storage.getFiles()[i] = null;
                return;
            }
        }
        throw new Exception("The file Id " + file.getId() + " can't be found");
    }

    protected File[] transferAll(Storage storageFrom, Storage storageTo) throws Exception {
        if (storageFrom == null)
            throw new NullPointerException("The storageFrom not detected");
        if (storageTo == null)
            throw new NullPointerException("The storageTo not detected");
        if (storageFrom.getId() == storageTo.getId())
            throw new Exception("you can't do it. The storageFrom id:" + storageFrom.getId() + " is the same as the storageTo id:" + storageTo.getId());
        long sizeFrom = 0;
        int countFrom = 0;
        for (int i = 0; i < storageFrom.getFiles().length; i++) {               // подсчет переносимых файлов и суммирование размера всех файлов
            if (storageFrom.getFiles()[i] != null) {
                countFrom++;
                sizeFrom += storageFrom.getFiles()[i].getSize();
            }
        }
        long sizeTo = 0;
        int countTo = 0;
        for (int i = 0; i < storageTo.getFiles().length; i++) {                 //подсчет доступных мест и суммирование размера существующих файлов
            if (storageTo.getFiles()[i] == null)
                countTo++;
            if (storageTo.getFiles()[i] != null)
                sizeTo += storageTo.getFiles()[i].getSize();
        }
        if (countFrom > countTo) {                                              // проверка необходимомого места для переноса файлов
            throw new Exception("The storage id:" + storageFrom.getId() + " can't be moved to the storage id:" + storageTo.getId() + " because there isn't enough space");
        }
        if (sizeFrom + sizeTo > storageTo.getStorageSize())
            throw new Exception("The storage id:" + storageFrom.getId() + " can't be moved to the storage id:" + storageTo.getId() + " because there isn't enough size in storage id:" + storageTo.getId());

        for (int i = 0; i <storageFrom.getFiles().length; i++) {                //трансфер всех файлов
            if (storageFrom.getFiles()[i] != null)
                put(storageTo, storageFrom.getFiles()[i]);
//            else
//                throw new Exception("There aren't files in storage id:" + storageFrom.getId());
        }
        return storageTo.getFiles();
    }

    protected File[] transferFile(Storage storageFrom, Storage storageTo, long id) throws Exception {
        if (storageFrom == null)
            throw new NullPointerException("The storageFrom not detected");
        if (storageTo == null)
            throw new NullPointerException("The storageTo not detected");
        if (findFile(storageFrom, id) == null)
            throw new Exception("The file with id:" + id + " not found in storage id:" + storageFrom.getId());
        if (storageFrom.getId() == storageTo.getId())
            throw new Exception("you can't do it. The storageFrom id:" + storageFrom.getId() + " is the same as the storageTo id:" + storageTo.getId());
        if (findFile(storageTo, id) != null)
            throw new Exception("The file id:" + id + " have already created in storage id:" + storageTo.getId());


        put(storageTo, findFile(storageFrom, id));

        return storageTo.getFiles();
    }

    //дополнительные методы

    private void checkNull(Storage storage, File file) {
        if (storage == null)
            throw new NullPointerException("The storage is not detected");
        if (file == null)
            throw new NullPointerException("The file is not detected");
    }

    private File findFile(Storage storage, long id) {
        for (File file1 : storage.getFiles()) {
            if (file1 != null && file1.getId() == (id))
                return file1;
        }
        return null;
    }

    private void checkFormat(Storage storage, File file) throws Exception {
        for (String storage1 : storage.getFormatsSupported()) {
            if (storage1.equals(file.getFormat()))
                return;
        }
        throw new Exception("The file with id: " + file.getId() + " can't be added to the storage with id: " + storage.getId() + ", because format of file is wrong");
    }

    private void checkLengthName(File file) throws Exception {
        if (file.getName().length() > 10)
            throw new Exception("The file id: " + file.getId() + " can't be added. The name of file is too long.");
    }

    private void checkSize(Storage storage, File file) throws Exception {
        long res = 0;
        for (int i = 0; i < storage.getFiles().length; i++) {
            if (storage.getFiles()[i] != null)
                res += storage.getFiles()[i].getSize();
        }
        if (storage.getStorageSize() - res < file.getSize())
            throw new Exception("The file with id: " + file.getId() + " can't be added to the storage with id: " + storage.getId() + ", because there is't enough space");
    }
}
