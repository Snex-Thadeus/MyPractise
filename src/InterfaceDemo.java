// you cannot define any method in interface, we cannot
// create object of it, all methods are public abstract by default
// we don't have constructor in interface
/*interface Abc
{
    void show();
}
class Implimentor impliments Abc
{
    public void show()
    {
        System.out.println("anything");
    }
}
public class InterfaceDemo
{
    public static void main(String[] args)
    {
        Abc obj - new Implimentor();
        obj.show();
    }
}*/
//types of interface
//1.Normal
//2.Single abstract method-functional interface
//3. Marker interface (doesn't have any method)

interface Writer
{
    public abstract void write();

}
class Pen implements Writer
{
    public void write()
    {
        System.out.println("Im a Pen");
    }
}
class Pencil implements Writer
{
    public void write()
    {
        System.out.println("Im a pencil");
    }
}
class Kit
{
    public void doSomething (Writer p)
    {
        p.write();
    }
}


public class InterfaceDemo {
    public static void main(String[] args){
      Kit k = new Kit();
      Writer  p = new Pen();

      Writer pc = new Pencil();

      k.doSomething(pc);
    }
}
