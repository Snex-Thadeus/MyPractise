// abstract class---> no one can create an object of it
abstract class Human   // abstract class
{
    public abstract void eat ();
    {

    }
    public void walk()
    {

    }
}
class Man extends Human  // concrete class
{
    public void eat(){

    }
}

public class AbstractDemo {
    public static void main(String[] args){
      Human obj = new Man();
    }
}
