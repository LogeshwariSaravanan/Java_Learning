import java.util.Scanner;

/*
loop --> used to repeat set of instructions again and again
types --> for loop, while loop, Do while

//syntax --> for (star;stop;increment or decrement)
 */
public class _16_ForLoop {
    public static void main(String[] args) {
        System.out.println("SIMPLE FOR LOOP");
        //syntax --> for (initialization;condition;inc/dec)
        for(int i=1;i<100;i++){  //for each iteration i value increased by 1
            System.out.print("*");
        }
        System.out.println();

        //execute for loop using Scanner class for sum of N natural numbers
        System.out.println("sum of first N natural numbers");
        int i=1,sum=0,N;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of N ");
        N=sc.nextInt();
        for(;i<=N;i++){
            sum+=i;

        }
        System.out.println(sum);


        //nested loop --> loop inside the loop
        /*
        external loop --> row
        internl loop -- column
         */

        System.out.println("NESTED LOOP");

        for(int x=1;x<=5;x++){//outer loop -->control row
        for(int y=1;y<=5;y++) { //inner loop -->column that means this loop print the *
            System.out.print("* ");
        }
            System.out.println(" ");
        }

    }
}
