
/*
OPERATORS
operators are used to perform operations on variables and values
operator --> indicates what action or operation to perform
operand --> indicates what item to apply the action to

types of operators are:
    *Arithmetic operators   `--> + , - , * , / , % , ++ ,--
    *Assignment operators    --> = , += , -= , *= , /= , %= , &= , |= , ^= , <<= , >>=
    *Relational operators    --> == , != , > , < , >= , <=
    *Logical operators       --> && , || , !
    *Bitwise operators       --> & , | , ^ , ~
    *Ternary Operator        --> ? :

 */
/*****************************************INCREMENT AND DECREMENT ***********************************************/

//INCREMENT AND DECREMENT OPERATOR --> ++ , --
        /*
        num++   --> post increment --> first assingned and then incremented
        ++num   --> pre increment  --> first incremented and then only assigned

        num--   -->post decrement
        --num   -->pre decrement
         */
public class _7_IncrementAndDecrement {
    public static void main(String[] args) {
        //post increment
        System.out.println("POST INCREMENT");
        int num=5,e;
        System.out.println("post increment of num is: "+ num++);//number 5 is assigned and then incremented to 6 but output is 5
        e=num++; //first num 6 is assigned to e and then only  num is incremented . output is 6 but variable num becomes 7
        System.out.println("the value of e is : "+ e);//6
        System.out.println("now value of num is: " + num);//7

        //pre increment
        System.out.println("PRE INCREMENT");
        int number=10,f;
        System.out.println("pre increment of number is: "+ ++number);//number is first incremented to 11 and then assigned output is 11
        f=++number;//first number is incremented 11 from 12 and assigned to f
        System.out.println("the value of f is: "+ f);//12
        System.out.println("now the value of number is "+ number);//12

        //post decrement
        System.out.println("POST DECREMENT");
        int number1=20,g;
        System.out.println("post decrement of number1 is: "+ number1--);//number 20 is assigned and then decremented to 19 but output is 20
        g=number1--; //first num 19 is assigned to g and then only  num is decremented . output is 19 but variable num becomes 18
        System.out.println("the value of g is : "+ g);//19
        System.out.println("now value of num is: " + number1);//18

        //pre decrement
        System.out.println("PRE DECREMENT");
        int number2=15,h;
        System.out.println("pre decrement of number2 is: "+ --number2);//number is first decremented to 14 and then assigned output is 14
        h=--number2;//first number is decremented 14 to 13 and assigned to f
        System.out.println("the value of h is: "+ h);//13
        System.out.println("now th evalue of number is "+ number2);//13

        //EXAMPLE FOR POST AND PRE INCREMENT
        System.out.println("EXAMPLE FOR POST AND PRE INCREMENT AND DECREMENT");
        int a=3,b=4,c;
        c=a + b + a++ + b++ + ++a + ++b;
        System.out.println((c));

        int num1=10, num2=20;
        int res = a++ + b++ - ++a + --b;
        System.out.println(res);
    }
}
