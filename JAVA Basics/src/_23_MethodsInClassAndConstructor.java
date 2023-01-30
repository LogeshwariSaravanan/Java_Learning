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

    void setDimension(int l,int b, int h){
        length=l;
        breadth=b;
        height=h;
    }
    int volume(){
        return length*breadth*height;
    }

}
public class _23_MethodsInClassAndConstructor {
    public static void main(String[] args) {
        //without using the constructor value
        Box1 blackBox = new Box1(1,2,3);
        blackBox.length=10;
        blackBox.breadth=20;
        blackBox.height=30;
        int volume=blackBox.volume();//involking a method --> call a method by a object
        System.out.println("volume of blackBox is "+volume);

        //using set dimention method
        Box1 woodBox= new Box1(1,2,3);
        woodBox.setDimension(4,5,6);
        System.out.println("volume of woodBox is "+woodBox.volume());

        //using constructor
        Box1 greenBox = new Box1(1,2,3);
        System.out.println(greenBox.volume());



    }
}
