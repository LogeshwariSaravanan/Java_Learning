/*
method overloading -->define more method with same name but difference in parameter type or parameter count
we can overload constructor also
 */

package oops;

public class MethodOverloadingDemo2 {
    static void test(){
        System.out.println("test method with no argument");
    }
    static void test(int a){
        System.out.println("test method with 1 argument");
    }
    static void test(int a, int b){
        System.out.println("test method with 2 argument");
    }

    public static void main(String[] args) {
        test();
        test(1);
        test(1,2);
    }

}
