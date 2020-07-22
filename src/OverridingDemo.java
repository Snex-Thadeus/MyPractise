// overriding--> child class method overrides parent class method
class C {
    public void show()
    {
        System.out.println("in C");
    }

}
class D extends C {
    public void show()
    {
       // super.show(); in case you want to show the super class
        System.out.println("in D");
    }

}

class E extends C {
    public void show()
    {
        System.out.println("in E");
    }
}

public class OverridingDemo {
    public static void main(String[] args){
   C obj1 = new D(); // runtime porlymorphism
   obj1.show();

   obj1 = new E();
   obj1.show(); // Dynamic  method dispatch
    }
}
