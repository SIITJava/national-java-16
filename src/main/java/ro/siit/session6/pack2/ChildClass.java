package ro.siit.session6.pack2;

import ro.siit.session6.pack1.ParentClass;

public class ChildClass extends ParentClass{
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        ChildClass childClass = new ChildClass();
        // System.out.println(parentClass.privateProp);
        // System.out.println(parentClass.packageProp);
        // System.out.println(parentClass.protectedProp);
        System.out.println(childClass.protectedProp);
        System.out.println(parentClass.publicProp);
    }
}
