package ro.siit.session7.constructorChaining;

public class Main {
    public static void main(String[] args) {
        // ClassA a = new ClassA();
        // ClassB b = new ClassB();

        // ClassD d = new ClassD();

        ClassA obj = new ClassC();

//        ClassB objB = (ClassB) obj;
//
//        obj = new ClassD();

        obj.method();
        ((ClassC)obj).otherMethod();

        ClassB objB = new ClassB("ppB");

        ClassE objE = new ClassE();
        objE.noOverrideMethod();

        ClassC castObjC = new ClassC();

        ClassA objA = castObjC;

        ClassA otherObjectOfClassA = new ClassC();

        ClassB objOfClassB = (ClassB) otherObjectOfClassA;

        ClassA objectofTypeD = new ClassD();
        ClassC downCastC = (ClassC)objectofTypeD;

    }
}
