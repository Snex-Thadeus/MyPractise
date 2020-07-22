import java.util.HashSet;
import java.util.Set;

public class SetInterfaceDemo {
    public static void main(String[] args){
// set supports only unique elements/ cann't duplicate
        Set<Integer> values = new HashSet<>();
// Hahset doesnot give elements in an order thus use TreeSet
        System.out.println(values.add(87));
        System.out.println(values.add(97));
        System.out.println(values.add(34));
        System.out.println(values.add(92));

        for(int i:values)
        {
            System.out.println(i);
        }
    }
}
