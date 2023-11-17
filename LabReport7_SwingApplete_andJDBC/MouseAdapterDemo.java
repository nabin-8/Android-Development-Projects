import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.*;
import java.awt.*;

public class MouseAdapterDemo extends MouseAdapter {
    JButton btn;
    JLabel msg;
    JFrame frame;
    JTextField txtNum1;
    public MouseAdapterDemo()
    {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        frame = new JFrame();
        frame.setTitle("Simple Calculator");
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null); //Center Screen for JFrame

        //Adding Text field
        txtNum1 = new JTextField();
        txtNum1.setBounds(100, 100, 150, 30);
        frame.add(txtNum1);

        //Adding button
        btn = new JButton("Click");
        btn.setBounds(120,200,100,50);
        frame.add(btn);

        msg =  new JLabel("----Result----");
        msg.setBounds(120,140,300,30);
        frame.add(msg);

        //Adding mouse event to button 
        btn.addMouseListener(this);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
    public static void main(String[] args) {
        new MouseAdapterDemo();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int num1 = Integer.parseInt(txtNum1.getText());
        if(e.getSource()==btn)
        {
            int sum = num1*num1*num1;
            msg.setText(String.valueOf(sum));
            
        }
    }
    @Override
    public void mouseExited(MouseEvent e) {
        int num1 = Integer.parseInt(txtNum1.getText());
        if(e.getSource()==btn)
        {
            int sum = num1*num1*num1;
            msg.setText(String.valueOf(sum));
            
        }
    }
//     @Override
//     public void mouseExited(MouseEvent e) {
//         msg.setText("Mouse Exited...");
//    }
}
