
class T {
    public void show()
    {
        System.out.println("In T");
    }
}
// its a class which doesn't have a name and is used ones
public class AnonymousExample {
    public static void main(String[] args){
       T obj = new T()

       {
           public void show()
           {
               System.out.println("Im the best");
           }
       };
       obj.show();
    }
}
