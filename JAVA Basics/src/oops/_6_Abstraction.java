package oops;
/*
abstraction --> process of hiding certain details and showing only essential information to user
 Abstraction can be achieved by either abstract class or interfaces

 abstract keyword is non-access modifier, used for class and methods

Abstract class:
    It is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method:
    It can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

 */

abstract class Animal {//abstract class

    public abstract void animalSound();//abstract method (doesn't have body)

    public void eat() {//regular method
        System.out.println("eating........");
    }
}
class Dog extends Animal {
        public void animalSound(){
            System.out.println("Barking");//body of animalSound() is provided here
        }
}
public class _6_Abstraction {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.animalSound();
        myDog.eat();
    }
}

/*
Why And When To Use Abstract Classes and Methods?
        To achieve security - hide certain details and only show the important details of an object.
 */
