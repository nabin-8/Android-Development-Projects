import javax.swing.*;

public class SwingAllGuiComponents {
    JFrame frame;
    JLabel lblUser, lblPass, lblSex, lblHobbies, lblCountry, lblComment;
    JTextField txtUser;
    JPasswordField jpfPass;
    JRadioButton rdMale, rdFemale;
    JCheckBox chk1, chk2, chk3, chk4;
    JComboBox<String> jcbCountry;
    JTextArea jta;
    JButton btnSubmit;

    public SwingAllGuiComponents() {
        frame = new JFrame("Simple Registration form");
        frame.setLayout(null);
        frame.setSize(400, 600);
        frame.setLocationRelativeTo(null); // Center Screen
        // frame.setBounds(420,150,300,250);

        // Adding Component
        lblUser = new JLabel("Username: ");
        lblUser.setBounds(50, 50, 150, 30);
        frame.add(lblUser);
        txtUser = new JTextField();
        txtUser.setBounds(200, 50, 150, 30);
        frame.add(txtUser);

        lblPass = new JLabel("Password: ");
        lblPass.setBounds(50, 90, 150, 30);
        frame.add(lblPass);
        jpfPass = new JPasswordField();
        jpfPass.setBounds(200, 90, 150, 30);
        frame.add(jpfPass);

        lblSex = new JLabel("Sex: ");
        lblSex.setBounds(50, 130, 150, 30);
        frame.add(lblSex);
        rdMale = new JRadioButton("Male");
        rdMale.setBounds(200, 130, 70, 30);
        frame.add(rdMale);
        rdFemale = new JRadioButton("Female");
        rdFemale.setBounds(270, 130, 70, 30);
        frame.add(rdFemale);
        ButtonGroup grp = new ButtonGroup();
        grp.add(rdMale);
        grp.add(rdFemale);

        lblHobbies = new JLabel("Hobbies: ");
        lblHobbies.setBounds(50, 170, 150, 30);
        frame.add(lblHobbies);
        chk1 = new JCheckBox("Playing");
        chk1.setBounds(200, 170, 150, 30);
        frame.add(chk1);
        chk2 = new JCheckBox("Reading");
        chk2.setBounds(200, 200, 150, 30);
        frame.add(chk2);
        chk3 = new JCheckBox("Visiting");
        chk3.setBounds(200, 230, 150, 30);
        frame.add(chk3);
        chk4 = new JCheckBox("Tickting");
        chk4.setBounds(200, 260, 150, 30);
        frame.add(chk4);
        // Add other 3 checkbox
        lblCountry = new JLabel("Select Country: ");
        lblCountry.setBounds(50, 290, 150, 30);
        frame.add(lblCountry);

        jcbCountry = new JComboBox<String>();
        jcbCountry.setBounds(200, 290, 150, 30);
        jcbCountry.addItem("Nepal");
        jcbCountry.addItem("India");
        jcbCountry.addItem("China");
        frame.add(jcbCountry);

        // String[] countryList = {"Nepal", "India", "China","Bhutan"};

        // Complete yourself
        
        //Adding Comments
        lblComment = new JLabel("Comments: ");
        lblComment.setBounds(50, 320, 150, 30);
        frame.add(lblComment);

        jta=new JTextArea();
        jta.setBounds(200, 330, 150, 80);
        frame.add(jta);

        //Adding Submit Button
        btnSubmit=new JButton("Submit");
        btnSubmit.setBounds(200,440,150,30);
        frame.add(btnSubmit);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SwingAllGuiComponents();
    }
}