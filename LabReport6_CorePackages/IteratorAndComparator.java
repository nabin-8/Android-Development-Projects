import java.util.*;

public class IteratorAndComparator {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(25);
        al.add(75);
        al.add(35);
        al.add(75);
        al.add(85);
        al.add(75);

        System.out.println(al);

        //Accessing elements using Iterator
        System.out.println("Accessing elements using Iterator:: ");
        Iterator<Integer> itr = al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        //Comparator
        Collections.sort(al);
        //Accessing elements using Iterator
        System.out.println("Sorted elements are:: ");
        Iterator<Integer> itrr = al.iterator();
        while(itrr.hasNext())
        {
            System.out.println(itrr.next());
        }
        
        //Highest or Max value
        int highest = Collections.max(al);
        System.out.println("Maximum value is: "+highest);

    




    }
}
