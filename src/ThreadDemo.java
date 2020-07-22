class Hi extends Thread
{
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Hi");
            try{ Thread.sleep(1000);
            }
            catch(Exception e){

            }
        }
    }
}

class Hello extends Thread
{
    public void run()
    {
        for(int i=1; i<5; i++) {

            System.out.println("Hello");
            try{ Thread.sleep(1000);
            }
            catch(Exception e){

            }
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args){

        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start();
        try{ Thread.sleep(10);
        }
        catch(Exception e){

        }
        obj2.start();
    }

    }

    /* interface on threads
    class Hi impliments Runnable
{
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Hi");
            try{ Thread.sleep(1000);
            }
            catch(Exception e){

            }
        }
    }
}

class Hello impliments Runnable
{
    public void run()
    {
        for(int i=1; i<5; i++) {

            System.out.println("Hello");
            try{ Thread.sleep(1000);
            }
            catch(Exception e){

            }
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args){

        Runnable obj1 = new Hi();
        Runnable obj2 = new Hello();

       Thread t1 = new Thread(obj1);
       Thread t1 = new Thread(obj2);

        t1.start();
        try{ Thread.sleep(10);
        }
        catch(Exception e){

        }
        t2.start();
    }

    }

    * */
/*labda expression in multithreading
*
public class ThreadDemo {
    public static void main(String[] args){

       Thread t1 = new Thread(() ->
       {
        for (int i = 1; i < 5; i++)
        {
            System.out.println("Hi");
            try{ Thread.sleep(1000);
            }
            catch(Exception e){

            }
        },"Hi Thread");
       Thread t1 = new Thread(() ->
        {
        for(int i=1; i<5; i++)
        {
            System.out.println("Hello");
            try{ Thread.sleep(1000);
            }
            catch(Exception e){

            }
        },"Hello Thread");

        t1.start();
        try{ Thread.sleep(10);
        }
        catch(Exception e){

        }
        t2.start();
    }

    }
* */
/* join isAlive method
    public class ThreadDemo {
        public static void main(String[] args) throws Exception
        {

            Thread t1 = new Thread(() ->
            {
                for (int i = 1; i < 5; i++)
                {
                    System.out.println("Hi");
                    try{ Thread.sleep(1000);
                    }
                    catch(Exception e){

                    }
                });
                Thread t1 = new Thread(() ->
                {
                    for(int i=1; i<5; i++)
                    {
                        System.out.println("Hello");
                        try{ Thread.sleep(1000);
                        }
                        catch(Exception e){

                        }
                    });

      t1.setName("Hi Thread");
      t2.setName("Hello Thread");
      System.out.println(t1.getName());
      System.out.println(t2.getName());

                    t1.start();
                    try{ Thread.sleep(10);
                    }
                    catch(Exception e){

                    }
                    t2.start();
                    System.out.println("t1.isAlive")
                    t1.join();
                    t2.join();
                    System.out.println("Bye")
                }
            }
            */

