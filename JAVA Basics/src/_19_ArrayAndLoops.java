import java.util.*;
public class _19_ArrayAndLoops {
    public static void main(String[] args) {
        int[] a={4,8,6,3,7,9};
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        //user input for array
        int[] arr=new int[6];
        System.out.println("enter the 6 elements of the array:");
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<arr.length;i++){//use this loop for get the array values
            System.out.print("enter the element "+i+ ":");
            arr[i]=sc.nextInt();
        }//we have to use another loop for print the array elements or else we can use inbuild method to print the array element without using for loop
            System.out.print(Arrays.toString(arr));

    }
}
