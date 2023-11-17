import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
    int roll;
    String name;
    static int level;
    transient String college;

    public Student(int r, String n, int l, String c)
    {
        roll = r;
        name = n;
        level = l;
        college = c;
    }
}

public class SerializationAndDeserialization {
    static void serializationDemo()
    {
        Student obj = new Student(1,"Hari",12,"Triton");
        
        try
        {
            FileOutputStream fos = new FileOutputStream("TritonStudent.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);

            System.out.println("Object Serialized Successfully...");
            fos.close();
            oos.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
