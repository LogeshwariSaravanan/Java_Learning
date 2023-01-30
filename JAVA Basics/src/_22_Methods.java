/*
methods --> carries out a specific task
main is also a method execution starts from main method
 */

public class _22_Methods {
    static int boxVolume(int length,int breadth,int height){//method definition  parameter
        int volume=length*breadth*height;
        return volume;

    }
    public static void main(String[] args) {
        int vol=boxVolume(4,5,6);//method call
        System.out.println("volume is "+vol);
        System.out.println("volume is "+boxVolume(2,3,4));

    }
}
