
class A extends Thread
{
   public void run()
   {
      for (int i = 0; i < 10; i++) {
        System.out.println("Loop 1");
      }
      System.out.println("Exiting from class A...");
   }
}
class B extends Thread
{
    public void run()
    {
        for(int j=0; j<10;j++)
        {
            System.out.println("Loop 2");
        }
        System.out.println("Exiting from class B");
    }
}
class C extends Thread
{
    public void run()
    {
        for(int j=0; j<10;j++)
        {
            System.out.println("Loop 3");
        }
        System.out.println("Exiting from class C");
    }
}
public class ThreadPriorities
{
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();
        C t3 = new C();

        //Priorities
        t3.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(1);  //Thread.MIN_PRIORITY
        //t1.setPriority(5);
        t1.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}







