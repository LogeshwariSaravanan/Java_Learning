package oops;
/*
methods are declared within a class  and that they are used to perform certain actions
To call a method, write the method's name followed by two parentheses () and a semicolon;
methods are called inside the main method.

Static vs Public
    *Java programs that have either static or public attributes and methods.
    *Static method can be accessed without creating an object of the class
    *whereas public class which can be accessed only by objects.
 */
public class _2_ClassMethods {
    static void staticMethod() {//static method
        System.out.println("This is static method. Static methods can be called without creating objects");
    }
    public void publicMethod(){//public method
            System.out.println("This is Public method. Public methods must be called by creating objects");
        }

    public static void main(String[] args) {
        staticMethod();//call the static method
        _2_ClassMethods myObj = new _2_ClassMethods();//create an object for main
        myObj.publicMethod();//call the public method by object

    }
    }

