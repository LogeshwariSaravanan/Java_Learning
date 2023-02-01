package oops;
/*
A constructor in Java is a special method that is used to initialize objects.
The constructor is called when an object of a class is created.
It can be used to set initial values for object attributes
 */

//create class
public class _3_Constructor {
    int age;//create class attribute
    String Name;

    //create class constructor for the  _3_Constructor class
    public _3_Constructor(){
        age=22;//set the initial value for the class attribute x
        Name="Logeshwari";
    }


    public _3_Constructor(String name,int y){//constructor with parameters
        Name=name;
        age=y;
    }

    public static void main(String[] args) {
        _3_Constructor myObj = new _3_Constructor();//create an object for _3_Constructor class
        System.out.println(myObj.Name);
        System.out.println(myObj.age); //print the value of x
        _3_Constructor myObj2 = new _3_Constructor("Logesh",30);
        System.out.println(myObj2.Name+" is "+myObj2.age+" years old");

    }
}


/*
    *Note that the constructor name must match the class name, and it cannot have a return type (like void).

    *Also note that the constructor is called when the object is created.

    *All classes have constructors by default: if you do not create a class constructor yourself,
     Java creates one for you. However, then you are not able to set initial values for object attributes.
 */