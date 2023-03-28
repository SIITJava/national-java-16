package ro.siit.session7.constructorChaining;

public class ClassC extends ClassA{
    public ClassC(){
        System.out.println("ClassC");
    }

    @Override
    public void method() {
        System.out.println("Method C");
    }

    public void otherMethod(){
        super.method();
    }

    public final void noOverrideMethod(){
        System.out.println("Can't be overriden!");
    }
}
