abstract class AbsClass
{
    public void methodA() //Non-Abstract and Non-Static method
    {
        System.out.println("I am methodA in abstract Class");
    }

    abstract void display(); 
}

class Abc extends AbsClass
{
    public void methodB()
    {
       System.out.println("I am methodB in Abc Class"); 
    }

     public void methodA() //Non-Abstract and Non-Static method
    {
        System.out.println("I am new methodA");
    }

    public void display()
    {
       System.out.println("I am implementation of abstract method display");         
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Abc obj = new Abc();
        obj.methodA();
        obj.methodB();
        obj.display();
    }
}
