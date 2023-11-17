
class A implements Runnable
{
   public void run()
   {
      for (int i = 0; i < 10; i++) {
        System.out.println("Loop 1");
      }
      System.out.println("Exiting from class A...");
   }
}
class B implements Runnable
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
public class RunnableTreading
{
    public static void main(String[] args) {
        A t1 = new A();
        //B t2 = new B();
        Thread rt1 = new Thread(t1);
        Thread rt2 = new Thread(new B());
        rt1.start();
        rt2.start();
    }
}