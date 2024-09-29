package exception.task6;

import java.util.HashMap;

/**
 * Пользователи должны храниться в классе UserRepository
 * структуру для хранения данных выберите самостоятельно, исходя из удобства и оптимальности использования
 * - - -
 * Классы репозитории должны не только хранить данные
 * Но и обеспечивать возможность удаления, добавления, изменения, получения данных
 * Вся логика связанная с сохр данных должна располагаться именно в репозиториях
 */
public class UserRepository implements UserRepositoryOperation {
    private HashMap<Integer, User> mapUsers;

    UserRepository() {
        mapUsers = new HashMap<>();
    }

    public void addUser(User user) {
        mapUsers.put(user.getId(), user);
    }

    public User getUserById(int id) {
        return mapUsers.get(id);
    }

    //TODO: могут быть совпадения имен, учесть, пока закомментирую getUserByName(String name)
    /*public User getUserByName(String name) {
        for (User user : users) {
            //if (Objects.equals(user.getFullName(), name)) {
            if (user.getFullName().equals(name)) {
                return user;
            }
        }
        return null;
    }*/

    //TODO: подумать как можно реализовать getUserByPhone(String phone)
    /*public User getUserByPhone(String phone) {
        for (User user : users) {
            //if (Objects.equals(user.getPhoneNumber(), phone)) {
            if (user.getPhoneNumber().equals(phone)) {
                return user;
            }
        }
        return null;
    }*/

    public void removeUser(Integer id) {
        mapUsers.remove(id);
    }

}
