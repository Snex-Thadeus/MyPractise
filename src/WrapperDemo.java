

public class WrapperDemo {
    public static void main(String[] args){
        int i=5; // primitive datatype
        Integer ii = new Integer(5); // wrapper class

       // *Integer ii = new Integer(i); boxing or wrapping*//
        int j=ii.intValue(); // unboxing

        Integer value= i; // Autoboxing
        int k = value; // Autounboxing

        String str="123";
        int n = Integer.parseInt(str);
        System.out.println(n);
    }
}
