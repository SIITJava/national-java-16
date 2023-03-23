package ro.siit.session6;

public class Person {
    private static Person p1;
    String cnp;
    private int age = 25;
    private double height;
    private Boolean isMarried;

    Person(String cnp){
        super();
        if(cnp.length() != 13) {
            System.out.println("Invalid CNP");
        } else {
            this.cnp = cnp;
        }
    }

    Person(){
        this("999888777");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("cnp='").append(cnp).append('\'');
        sb.append(", age=").append(age);
        sb.append(", height=").append(height);
        sb.append(", isMarried=").append(isMarried);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Person filipCuPeruca = new Person("1111111111111");
        System.out.println(filipCuPeruca);

        Person filipFaraPeruca = new Person("1111111111111");
        System.out.println(filipFaraPeruca);

        System.out.println(filipCuPeruca.equals(filipFaraPeruca));

        Person p1 = new Person();
        System.out.println(p1);

        p1 = new Person("4352365315313");
        System.out.println(p1);

        while(true){
            new Person();
        }
    }
}
