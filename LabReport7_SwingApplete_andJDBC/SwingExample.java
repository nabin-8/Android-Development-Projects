import javax.swing.*;

public class SwingExample
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("First Swing App");
        //frame.setTitle("First Swing App");
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);  //Center Screen
        //frame.setBounds(420,150,300,250);

        //Adding Component
        JLabel lbl = new JLabel("My first Swing App with JLabel..");
        lbl.setBounds(250,200,200,30);
        frame.add(lbl);

        JTextField jtf = new JTextField();
        jtf.setBounds(250,250,80,30);
        frame.add(jtf);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}