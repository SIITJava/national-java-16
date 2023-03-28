package ro.siit.session7.polimorphism;

public class MyClass {
    public void method(Integer number){
        System.out.println("The number is " + number);
    }

    public void method(String word){
        System.out.println("The word is " + word);
    }

//    public void method(Integer otherNumber){
//        System.out.println("The number is " + otherNumber);
//    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.method(2);
        myClass.method("Ion");
    }
}
