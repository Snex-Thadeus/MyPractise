class Casio{
    public void add(int i, int j) // methods
    {
        System.out.println(i+j);
    }
    public void add(int i, int j, int k)
    {
        System.out.println(i+j+k);
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args){
    Casio obj= new Casio();
    obj.add(5,2);
    obj.add(4,3,5);
    }
}
