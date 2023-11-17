import java.io.*;

public class CopyContent {
    public static void main(String[] args) {
        
        try {
            FileInputStream fis = new FileInputStream("student.txt");
            FileOutputStream fos = new FileOutputStream("newStudent.txt");
            
            int i;
            while((i=fis.read())!= -1)
            {
                fos.write((char)i);
            }
            System.out.println("Content copied successfully...");
            fis.close();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
