import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionClasses
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
        al.remove(1);
        System.out.println(al);
        System.out.println("Size of  ArrayList al is "+al.size());
        System.out.println("Value at index 2: "+al.get(2));
        //al.clear();

        System.out.println("Index of 75 is: "+al.indexOf(75));
        System.out.println("Last index of 75 is: "+al.lastIndexOf(75));
        
        System.out.println(al);

        System.out.println("altor al is empty or no? "+al.isEmpty());

    }

    static void LinkedListDemo()
    {
        LinkedList<Integer> al = new LinkedList<Integer>();
        al.add(25);
        al.add(75);
        al.add(35);
        al.add(75);
        al.add(85);
        al.add(75);

        System.out.println(al);
        al.remove(1);
        System.out.println(al);
        System.out.println("Size of  ArrayList al is "+al.size());
        System.out.println("Value at index 2: "+al.get(2));
        //al.clear();

        System.out.println("Index of 75 is: "+al.indexOf(75));
        System.out.println("Last index of 75 is: "+al.lastIndexOf(75));
        System.out.println(al);
        System.out.println("LinkedList is empty or no? "+al.isEmpty());

        al.addFirst(10);
        System.out.println("10 inserted at first position"+al);
        al.addLast(100);
        System.out.println("100 inserted at last: "+al);
    }
    public static void main(String[] args) {
        //ArrayListDemo();
        LinkedListDemo();
    }
}