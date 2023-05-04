package ro.siit.session16;

import ro.siit.session15.User;

import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

public interface UserStore {
    void addUser(User user) throws SQLException;
    List<User> getUsers() throws SQLException;
    void updateUser(UUID id, User user) throws SQLException;
    void deleteUser(UUID id) throws SQLException;

    User findUserById(UUID id) throws SQLException;
}
