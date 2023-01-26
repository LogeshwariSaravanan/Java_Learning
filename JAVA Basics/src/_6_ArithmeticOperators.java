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

/*****************************************ARITHMETIC OPERATOR ***********************************************/
import java.util.Scanner;
public class _6_ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of a: ");
        int a =sc.nextInt();
        System.out.print("enter the value of b: ");
        int b =sc.nextInt();
        // ARITHMETIC OPERATORS
        int c=a+b;
        System.out.println("addition of a and b is "+c);
        c=a-b;
        System.out.println("subtraction of a and b is :"+c);
        c=a*b;
        System.out.println("multiplication of a and b is :"+c);
        c=a/b;
        System.out.println("division of a and b is :"+c);// gives quotient
        c=a%b;
        System.out.println("modulus of a and b is :"+c);// gives remainder
    }
}
