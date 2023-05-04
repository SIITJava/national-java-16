package ro.siit.session16;

import ro.siit.session15.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class UserManagement {
    public static void main(String[] args) throws SQLException {
        Connection connection = DBManagement.getConnection(args[0], args[1], args[2]);

        UserStore userStore = new UserStoreImpl(connection);

        String command;
        Scanner keyboard = new Scanner(System.in);
        do{
            System.out.println("C: add user");
            System.out.println("R: list users");
            System.out.println("U: update user");
            System.out.println("D: delete user");
            System.out.println("command?_");
            command = keyboard.nextLine();

            switch (command){
                case "C":
                    System.out.println("name?_");
                    String name = keyboard.nextLine();
                    System.out.println("phone?_");
                    String phone = keyboard.nextLine();
                    System.out.println("town?_");
                    String town = keyboard.nextLine();
                    User addedUser = new User(UUID.randomUUID(), name, phone, town);
                    userStore.addUser(addedUser);
                    break;
                case "R":
                    List<User> usersList = userStore.getUsers();
                    for (User user: usersList) {
                        System.out.println(user);
                    }
                    break;
                case "U":
                    System.out.println("id?_");
                    String updatedUserId = keyboard.nextLine();
                    System.out.println("town?_");
                    String updatedTown = keyboard.nextLine();
                    User updatedUser = userStore.findUserById(UUID.fromString(updatedUserId));
                    updatedUser.setTown(updatedTown);
                    userStore.updateUser(updatedUser.getId(), updatedUser);
                    break;
                case "D":
                    System.out.println("id?_");
                    String id = keyboard.nextLine();
                    userStore.deleteUser(UUID.fromString(id));
            }


        } while(!command.equalsIgnoreCase("x"));

//        User jonathan = new User(UUID.randomUUID(), "Jonathan Walles", "+44123123132", "Leeds");
//        // userStore.addUser(jonathan);
//
//        userStore.updateUser(UUID.fromString("035ba5b7-f44b-4087-80ca-049b5668634a"), new User(UUID.randomUUID(), "MArius Popescu", "0722321456", "Popesti Loerdeni"));
//
//        User mariusPopescu = userStore.findUserById(UUID.fromString("035ba5b7-f44b-4087-80ca-049b5668634a"));
//        mariusPopescu.setTown("Bucuresti");
//        mariusPopescu.setName("Marius Popescu");
//        userStore.updateUser(mariusPopescu.getId(), mariusPopescu);
//
//        List<User> usersList = userStore.getUsers();
//
//        for (User user: usersList) {
//            System.out.println(user);
//        }
//
//        // userStore.deleteUser(mariusPopescu.getId());
//
//        userStore.deleteUser(UUID.fromString("fb9bac48-58b7-4672-8d14-251677bc9ccb"));
//
//        usersList = userStore.getUsers();
//        for (User user: usersList) {
//            System.out.println(user);
//        }

    }


}
