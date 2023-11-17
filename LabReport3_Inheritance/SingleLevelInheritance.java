class Parent
{
    void methodA()
    {
        System.out.println("Hello I am methodA in Parent class...");
    }
}

class Child extends Parent
{
    void methodB()
    {
        System.out.println("Hello I am methodB in Child class...");
    }
}

public class SingleLevelInheritance
{
    public static void main(String[] args) {
        Child c = new Child();
        c.methodB();
        c.methodA();
    }
}