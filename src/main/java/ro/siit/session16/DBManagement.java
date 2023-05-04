package ro.siit.session16;

import ro.siit.session15.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DBManagement {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/national16";
        String username = "postgres";
        String password = "postgres";

        // 1. load driver + get connection
        Connection dbConnection = getConnection(url, username, password);

        // 2. Create a statement
        Statement getUsersStatement = dbConnection.createStatement();

        // 3. Execute query
        ResultSet usersResultSet = getUsersStatement.executeQuery("SELECT * from users");

        // 4. process result set
        List<User> usersList = new ArrayList<>();
        while(usersResultSet.next()){
            UUID userId = UUID.fromString(usersResultSet.getObject("id").toString());
            String userName = usersResultSet.getString(2);
            String userPhone = usersResultSet.getString("phone");// getString(3)
            String userTown = usersResultSet.getString(4);

            usersList.add(new User(userId,userName, userPhone, userTown));
        }

        for (User user: usersList) {
            System.out.println(user);
        }


        // 5. close connection
        dbConnection.close();
    }

    public static Connection getConnection(String url, String username, String password){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    private static void loadDBDriver(){

    }
}
