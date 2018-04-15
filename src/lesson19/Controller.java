package lesson19;

public class Controller {
    protected Validate validate = new Validate();


    protected File put(Storage storage, File file) throws Exception {

        validate.checkFiles(storage, file);

        for (int i = 0; i < storage.getFiles().length; i++) {           //запись файла в хранилище
            if (storage.getFiles()[i] == null) {
                storage.getFiles()[i] = file;
                return storage.getFiles()[i];
            }
        }
        throw new Exception("The file Id " + file.getId() + " can't be added to storage Id " + storage.getId() + " because there is't free space");
    }


    protected void delete(Storage storage, File file) throws Exception {

        for (int i = 0; i < storage.getFiles().length; i++) {                                               //поиск нужного файла для удаления
            if (storage.getFiles()[i] != null && storage.getFiles()[i].equals(validate.findFile(storage, file.getId()))) {
                storage.getFiles()[i] = null;
                return;
            }
        }
        throw new Exception("The file Id " + file.getId() + " can't be found");
    }


    protected File[] transferAll(Storage storageFrom, Storage storageTo) throws Exception {

        validate.checkStorageSize(storageFrom, storageTo);

        for (int i = 0; i < storageFrom.getFiles().length; i++) {                //трансфер всех файлов
            if (storageFrom.getFiles()[i] != null)
                put(storageTo, storageFrom.getFiles()[i]);
        }
        return storageTo.getFiles();
    }

    protected File[] transferFile(Storage storageFrom, Storage storageTo, long id) throws Exception {

        validate.checkFileInStorage(storageFrom, storageTo, id);

        put(storageTo, validate.findFile(storageFrom, id));

        return storageTo.getFiles();
    }
}
