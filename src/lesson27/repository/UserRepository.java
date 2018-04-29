package lesson27.repository;

import java.util.LinkedList;

public class UserRepository {
    private LinkedList<User> users = new LinkedList<>();


    public LinkedList<User> getUsers() {
        return users;
    }

    public User save(User user) throws Exception {
        if (user == null)
            throw new Exception("Object can't be null");

        if (findById(user.getId()) != null)
            throw new Exception("Such object have already created");

        users.add(user);

        return user;
    }


    public User update(User user) throws Exception {
        if (user == null)
            throw new Exception("Object can't be null");

        User curUser = findById(user.getId());
        if (curUser == null) {
            throw new Exception("Such object was not found");
        }
        users.set(users.indexOf(curUser), user);
        return user;
    }


    public void delete(long id) throws Exception {
        User user = findById(id);

        if (user == null)
            throw new Exception("Such object was not found");

        users.remove(user);
    }


    public User findById(long id) {
        int count = 0;
        for (User user : users) {
            if (id == user.getId()) {
                return users.get(count);
            }
            count++;
        }
        return null;
    }
}
