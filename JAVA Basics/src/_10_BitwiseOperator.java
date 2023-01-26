/*
bitwise -->0s and 1s
bitwise operator convert decimal to binary and then operation is done
bitwise --> &,|,^,~, <<, >>
 */
import java.sql.SQLOutput;
import java.util.Scanner;
public class _10_BitwiseOperator {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        b = sc.nextInt();
        System.out.println("& operation :"+(a&b));
        System.out.println("| operation: "+(a|b));
        System.out.println("^ operation: "+(a^b));
        System.out.println("~ operation: "+(~a));
        System.out.println("left shift: "+(a<<1));
        System.out.println("right shift: "+(b>>1));
    }
}
