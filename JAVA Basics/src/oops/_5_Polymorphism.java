package oops;
/*
polymorphism  -->a single action in  many forms

types of polymorphism
    *Compile-time polymorphism (static polymorphism) --> achieved by method overloading
    *runtime polymorphism (dynamic polymorphism)     --> Achieved by method overriding

COMPILE-TIME POLYMORPHISM
    *Achieved by method overloading .
    *When there are multiple methods with the same name but different parameters then these methods are said to be overloaded.
     methods can be overloaded by change in the number of arguments or/and a change in the type of arguments

RUN-TIME POLYMORPHISM
    *Achieved by method overridding.
    *Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already
     provided by one of its super-classes or parent classes.When a method in a subclass has the same name, same parameters or signature,
     and same return type(or sub-type) as a method in its super-class,
     then the method in the subclass is said to override the method in the super-class.
     The version of a method that is executed will be determined by the object that is used to invoke it.
     If an object of a parent class is used to invoke the method, then the version in the parent class will be executed,
     but if an object of the subclass is used to invoke the method, then the version in the child class will be executed.
     In other words, it is the type of the object being referred to (not the type of the reference variable)
     that determines which version of an overridden method will be executed.

 */

//method overriding example
class Parent{//base class
    void show(){
        System.out.println("parent's show");
    }
    void name(){
        System.out.println("Logi");
    }

public static class _5_Polymorphism extends Parent {//inherited class
    void show(){//this method overrides show() of parent
        System.out.println("Child's show");
    }
}
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.show();
        Parent obj1 = new _5_Polymorphism();
        obj1.show();

    }
}




