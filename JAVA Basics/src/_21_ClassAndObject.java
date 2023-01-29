/*
CLASS AND OBJECT

CLASS --> blueprint or Template for the object. class have data(attributes) and methods(function2) related to the data.
To access this methods in class we have to create the object
examlple  -->class user have some data(attributes) and methods related to the data
                user:
                    attributes:
                    User Name,pwd,emailId
                    Methods:
                    Register, Login,Changepwd

OBJECT --> instance for class
object is created to access the data and methods in class
we can create n number of object for one class.

HOW TO CREATE OBJECT?
sYNTAX : classNAme objectName =new constructor  --> User obj = new User();

example:

class Box{
int length,breadth,height;
volume(){.....}
surfaceArea(){......}
}
Box blackBox=new Box();
Box woodenBox=new Box();
Box cardBoardBox=new Box();
Box greenBox=new Box();

 */

class Box{//for class no memory. on the time of creating object only memory is created
    int length, breadth, height;
}

public class _21_ClassAndObject {
    public static void main(String[] args) {
        Box blackBox;
        blackBox=new Box();
        blackBox.length=10;
        blackBox.breadth=20;
        blackBox.height=30;
        System.out.println("black box length "+blackBox.length);
        System.out.println("black box breadth "+blackBox.breadth);
        System.out.println("black box height "+blackBox.height);
        Box woodBox=new Box();
        woodBox.breadth=50;
        woodBox.length=40;
        woodBox.height=80;
        System.out.println("wooden box length "+woodBox.length);
        System.out.println("wooden box breadth "+woodBox.breadth);
        System.out.println("wooden box height "+woodBox.height);


    }
}
