package BusReservation;
import java.util.*;
public class Booking {
    String passengerName;
    int busno;
    Date date;
    public Booking(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name of passenger: ");
        passengerName=scanner.next();
        System.out.println("Enter bus no: ");
        busno= scanner.nextInt();
        System.out.println("Enter date dd-mm-yyyy");
        String dateinput=scanner.next();

    }
}
