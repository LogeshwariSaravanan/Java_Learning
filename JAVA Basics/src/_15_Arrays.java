/*
store more values in one variable is called array
 */

public class _15_Arrays {
    public static void main(String[] args) {
        int marks[];//consider marks it as array but not allocate the space for the array
        marks=new int[6];//to allocate space we have to mention the size
        marks[0]=90;
        marks[1]=50;
        marks[2]=89;
        marks[3]=78;
        System.out.println(marks[2]);

        System.out.println("one dimensional array");
        int mark[]={92,52,85,74,65};//one dimensional array
        System.out.println(mark[4]);

        System.out.println("two dimentional array");
        int subject_mark[][]={{50,60,85},{75,89,62},{85,92,82}};
        System.out.println(subject_mark[0][1]);


    }
}
