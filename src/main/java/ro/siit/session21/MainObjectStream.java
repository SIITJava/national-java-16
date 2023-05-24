package ro.siit.session21;

import java.io.*;
import java.util.StringJoiner;

public class MainObjectStream {
    public static void main(String[] args) throws Exception {
//         writeOBj();
         readObj();
    }

    public static void writeOBj() throws IOException {
        ObjectOutputStream out  = new ObjectOutputStream(new FileOutputStream("src/main/resources/entity.dat"));
        out.writeObject(new Entity("filip", "filip123"));
    }

    public static void readObj() throws IOException, ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/resources/entity.dat"));
        Entity myUserInfo = (Entity)in.readObject();
        System.out.println(myUserInfo);
    }
}

class Entity implements Serializable {
    private static final long serialVersionUID = 2L;
    private String username;
    private transient String password;

    public Entity(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Entity.class.getSimpleName() + "[", "]")
                .add("username='" + username + "'")
                .add("password='" + password + "'")
                .toString();
    }
}
