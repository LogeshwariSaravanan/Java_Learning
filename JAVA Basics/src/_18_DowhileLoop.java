import java.util.Scanner;

/*
do while -->first execute and then check the condition
do while -->exit control loop , execute atleast one time if the condition is false
 */
public class _18_DowhileLoop {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.print("*");
            i++;
        } while (i <= 5);
        System.out.println();

        //execute while loop using Scanner class to print first N odd numbers
        System.out.println("first N odd numbers");
        int a = 1, N;
        Scanner sc = new Scanner(System.in);
        System.out.print(("enter the value of a "));
        N = sc.nextInt();
        System.out.println("odd  numbers between 1 to " + N + " are:");
         do{
            if (a % 2 != 0){
                System.out.println(a);
            }
            a++;
        }while (a <= N);
    }
}
