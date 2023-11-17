
import java.io.*;

public class DisplayRecords {
    public static void main(String[] args) throws IOException {
        
        FileReader fis = new FileReader("Triton.txt");
        BufferedReader br = new BufferedReader(fis);
        String line;
        while((line = br.readLine())!= null)
        {
            //System.out.println(line);
            String[] str = line.split(",");
            int roll = Integer.parseInt(str[0]);
            String name = str[1];
            String address = str[2];
            String college = str[3];

            if(address.equals("Jhapa"))
            {
                System.out.println(roll+" "+name+" "+address+" "+college);
            }
        } 
        fis.close();
        br.close();
    }
}
