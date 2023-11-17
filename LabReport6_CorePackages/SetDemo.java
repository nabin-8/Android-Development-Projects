
import java.util.*;

public class SetDemo
{
    static void setDemo()
    {
       Set<Integer> al = new HashSet<Integer>();
        al.add(25);
        al.add(75);
        al.add(35);
        al.add(75);
        al.add(85);
        al.add(75);

        System.out.println(al);


        //Accessing elements using foreach loop
        System.out.println("Displaying elements using enhanced for loop:: ");
        for(int i : al)
        {
            System.out.println(i);
        }

        //Accessing using forEach method
        System.out.println("Display elements using forEach method::: ");
        al.forEach(System.out::println);

        //Accessing elements using Iterator
        System.out.println("Displaying using Iterator:: ");
        Iterator<Integer> itr = al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }   
    }

    public static void main(String[] args) {
        setDemo();
    }
}