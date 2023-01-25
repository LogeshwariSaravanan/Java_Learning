// data can be stored using variables
//variables are named memory locations
/*
java is static programming language
In java we have to declare the variable
 */
/*
DATA TYPES
byte,short, int, long, float, double, boolean, char
 */

public class _2_VariablesAndDatatypes {
    public static void main(String[] args) {
        /*
        syntax for variable declaration
        datatype variableName;
         */
        int ticket_price; // variable declaration here int is data type and ticket_price is variable name
        ticket_price=20; //initialization or assigning value to declared variable
        boolean paid=true;
        System.out.println(paid);
        System.out.println(ticket_price + " is the ticket price");
        byte a=127;
        System.out.println(a);
        short roll_num=12345;
        System.out.println(roll_num + " is the roll number");
        long phone_num=7894561230L;
        System.out.println(phone_num + " is the phone number");
        float decimal_num= 2.5F;
        System.out.println(decimal_num + " is the decimal number ");
        double decimal_number=3.4567d;
        System.out.println(decimal_number + " is the decimal number");
        char alpha=65;
        System.out.println(alpha + " is the ascii value for 65");//ASCII value
        char alphabet='L';
        System.out.println(alphabet);
    }
}
