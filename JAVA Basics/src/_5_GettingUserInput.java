
/*
getting input from user
 */


import java.util.Scanner;
public class _5_GettingUserInput {
    public static void main(String[] args) {

        System.out.println("ABC cafe rating");
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name = scan.nextLine();//to scan string we use nextLine
        System.out.println("hello " + name);

        System.out.println("what is your rating from 1 to 5? ");
        int rating = scan.nextInt();// to scan integer we use nextInt
        System.out.println("you rated us " + rating);
        scan.nextLine();//to avoid skipping of mail id

        System.out.println("Enter your email: ");
        String email = scan.nextLine();
        System.out.println("your mail id is " + email);


    }
}
