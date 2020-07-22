class Emp
        {
          int eid;
          int salary;
          static String ceo; // same for all objects

            //constructors
            static /* executed when you load a class
            static variables are same for all objects, non-static are different
            we cannot use non-static variable in a static block
            */
            {
                ceo= "Levy";
            }
            public Emp() // Executed when you create an object
            {
                eid=1;
                 salary=2000;
            }
          public void show()
          {
              System.out.println(eid+":"+salary+":"+ceo);
          }
        }

public class StaticDemo {
    public static void main(String[] args){
     Emp tedy= new Emp();

     Emp lee = new Emp();
      // we don't need an object to access a static variable

     tedy.show();
     lee.show();

    }
}
