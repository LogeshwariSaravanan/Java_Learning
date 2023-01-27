//condition statement -if, if else, else if ladder
import java.util.*;
public class _13_IfCondition {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number ");
        num=sc.nextInt();
        if (num>0){
            System.out.println(num+" is positive");
        }
        else if(num==0){
            System.out.println(num + " is zero");
        }
        else{
            System.out.println(num+" is negative");
        }

        //grade system
        /*
        >=90 - A
        80 - 89 - B
        70 - 79 - c
        60 -69 - D
        <60 - E
         */
        System.out.print("Enter the mark between 0 to 100 ");
        int mark = sc.nextInt();
        if ((mark>=90)&&(mark<=100)){
            System.out.println("Grade A");
        }
        else if((mark>=80)&&(mark<=89)){
            System.out.println("Grade B");
        }
        else if((mark>=70)&&(mark<=79)){
            System.out.println("Grade C");
        }
        else if((mark>=60)&&(mark<=69)){
            System.out.println("Grade D");
        }
        else if(mark<60){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Invalid mark");
        }

    }
}
