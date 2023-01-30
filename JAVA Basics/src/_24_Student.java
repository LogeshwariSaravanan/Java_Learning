
class Student{
    String name;
    int roll_no,mark[];
    public Student(String n,int r, int m[]){
        name=n;
        roll_no=r;
        mark=m;
    }
    void set_values(String name,int roll_no,int mark[]){//this pointer
            this.name=name;
            this.roll_no=roll_no;
            this.mark=mark;

    }
    int total() {
        int sum = 0;
        for (int i : mark) {
            sum += i;
        }
        return sum;
    }
}
public class _24_Student {
    public static void main(String[] args) {
        Student stu1=new Student("logeshwari",35,new int[]{90,90,92,93,90});
        stu1.set_values("logeshwari",35, new int[]{90, 90, 92, 93, 90});
        System.out.println("Roll no "+stu1.roll_no+" "+stu1.name+" scored total mark "+stu1.total()+" out of 500");
        Student stu2=new Student("logi",36,new int[]{90,90,92,93,85});
        System.out.println("Roll no "+stu2.roll_no+" "+stu2.name+" scored total mark "+stu2.total()+" out of 500");



    }
}


