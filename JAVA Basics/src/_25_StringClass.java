
/*
STRING --> sequence of character

String in java is class

String class is present in java.lang

this java.lang implements Serializable, Comparable and CharSequence

CharSequence Interface is used to represent the sequence of character. String,StringBuffer and StringBuilder Classes implements it.
we can create string using these three classes.

String class is immutable it means it cannot be changed.whenever we change any string, a new instance is created.
StringBuffer and StringBuilder  is for mutable string.

Two Ways to create String Objects:
---------------------------------
        1.By String Literal
        2.By New Keyword

1.String Literal:
    It is created by double quotes

2.By New Keyword:
    new object is created using new keyword.
 */
import java.lang.String;//this imports the string class. It will be imported by default we need  not to import like this


public class _25_StringClass {
    public static void main(String[] args) {
        String s="Hello";//string literal
        String s2="Hello";
        String s1=new String("Hello");
        System.out.println(s.equals(s1));
        System.out.println(s.equals(s2));
        System.out.println(s==s2);
        System.out.println(s==s1);

        //buildin methods in string
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.startsWith("h"));
        System.out.println(s.indexOf("l"));
        System.out.println(s.lastIndexOf("l"));
        System.out.println(s.substring(1,3));
        System.out.println(s.subSequence(1,5));
        System.out.println(s.replace("l","0"));
        System.out.println(s.charAt(4));

    }
}
