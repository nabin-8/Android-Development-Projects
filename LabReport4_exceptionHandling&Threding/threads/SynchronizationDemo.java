class AThread 
{
    synchronized void deposit(int amount)
    {
        System.out.println("Amount deposited: Rs. "+amount);
    }

    synchronized void withdraw(int amount)
    {
        System.out.println("Amount withdraw: Rs. "+amount);
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) {
        AThread obj = new AThread();

        new Thread()
        {
            public void run()
            {
                obj.deposit(15000);
            }
        }.start();

        new Thread()
        {
            public void run()
            {
                obj.withdraw(10000);
            }
        }.start();
    }
}
