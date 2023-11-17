import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ArrayListClass
{
    static void ArrayListDemo()
    {
       List<Integer> al = new ArrayList<Integer>();
        al.add(25);
        al.add(75);
        al.add(35);
        al.add(75);
        al.add(85);
        al.add(75);

        System.out.println(al);

        //foreach loop
        System.out.println("Display using foreach loop::: ");
        for(Object obj : al)
        {
            System.out.print(obj+" ");
        }
        System.out.println();
        //Iterator method
        System.out.println("Display using iterator::: ");
        Iterator<Integer> itr = al.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        System.out.println("Display using foreach method");
        al.forEach(System.out::println);

        Vector vec = new Vector();
        vec.add(25);
        vec.add(35);
        vec.add(75);
        
        System.out.println("Display using Enumeration: ");
        Enumeration data = vec.elements();
        while(data.hasMoreElements())
        {
            System.out.println(data.nextElement());
        }

        
    }

    public static void main(String[] args) {
        ArrayListDemo();
    }
}