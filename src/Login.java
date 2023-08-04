import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    private JLabel label1, label2, label3, label4;
    private JTextField textField;
    private JButton btn;
    public static String userName = "";

    public Login(){
        setLayout(null);
        setTitle("Welcome");
        getContentPane().setBackground(new Color(255, 0, 0));
        setIconImage(new ImageIcon(Login.class.getResource("/images/icon.png")).getImage());

        ImageIcon img = new ImageIcon(getClass().getResource("/images/logo-coca.png"));
        label1 = new JLabel(img);
        label1.setBounds(25, 15, 300, 150);
        add(label1);

        label2 = new JLabel("Holiday control system");
        label2.setBounds(60, 135, 300, 30);
        label2.setFont(new Font("Andale Mono", Font.BOLD | Font.ITALIC, 19));
        label2.setForeground(new Color(255, 255, 255));// text color
        add(label2);

        label3 = new JLabel("Enter your username");
        label3.setBounds(45, 212, 200, 30);
        label3.setFont(new Font("Andale Mono", Font.BOLD, 12));
        label3.setForeground(new Color(255, 255, 255));// text color
        add(label3);

        label4 = new JLabel("©2023 Coca-Cola Company");
        label4.setBounds(85, 375, 300, 30);
        label4.setFont(new Font("Andale Mono", Font.BOLD, 12));
        label4.setForeground(new Color(255, 255, 255));// text color
        add(label4);

        textField = new JTextField();
        textField.setBounds(45, 240, 255, 25);
        textField.setForeground(new Color(255, 0, 0));// text color
        textField.setBackground(new Color(224, 224, 224));
        textField.setFont(new Font("Andale Mono", Font.BOLD, 14));
        add(textField);

        btn =new JButton("Enter");
        btn.setBounds(125, 280, 100, 30);
        btn.setBackground(new Color(255, 255, 255));
        btn.setForeground(new Color(255, 0, 0));
        btn.setFont(new Font("Andale Mono", Font.BOLD, 12));
        add(btn);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event){
        if (event.getSource() == btn){
            userName = textField.getText().trim(); //trim to delete spaces
            if (userName.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter your name");
            } else {
                Terms terms = new Terms();
                terms.setBounds(0, 0, 605, 360);
                terms.setVisible(true);
                terms.setResizable(false);
                terms.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }
    }

    public static void main(String[] args){
        Login login1 = new Login();
        login1.setBounds(0, 0, 350, 450);
        login1.setVisible(true);
        login1.setResizable(false);
        login1.setLocationRelativeTo(null);

    }
}