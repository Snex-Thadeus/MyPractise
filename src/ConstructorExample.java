class Table{
    int num1;
    int num2;
    int result;

    public Table()
    {
     num1=6;
     num2=5;
     result= num1+num2;
    }
    public Table(int n)
    {
        num1=n;
        num2=n;
    }
    public Table (double d )
    {
        num1= (int) d;
    }
}

public class ConstructorExample {
    public static void main (String[ ]args){
        Table  cons= new Table(8.5); /*constructor ->same name as
        the class->doesn't return any value ->called automatically when
         an object is created*/
        System.out.println(cons.num1);
        System.out.println(cons.result);

        System.out.println(cons.num1);

    }
}
