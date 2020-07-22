public class TernaryOperator {
    public static void main(String[] args){
        int a=8;
        int b=0;

        if (a>6)
            b=1;
        else
            b=2;
        // ternary operator ?: -> condition?expr1 else :expr2
        System.out.println(b);

        int c=5;
        int d=0;

        d= c>6?1:2;
        System.out.println(d);
        //switch
        int p=8;
        switch (p) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("No Match");

        }


    }
}
