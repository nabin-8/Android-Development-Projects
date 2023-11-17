
interface XYZ
{
   int a = 25;

   void methodI();  //Method Signature
   void methodJ();
}

interface Hello extends XYZ{
    void display(); //Method Signature
}

class Hi
{
    int b = 35;

    void methodD()
     {
        System.out.println("I am method D");
    }
   
}

class Abc extends Hi implements Hello 
{
    public void methodI()
    {
        System.out.println("I am methodI...");
    }

    public void methodJ()
    {
        System.out.println("I am methodJ...");
    }

    public void display()
    {
        System.out.println("I am display method...");
    }
}
public class MultipleInheritance
{
    public static void main(String[] args) {
        Abc obj = new Abc();
        obj.methodI();
        obj.methodJ();
        obj.display();
        obj.methodD();
        System.out.println("Value of a is "+ Abc.a);
        obj.b=55;
        System.out.println("Value of b is "+obj.b);
    }
}