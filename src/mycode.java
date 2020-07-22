public class mycode {
    public static void main(String args[]){
        int num=5; // 4 bytes
        short s=5; // 2 bytes
        long l=5l; // very big number 8 bytes
        System.out.println(num);
        float percent1=5.5f; // 4 bytes
        double percent=5.5; // 8 bytes
        char c ='A';
        c=66; // America Starndard code for information interchange
        System.out.println(c);

        double d1=5; // implicit conversion
        int k=(int)5.6;// type casting
        System.out.println(k);
        //Naming conventions
        //interface should be adjective(Readable)
        //class should be a noun (Student)
        //method should be a verb(run,write) abc()
        //constructor Abc()
        // constant everything should be capital(MAX_PRICE)
    }
}
//variables are containers where data is stored
