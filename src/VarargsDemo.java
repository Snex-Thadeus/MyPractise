class Math
{
    public int add(int...n)  // variable length argument (Varargs)
    {
        int sum=0;
        for (int i : n) {
            sum = sum + i ;
        }
        return sum;
    }
}

public class VarargsDemo {
    public static void main(String[] args){
        Math obj = new Math();
        System.out.println(obj.add(4,5,7,5,8));

    }
}
