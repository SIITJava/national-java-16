package ro.siit.session16;

import ro.siit.session15.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserStoreImpl implements UserStore{
    private Connection dbConnection;

    public UserStoreImpl(Connection connection){
        this.dbConnection = connection;
    }
    @Override
    public void addUser(User user) throws SQLException {
        String insertStatement = "INSERT INTO users VALUES (?, ?, ?, ?)";
        PreparedStatement createUserStatement = dbConnection.prepareStatement(insertStatement);
        createUserStatement.setObject(1, user.getId());
        createUserStatement.setString(2, user.getName());
        createUserStatement.setString(3, user.getPhone());
        createUserStatement.setString(4, user.getTown());
        createUserStatement.executeUpdate();
    }

    @Override
    public List<User> getUsers() throws SQLException {
        Statement getUsersStatement = dbConnection.createStatement();
        ResultSet usersResultSet = getUsersStatement.executeQuery("SELECT * from users");
        List<User> usersList = new ArrayList<>();
        while(usersResultSet.next()){
            UUID userId = UUID.fromString(usersResultSet.getObject("id").toString());
            String userName = usersResultSet.getString(2);
            String userPhone = usersResultSet.getString("phone");// getString(3)
            String userTown = usersResultSet.getString(4);

            usersList.add(new User(userId,userName, userPhone, userTown));
        }
        return usersList;
    }


    @Override
    public void updateUser(UUID id, User user) throws SQLException {
        String updateStatement = "UPDATE users SET name = ?, phone = ?, town = ? WHERE id = ?";
        PreparedStatement updateUserStatement = dbConnection.prepareStatement(updateStatement);
        updateUserStatement.setString(1, user.getName());
        updateUserStatement.setString(2, user.getPhone());
        updateUserStatement.setString(3, user.getTown());
        updateUserStatement.setObject(4, id);
        updateUserStatement.executeUpdate();
    }

    @Override
    public void deleteUser(UUID id) throws SQLException {
        PreparedStatement deleteUserStatement = dbConnection.prepareStatement("DELETE from users WHERE id = ?");
        deleteUserStatement.setObject(1, id);
        deleteUserStatement.executeUpdate();
    }

    @Override
    public User findUserById(UUID id) throws SQLException {
        PreparedStatement findUserByIdStatement = dbConnection.prepareStatement("SELECT * from users WHERE id = ?");
        findUserByIdStatement.setObject(1, id);
        ResultSet userResultSet = findUserByIdStatement.executeQuery();
        userResultSet.next();
        UUID userId = UUID.fromString(userResultSet.getObject("id").toString());
        String userName = userResultSet.getString(2);
        String userPhone = userResultSet.getString("phone");// getString(3)
        String userTown = userResultSet.getString(4);

        return new User(userId,userName, userPhone, userTown);
    }
}
