/*
OPERATORS
operators are used to perform operations on variables and values
operator --> indicates what action or operation to perform
operand --> indicates what item to apply the action to

types of operators are:
    *Arithmetic operators   `--> + , - , * , / , %
    *Assignment operators    --> = , += , -= , *= , /= , %= , &= , |= , ^= , <<= , >>=
    *increment operators     --> ++
    *decrement operator      --> --
    *Relational operators    --> == , != , > , < , >= , <=
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

/***************************************RELATIONAL OPERATOR ***********************************************/
//relation operator checks the relation between two operator and result will boolean
public class _9_RelationalOperator {
    public static void main(String[] args) {
        int a=10,b=5;
        System.out.println("check a is greater than b: " + (a>b));
        System.out.println("check b is greater than b: " + (a<b));
        System.out.println("check a is greater than or equla to b: " + (a>=b));
        System.out.println("check b is greater than or equal to a: " + (a<=b));
        System.out.println("check a and b are equal: " + (a==b));
        System.out.println("check a and b are not equal: " + (a!=b));
    }
}
