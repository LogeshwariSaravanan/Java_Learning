/*
TYPE CASTING
converting from one data type to another data type

two types
    1.Implicit type Conversion
        important thing to remember during implicit type conversion
             small datatype value can be converted  into large datatypes for example byte can be converted  into int, long,etc
             but large datatype values cannot be converted into small datatypes for example int cannot be converted into byte, short,etc
    2.explicit type conversion
             here we can convert large datatypes into small datatypes

 */


public class _4_TypeCasting {
    public static void main(String args[]){
        //implicit type conversion or Automatic type conversion
        byte a=5; //1byte
        int n=a;  //4bytes
        System.out.println(a);
        System.out.println(n);
        //explicit type conversion
        int b;
        long num=10000l;
        b=(int)num;
        System.out.println(b);
    }
}
