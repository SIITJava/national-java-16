package ro.siit.session17.mtq;

public abstract class Shape {
    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
