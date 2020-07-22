package com.teddy;

public class ExceptionDemo {
    public static void main(String[] args){
        try
        {
            int a[] = new int [6];
            a[6]= 8;
            int i=7;
            int j= 0;
            int k=i/j;
            System.out.println("output is" +k);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limit");
        }
        finally
        {
            System.out.println("bye");
        }
    }

}
