package ro.siit.session10;

import java.util.Objects;

public class Contact {
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name + "(" + this.hashCode() + ")";
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return name.equalsIgnoreCase(contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.toUpperCase());
    }
}
