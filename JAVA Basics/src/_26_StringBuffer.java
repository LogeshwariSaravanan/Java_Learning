public class _26_StringBuffer {
    public static void main(String[] args) {
        StringBuffer s= new StringBuffer("Welcome");
        System.out.println(s.append("JavaClass"));
        System.out.println(s.insert(7,"To"));
        System.out.println(s.delete(13,18));
       // System.out.println(s.replace(1,3,"l"));
        //System.out.println(s.reverse());
        System.out.println(s.length());

    }
}
