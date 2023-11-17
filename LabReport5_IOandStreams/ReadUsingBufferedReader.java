import java.io.BufferedReader;
import java.io.FileReader;

public class ReadUsingBufferedReader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("student.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
             while((line = br.readLine())!= null)
             {
                System.out.print(line);
             }
             br.close();
             fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
