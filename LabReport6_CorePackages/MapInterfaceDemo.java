import java.util.*;

public class MapInterfaceDemo {
    
    static void mapDemo()
    {       //Map ht = new HashMap();\
        Map<Integer,String> ht  = new TreeMap<>();
        
        ht.put(100, "Ram");
        ht.put(200,"Shyam");
        ht.put(100,"Sita");
        ht.put(300,"Gita");
        ht.put(400,"Rita");

        System.out.println(ht);

        System.out.println("Value in key 300: "+ht.get(300));
        System.out.println("Size of hashtable ht: "+ht.size());
        ht.remove(200);
        //ht.clear();
        System.out.println("After removing: "+ht);
        System.out.println("Is empty or not? "+ht.isEmpty());
    }
    public static void main(String[] args) {
        mapDemo();
    }

}
