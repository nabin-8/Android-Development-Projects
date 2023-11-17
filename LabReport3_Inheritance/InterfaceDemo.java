interface XYZ
{
   void methodI();  //Method Signature
   void methodJ();
}

interface Hello{
    void display(); //Method Signature
}

class Abc implements XYZ, Hello
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
public class InterfaceDemo
{
    public static void main(String[] args) {
        Abc obj = new Abc();
        obj.methodI();
        obj.methodJ();
        obj.display();
    }
}