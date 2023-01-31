/*
Invoking method with objects so that we need not to give mention static in method definition
 */
/*
CONSTRUCTOR
    *special method
    *same name as class name
    *Immediately called when the object is created
    *Used for initializing the values
    *No return type
 */


class Box1{
    int length,breadth,height;//instance variable

    public Box1(int l, int b, int h) {//constructor
        length=l;
        breadth=b;
        height=h;
    }
    public Box1(){//constructor overloading
        length=-1;
        breadth=-1;
        height=-1;
    }
    public Box1(int l){//constructor overloading
        length=breadth=height=l;
    }
    public Box1(Box1 b){
        length=b.length;
        breadth=b.breadth;
        height=b.height;
    }
    void setDimension(int l,int b, int h){
        length=l;
        breadth=b;
        height=h;
    }
    boolean isEqual(Box1 b){
        if (length==b.length && breadth==b.breadth && height==b.height){
            return true;
        }
        else{
            return false;
        }
    }
    int volume(){
        return length*breadth*height;
    }

}
public class _23_MethodsInClassAndConstructor {
    public static void main(String[] args) {
        //without using the constructor value
        Box1 blackBox = new Box1();
        blackBox.length=10;
        blackBox.breadth=20;
        blackBox.height=30;
        int volume=blackBox.volume();//involking a method --> call a method by a object
        System.out.println("volume of blackBox is "+volume);

        //using set dimention method
        Box1 woodBox= new Box1();
        woodBox.setDimension(4,5,6);
        System.out.println("volume of woodBox is "+woodBox.volume());

        //using constructor
        Box1 greenBox = new Box1(1,2,3);
        System.out.println("volume of green box is "+greenBox.volume());

        //using constructor overloading
        Box1 redBox= new Box1();
        redBox.setDimension(4,5,6);
        System.out.println("volume of redbox is "+redBox.volume());

        //using constructor overloading with 1 argument
        Box1 cardBoard = new Box1(10);
        System.out.println("volume of cardboard is "+cardBoard.volume());

        //passing object as arguments
        System.out.println(blackBox.isEqual(greenBox));

        //passing object as argument to the constructor
        Box1 b1= new Box1(greenBox);
        System.out.println("volume of b1 is "+b1.volume());

    }
}
