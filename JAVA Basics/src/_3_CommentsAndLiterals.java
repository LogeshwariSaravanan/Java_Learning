//single line comment
/*
multi line comment
comments are used for reference purpose
 */

/*
rules for naming variables
    *name should start with alphabet or _ or $
    *should not start with number
    *name can be alpha numeric
    *name should not match with keywords
 */

/*
values are literal
for example in this program 900 is numerical literal
hello world is string literal
true or false is boolean literals
value in single quote is char literal
 */

public class _3_CommentsAndLiterals {
    public static void main(String args[]){
        int ticketPrice;
        ticketPrice=10;
        System.out.println(ticketPrice);
        int number=0xf;//hexadecimal number
        System.out.println(number);
        int a=123_466_789;
        System.out.println(a);
        //escape sequence
        System.out.println("\"Hello\"\n\"world\"");//world is printed in next line

    }
}
