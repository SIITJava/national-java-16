package ro.siit.session6.pack1;

public class ParentClass {
    private String privateProp = "PRIVATE";
    String packageProp = "PACKAGE";
    protected String protectedProp = "PROTECTED";
    public String publicProp = "PUBLIC";

    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        System.out.println(parentClass.privateProp);
        System.out.println(parentClass.packageProp);
        System.out.println(parentClass.protectedProp);
        System.out.println(parentClass.publicProp);
    }
}
