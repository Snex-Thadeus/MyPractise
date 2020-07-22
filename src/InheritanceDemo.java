class Calculator  // super class
{
    public int add(int i, int j) {
        return i + j;
    }
}

class CalcAdv extends Calculator //sub class
{
    public int sub(int i, int j) {
        return i - j;
    }

}
class CalcVeryAdv extends CalcAdv
{
    public int multi(int i, int j) {
        return i*j;
    }
}

public class InheritanceDemo {
    public static void main(String[] args){
    CalcVeryAdv c1 = new CalcVeryAdv();
    int result1 = c1.add(7, 4);
    int result2 = c1.sub(9, 3);
    int result3 = c1.multi(6, 4);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

// NB; java doesn't support multiple inheritance
    }
}
