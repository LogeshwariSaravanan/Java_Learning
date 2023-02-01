package BusReservation;
import java.util.*;

public class BusDemo {
    public static void main(String[] args) {
        //Bus buses[]=new Bus[50];//arraylist -->collection
        ArrayList<Bus> buses=new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();
        buses.add(new Bus(1,true,45));
        buses.add(new Bus(2,false,50));
        buses.add(new Bus(3,true,48));

        int userOpt=1;
        Scanner sc=new Scanner(System.in);
        for (Bus b:buses){
            b.displayBusInfo();
        }
        while(userOpt==1) {
            System.out.println("Enter 1 to book and 2 to exit");
            userOpt=sc.nextInt();
            if(userOpt==1){
                Booking booking=new Booking();

            }
        }
    }
}
