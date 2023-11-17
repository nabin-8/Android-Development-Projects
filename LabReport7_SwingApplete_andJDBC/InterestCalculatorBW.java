import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class InterestCalculator
{
    JFrame frame = null;
    JLabel lblPrincipal, lblTime, lblRate, lblResult;
    JTextField txtPrincipal, txtTime, txtRate, txtResult;
    JButton btnSI;
    
    public InterestCalculator()
    {
        frame = new JFrame("Simple Interest Calculator");
        frame.setLayout(new FlowLayout());
        frame.setSize(200,260);
        // frame.pack();
        // frame.setExtendedState(frame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        
        //Adding components
        lblPrincipal = new JLabel("Enter principal amount: ");
        frame.add(lblPrincipal);
        txtPrincipal = new JTextField(15);
        frame.add(txtPrincipal);
        
        lblTime = new JLabel("Enter the time: ");
        frame.add(lblTime);
        txtTime = new JTextField(15);
        frame.add(txtTime);
        
        lblRate = new JLabel("Enter rate in percent: ");
        frame.add(lblRate);
        txtRate = new JTextField(15);
        frame.add(txtRate);
        
        lblResult = new JLabel("Result: ");
        frame.add(lblResult);
        txtResult = new JTextField(15);
        frame.add(txtResult);
        
        btnSI = new JButton("Calculate SI");
        frame.add(btnSI); 
        
        //Visible
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}

public class InterestCalculatorBW {
    public static void main(String[] args) {
        new InterestCalculator();
    }
}
