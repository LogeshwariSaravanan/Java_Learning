/*
switch statement, if else --> selection statement

Control Statement -Break, Continue
break --> exit the loop
continue -->exit that iteration
 */
import java.util.Scanner;
public class _14_SwitchStatement {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        a=sc.nextInt();
        System.out.print("enter second number: ");
        b=sc.nextInt();
        char operator;
        System.out.print("enter the operator +,-,*,/,% ");
        operator=sc.next().charAt(0);// no method for scan char in Scanner class so we get string and mention take the first character thats why we use charAT(0)

        switch(operator){
            case '+':
                System.out.println(a+" + "+b+" = "+ (a+b));
                break;
            case '-':
                System.out.println(a+" - "+b+" = "+ (a-b));
                break;
            case '*':
                System.out.println(a+" * "+b+" = "+ (a*b));
                break;
            case '/':
                System.out.println(a+" / "+b+" = "+ (a/b));
                break;
            case '%':
                System.out.println(a+" % "+b+" = "+ (a%b));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}