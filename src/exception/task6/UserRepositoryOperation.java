package exception.task6;

public interface UserRepositoryOperation {

    void addUser(User user);

    User getUserById(int id);

    void removeUser(Integer id);

}
