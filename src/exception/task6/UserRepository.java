package exception.task6;

import java.util.ArrayList;

/**
 * Пользователи должны храниться в классе UserRepository
 * структуру для хранения данных выберите самостоятельно, исходя из удобства и оптимальности использования
 * - - -
 * Классы репозитории должны не только хранить данные
 * Но и обеспечивать возможность удаления, добавления, изменения, получения данных
 * Вся логика связанная с сохр данных должна располагаться именно в репозиториях
 */
public class UserRepository {
    private ArrayList<User> users;

    UserRepository() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public User getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User getUserByName(String name) {
        for (User user : users) {
            //if (Objects.equals(user.getFullName(), name)) {
            if (user.getFullName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    public User getUserByPhone(String phone) {
        for (User user : users) {
            //if (Objects.equals(user.getPhoneNumber(), phone)) {
            if (user.getPhoneNumber().equals(phone)) {
                return user;
            }
        }
        return null;
    }

    public void removeUser(User user) {
        this.users.remove(user);
    }

}
