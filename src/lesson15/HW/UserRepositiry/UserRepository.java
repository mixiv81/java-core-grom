package lesson15.HW.UserRepositiry;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    private int countArrInd() {
        int count = 0;
        for (User user : users) {
            if (user != null)
                count++;
        }
        return count;
    }

    public String[] getUserNames() {
        String[] arrName = new String[countArrInd()];
        for (int i = 0; i < countArrInd(); i++) {
            if (users[i] != null)
                arrName[i] = users[i].getName();
        }
        return arrName;
    }

    public long[] getUserIds() {
        long[] arrId = new long[countArrInd()];
        for (int i = 0; i < countArrInd(); i++) {
            if (users[i] != null)
                arrId[i] = users[i].getId();
        }
        return arrId;
    }

    public String getUserNameById(long id) {
        String name = null;
        if (users != null)
            for (int i = 0; i < countArrInd(); i++) {
                if (users[i] != null && users[i].getId() == id)
                    name = users[i].getName();
            }
        return name;
    }

    public User getUserByName(String name) {
        if (users != null)
            for (int i = 0; i < countArrInd(); i++) {
                if (users[i] != null && users[i].getName().equals(name))
                    return users[i];
            }
        return null;
    }

    public User getUserById(long id) {
        if (users != null)
            for (int i = 0; i < countArrInd(); i++) {
                if (users[i] != null && users[i].getId() == id)
                    return users[i];
            }
        return null;
    }

    public User getUserBySessionId(String sessionId) {
        if (users != null)
            for (int i = 0; i < countArrInd(); i++) {
                if (users[i] != null && users[i].getSessionId().equals(sessionId))
                    return users[i];
            }
        return null;
    }

    public User findById(long id) {
        if (users != null)
            for (int i = 0; i < countArrInd(); i++) {
                if (users[i] != null && users[i].getId() == id )
                    return users[i];
            }
        return null;
    }

    public User save(User user) {
        if (user != null && findById(user.getId()) == null) {
            for (int i = 0; i < users.length; i++) {
                if (users[i] == null) {
                    users[i] = user;
                    return users[i];
                }
            }
        }
        return null;
    }

    public User update(User user) {
        if (user != null && findById(user.getId()) != null) {
            for (int i = 0; i < users.length; i++) {
                if (users[i].getId() == user.getId()) {
                    users[i] = user;
                    return users[i];
                }
            }
        }
        return null;
    }

    public void delete(long id) {
        if (users != null) {
            User user = findById(id);
            for (int i = 0; i < users.length; i++) {
                if (users[i] == user) {
                    users[i] = null;
                }
            }
        }
    }
}