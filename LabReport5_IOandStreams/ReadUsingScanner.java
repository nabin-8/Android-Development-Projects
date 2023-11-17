import java.io.FileReader;
import java.util.Scanner;

public class ReadUsingScanner {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("student.txt");
            Scanner sc = new Scanner(fr);
             while(sc.hasNextLine())
             {
                String line = sc.nextLine();
                System.out.print(line);
             }
             sc.close();
             fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
