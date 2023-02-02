package oops;
/*
Inheritance --> In java it is possible to inherit attributes and methods from one class to another.

categories of inheritance concept
    *subclass(child) --> the class that inherits from another class
    *superclass(parent) --> the class being inherited from

to inherit from a class , we have to use extends keyword


note:If you don't want other classes to inherit from a class, use the final keyword
 */

public class Inherits {
    public String brand="Suzuki";

    public void honk(){
        System.out.println("tuut tuut");
    }
}
class TwoWheeler extends Inherits{
    private String modelName="Access 125";

    public static void main(String[] args) {
        TwoWheeler myObj =new TwoWheeler();
        myObj.honk();
        System.out.println(myObj.brand+" "+myObj.modelName);

    }
}

/*
Why And When To Use "Inheritance"?
    *It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
 */