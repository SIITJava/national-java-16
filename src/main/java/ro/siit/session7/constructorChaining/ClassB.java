package ro.siit.session7.constructorChaining;

public class ClassB  extends ClassA {
    final String propB; // = "B";
    public ClassB(String propB){
        // super();
        this.propB = propB;
        System.out.println("ClassB");
    }

    public String getPropB() {
        return this.propB;
    }

//    public void setPropB(String propB){
//        this.propB = propB;
//    }
}
