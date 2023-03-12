package oops;
/*
encapsulation --> wrapping of code and data

encapsulation means to make sure that sensitive data is hidden from users.To achieve this,
    *declare class variable/attributes as private
    *provide public get and set methods to access and update the value of a private variable.

private variables can  only be accessed within the same class .However it is possible to access them if we provide public get and set methods

    *the get method returns the variable value
    *the set method sets the value

both syntax start with either get or set, followed by the name of the variable, with first letter in upper case.

 */
public class _4_Encapulation {//created a class
    private String name;//private attribute --> accessed within this class

    //get method
    public String getName(){return name;
    }

    //set method
    public void setName(String NewName){
        this.name=NewName;
    }

    public static void main(String[] args) {//main method
        _4_Encapulation myObj=new _4_Encapulation();//creation of object
        myObj.setName("Logeshwari");
        System.out.println(myObj.getName());
    }
}
/*
Why Encapsulation?
    *Better control of class attributes and methods
    *Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
    *Flexible: the programmer can change one part of the code without affecting other parts
    *Increased security of data
 */