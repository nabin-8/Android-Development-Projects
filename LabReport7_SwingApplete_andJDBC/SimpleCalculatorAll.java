import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculatorAll extends JFrame implements ActionListener {
    //Declaration for components
    JLabel lblNum1, lblNum2, lblResult;
    JTextField txtNum1, txtNum2, txtResult;
    JButton btnAdd, btnSub, btnMul, btnDiv;

    public SimpleCalculatorAll()
    {
        setTitle("Simple Calculator");
        setLayout(new FlowLayout());
        setSize(200,200);
        setLocationRelativeTo(null); //Center Screen for JFrame
        
        //Adding components
        lblNum1 = new JLabel("Enter first number: ");
        add(lblNum1);
        txtNum1 = new JTextField(15);
        add(txtNum1);
        lblNum2 = new JLabel("Enter second number: ");
        add(lblNum2);
        txtNum2 = new JTextField(15);
        add(txtNum2);
        lblResult = new JLabel("Result: ");
        add(lblResult);
        txtResult = new JTextField(10);
        txtResult.setEditable(false);
        add(txtResult);

        btnAdd = new JButton("ADD");
        add(btnAdd);
        btnSub = new JButton("SUB");
        add(btnSub);

        //Adding ActionListener to btnAdd
        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
        //Setting visible to JFrame
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        int num1 = Integer.parseInt(txtNum1.getText());
        int num2 = Integer.parseInt(txtNum2.getText());
        if(e.getSource()==btnAdd)
        {
            int sum = num1 + num2;
            //JOptionPane.showMessageDialog(this, sum);
            txtResult.setText(String.valueOf(sum));
            //lblResult.setText("Result is "+sum);
        }
        else if(e.getSource()==btnSub)
        {
            int diff = num1 - num2;
            txtResult.setText(String.valueOf(diff));
        }

        //Add btnMul and btnDiv event
        
        
    }
    public static void main(String[] args) {
        new SimpleCalculatorAll();
    }
}
