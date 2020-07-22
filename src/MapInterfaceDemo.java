import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterfaceDemo {
    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<>();  //HashTable
        map.put("myName","Teddy");
        map.put("actor","Luwi");
        map.put("ceo","Odhis");

        {
            System.out.println(map);
        }
    }
}
