import javax.swing.*;
import java.awt.*;

public class LayoutManagers {
    static void FlowlayoutDemo()
    {
        JFrame frame = new JFrame("Flowlayout Demo");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null); //Center
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //FullScreen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        frame.setLayout(new FlowLayout());
        
        //Add five JButton
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");
        frame.add(btn1); frame.add(btn2); frame.add(btn3); frame.add(btn4); frame.add(btn5);

        frame.setVisible(true);
    }

    static void BorderLayoutDemo()
    {
         JFrame frame = new JFrame("BorderLayout Demo");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null); //Center
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //FullScreen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setLayout(new BorderLayout(20,25));
        
        //Add five JButton
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");
        frame.add(btn1, BorderLayout.NORTH);
        frame.add(btn2, BorderLayout.SOUTH); 
        frame.add(btn3, BorderLayout.EAST); 
        frame.add(btn4, BorderLayout.WEST); 
        frame.add(btn5, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    static void GridLayoutDemo()
    {
       JFrame frame = new JFrame("GridLayout Demo");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null); //Center
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //FullScreen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,2));
        
        //Add five JButton
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");
        JButton btn6 = new JButton("Button 6");
        frame.add(btn1); frame.add(btn2); frame.add(btn3); frame.add(btn4); frame.add(btn5); frame.add(btn6);
        frame.setVisible(true);
    }

    static void NullLayoutDemo()
    {
        JFrame frame = new JFrame("NullLayout Demo");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null); //Center
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //FullScreen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        //JLabel
        JLabel lbl = new JLabel("Danfe College, Sinamangal");
        lbl.setBounds(150, 10, 250, 30);
        frame.add(lbl);
        //Add five JButton
        JButton btn1 = new JButton("Button 1");
        btn1.setBounds(30, 50, 100, 30);
        JButton btn2 = new JButton("Button 2");
        btn2.setBounds(150, 50, 100, 30);
        JButton btn3 = new JButton("Button 3");
        btn3.setBounds(30,90,100,30);
        JButton btn4 = new JButton("Button 4");
        btn4.setBounds(270,50,100,30);
        JButton btn5 = new JButton("Button 5");
        JButton btn6 = new JButton("Button 6");
        frame.add(btn1); frame.add(btn2); frame.add(btn3); frame.add(btn4); frame.add(btn5); frame.add(btn6);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        //FlowlayoutDemo();
        //BorderLayoutDemo();
        //GridLayoutDemo();
        NullLayoutDemo();
    }
}
