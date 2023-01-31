package oops;

public class StackDemo {
    public static void main(String[] args) {
        Stack s1= new Stack();
        s1.push(5);
        s1.push(6);
        s1.push(7);
        System.out.println(s1.pop());
        Stack s2= new Stack();
        s2.push(10);
        s2.push(20);
        System.out.println(s2.pop());


    }
}
