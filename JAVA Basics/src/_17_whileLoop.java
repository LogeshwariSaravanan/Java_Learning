import java.util.Scanner;

/*
while loop --> while(condition)
In while loop , loop variable is initialized outside the loop and writing while loop we only pass the condition and inc/dec the loop variable inside the loop
 while loop --> entry control loop, execute when the condition is true
 */
public class _17_whileLoop {
    public static void main(String[] args) {
        int i=1;
        while (i<=5){
            System.out.print("*");
            i++;
        }
        System.out.println();

        //execute while loop using Scanner class to print first N even numbers
        System.out.println("First N even numbers");
        int a=1,N;
        Scanner sc = new Scanner(System.in);
        System.out.print(("enter the value of a "));
        N = sc.nextInt();
        System.out.println("even  numbers between 1 to "+N+" are:");
        while(a<=N){
            if (a%2==0){
                System.out.println(a);
            }
            a++;
        }
    }
}
