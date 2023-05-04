package ro.siit.session15;

import java.util.StringJoiner;
import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String phone;
    private String town;

    public User(UUID id, String name, String phone, String town) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.town = town;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return new StringJoiner("|")
                .add(id.toString())
                .add(name )
                .add(phone)
                .add(town)
                .toString();
    }
}
