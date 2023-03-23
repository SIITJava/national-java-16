package ro.siit.session6.pack1;

public class ClassPackage {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        // System.out.println(parentClass.privateProp);
        System.out.println(parentClass.packageProp);
        System.out.println(parentClass.protectedProp);
        System.out.println(parentClass.publicProp);
    }
}
