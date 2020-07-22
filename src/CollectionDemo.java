import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// collection interface doesn't support index numbers while List does
public class CollectionDemo {
    public static void main(String[] args)
    {
        /* Put Collection*/  List values = new ArrayList ();
       values.add(4); // Integer v = new Integer(4)
       values.add(6);
       values.add(9);
       values.add("2");

      /* values.add(2,2); */

      /* Iterator it = values.iterator();
       while(it.hasNext()) {
           System.out.println(it.next());
       }*/

       /* for (int i=0; i<values.size(); i++)
        {
            System.out.println(values.get(i));
        } */

        // You can use enhanced Enhanced for loop

       for(Object o : values)
        {
            System.out.println(o);
        }

    }
}
