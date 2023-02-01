package oops;
/*
oop --> object oriented programming language

Everything in java is associated with classes and object,along with its attributes and methods.

class is a template or blueprint for object and an object is an instance of a class
When the individual objects are created, they inherit all the variables and methods from the class.

 How to create Class?
     *use the keyword class:
     *class should always start with an uppercase first letter, and that the name of the java file should match the class name.
 */
public class _1_ClassAndObject {
    int x=5;//attribute of the class  or fields or instance variable
    final int y=10;//If you don't want the ability to override existing values, declare the attribute as final:
/*
You can access attributes by creating an object of the class, and by using the dot syntax (.):
an object is created from a class. We have already created the class named _1_ClassAndObject , so now we can use this to create objects.
To create an object of _1_ClassAndObject, specify the class name, followed by the object name, and use the keyword new:
 */
    public static void main(String[] args) {
        _1_ClassAndObject myObj=new _1_ClassAndObject();
        System.out.println("myObj value of x :"+myObj.x);
        System.out.println("myObj value of y :"+myObj.y);

        //You can create multiple objects of one class
        _1_ClassAndObject myObj1=new _1_ClassAndObject();
        System.out.println(myObj1.x);

        //modify Attributes
        System.out.println("MODIFY ATTRIBUTES");
        _1_ClassAndObject myObj2=new _1_ClassAndObject();
        myObj2.x=10;
        System.out.println(myObj2.x);
        //If you don't want the ability to override existing values, declare the attribute as final:
    }
/*
we can also create an object of a class and access it in another class.
 (one class has all the attributes and methods, while the other class holds the main() method (code to be executed)).
 Remember that the name of the java file should match the class name.
 */

}

/*
IMPORTANT NOTES:
    *The dot (.) is used to access the object's attributes and methods.

    *To call a method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (;).

    *A class must have a matching filename (Main and Main.java).
 */