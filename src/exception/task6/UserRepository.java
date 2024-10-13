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
public class UserRepository implements RepositoryOperation <User> {
    private HashMap<Integer, User> mapUsers;

    UserRepository() {
        mapUsers = new HashMap<>();
    }

    /*public void addUser(User user) {
        mapUsers.put(user.getId(), user);
    }

    public User getUserById(int id) {
        return mapUsers.get(id);
    }

    public void removeUser(Integer id) {
        mapUsers.remove(id);
    }*/

    @Override
    public void add(User user) {
        mapUsers.put(user.getId(), user);
    }

    @Override
    public User getById(int id) {
        return mapUsers.get(id);
    }

    @Override
    public void remove(User object) {
        mapUsers.remove(object.getId());
    }

    @Override
    public void remove(int id) {
        mapUsers.remove(id);
    }

}
