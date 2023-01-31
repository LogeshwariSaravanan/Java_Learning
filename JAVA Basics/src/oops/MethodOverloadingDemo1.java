/*
method overloading -->define more method with same name but difference in parameter type or parameter count
we can overload constructor also
 */


package oops;

public class MethodOverloadingDemo1 {
    static int max(int a,int b){
        return a>b?a:b;
    }
    static double max(double a, double b){
        return a>b?a:b;
    }
    static char max(char a, char b){
        return a>b?a:b;
    }
    static int min(int a, int b){
        return a<b?a:b;
    }
    static double min(double a, double b){
        return a<b?a:b;
    }

    public static void main(String[] args) {
        System.out.println("maximum of 2 num "+max(5,7));
        System.out.println(("maximum of 2 num "+max(5.5,8.5)));
        System.out.println("maximum of 2 character "+max('a','b'));
        System.out.println("minimun of 2 num is "+min(5,2));
        System.out.println("minimun of 2 num is "+min(5.2,9.2));

    }
}
