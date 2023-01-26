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

/*****************************************ASSIGNMENT OPERATOR***********************************************/
//asignment operator is used to assign the value to the variable

import java.util.Scanner;
public class _8_AssignmentOperator {
    public static void main(String[] args) {
        //ASSIGNMENT OPERATOR --> =,+=,-=,*=,/=,%=
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a: ");
        int a = sc.nextInt();
        System.out.println(a+=1); // for example : a becomes 12 if a value is 11
        System.out.println(a-=1); //a becomes 11 because value of d is 12 so 12-1 is 1
        System.out.println(a*=1); //a becomes 11 because 11*1 is 11
        System.out.println(a/=2); //a becomes 11 because 11/2 is 5
        System.out.println(a%=3); //a becomes 2 because 5%3 is 2
    }
}
