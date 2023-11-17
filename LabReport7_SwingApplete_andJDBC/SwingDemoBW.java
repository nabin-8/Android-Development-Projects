
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.*;

class FirstGuiApp extends JFrame
{
    public FirstGuiApp() throws HeadlessException {
        setTitle("First GUI App");
        setSize(400,400);
        setLocationRelativeTo(null);   //Center

        setLayout(new FlowLayout(FlowLayout.LEFT,20,30));
        //Add Component
        JLabel label = new JLabel("This is my first JLabel....");
        add(label);
        
        JTextField jtf = new JTextField(5);
        add(jtf);
        
        JButton btn = new JButton("Click me!");
        add(btn);
        
        setVisible(true);   
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
public class SwingDemoBW {
    public static void main(String[] args) {
        new FirstGuiApp();  
    } 
}
