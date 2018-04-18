package lesson22.repository;

public class UserRepository {

    private static User[] users = new User[10];

    public static User[] getUsers() {
        return users;
    }

    public static User save(User user) {
        if (user == null)
            return null;

        if (findById(user.getId()) != null)
            return null;

        int countPlaced = 0;
        for (User us : users) {
            if (us != null)
                countPlaced++;
        }

        if (countPlaced > 9)
            return null;

        int index = 0;
        for (User us : users) {
            if (us == null) {
                users[index] = user;
                break;
            }
            index++;
        }
        return user;
    }

    public static User update(User user) {
        if (user == null)
            return null;
        User curUser = findById(user.getId());
        if (curUser == null) {
            return null;
        }
        long curUserId = curUser.getId();

        int index = 0;
        for (User us : users) {
            if (us != null && us.getId() == curUserId)
                users[index] = user;
            break;
        }
        index++;
        return user;
    }

    public static void delete(long id) {
        User user = findById(id);

        if (user == null)
            return;

        int index = 0;
        for (User us : users) {
            if (us.getId() == user.getId()) {
                users[index] = null;
                break;
            }
            index++;
        }
    }

    public static User findById(long id) {
        for (User user : users) {
            if (user != null && id == user.getId())
                return user;
        }
        return null;
    }
}
