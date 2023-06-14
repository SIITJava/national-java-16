package ro.siit.session24;

import java.util.StringJoiner;

public class ComparableEntity {
    private int p1;
    private String p2;

    public ComparableEntity(int p1, String p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String getP2() {
        return p2;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ComparableEntity.class.getSimpleName() + "[", "]")
                .add("p1=" + p1)
                .add("p2='" + p2 + "'")
                .toString();
    }
}
