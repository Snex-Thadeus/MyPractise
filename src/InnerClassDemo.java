class Outer{
    int a; // variable
    public void show() // method
    {

    }
    class Inner //class inside a class outer$innerclass
    {
     public void display() // method
     {
         System.out.println("Print My Name On Screen");
     }
    }
}

public class InnerClassDemo {
    // variable, method, class
    public static void main(String[] args){
     Outer obj = new Outer();
     obj.show();

     Outer.Inner obj1= obj.new Inner(); // In order tor access the inner class,
        // we use the outer class, and in order to use object of the inner class,
        // we use the object of the outer class

        obj1.display();
    }
}
