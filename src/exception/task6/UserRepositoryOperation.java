package exception.task6;

import java.util.HashMap;

public interface UserRepositoryOperation {

    void addUser(User user);

    User getUserById(int id);

    void removeUser(Integer id);

}
