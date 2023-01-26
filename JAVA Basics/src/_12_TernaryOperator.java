/*
ternary operator -->condition ? exp1 : exp2;
check the condition if it is true print exp1 if it is false print exp2
 */
import java.util.*;
public class _12_TernaryOperator {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        b=sc.nextInt();
        int res= a>b?a:b;
        System.out.println("greatest number is: "+res);

    }
}
