package lesson25.hw;

import java.util.Arrays;

public class GeneralDAO<T> {
    @SuppressWarnings("unchecked")
    private T[] types = (T[]) new Object[10];

    public GeneralDAO() {
    }

    public T save(T t) throws Exception {
        validate(t);

        int index = 0;
        for (T t1 : types) {
            if (t1 == null) {
                types[index] = t;
                return types[index];
            }
            index++;
        }
        throw new Exception("There isn't free space.  can't be saved");
    }


    public T[] getAll() throws Exception {
        int count = 0;
        for (T tl : types) {
            if (tl != null) {
                count++;
            }
        }
        if (count == 0)
            throw new Exception("Array is empty");

        @SuppressWarnings("unchecked")
        T[] res = (T[]) new Object[count];

        int index = 0;
        for (T tl : types) {
            if (tl != null) {
                res[index] = tl;
            }
            index++;
        }
        return res;
    }


    private boolean validate(T t) throws Exception {
        if (t == null)
            throw new Exception("Object is null");
        for (T tl : types) {
            if (tl != null && tl.equals(t))
                throw new Exception(t + "Such object already exists");
        }
        return true;
    }
}
