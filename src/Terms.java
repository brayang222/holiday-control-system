import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Terms extends JFrame implements ActionListener, ChangeListener {
    private JLabel label1, label2;
    private JCheckBox checkBox;
    private JButton btn1, btn2;
    private JScrollPane scrollPane;
    private JTextArea textArea;

    public Terms(){
        setLayout(null);
        setTitle("Use license");
        setIconImage(new ImageIcon(Login.class.getResource("/images/icon.png")).getImage());

        label1 =  new JLabel("\n\nTerm & conditions");
        label1.setBounds(215, 5, 200, 30);
        label1.setFont(new Font("Andale Mono", 1, 20));
        label1.setForeground(new Color(0, 0, 0));
        add(label1);

        textArea = new JTextArea();
        textArea.setEditable(false); // not editable text
        textArea.setFont(new Font("Andale Mono", 0, 12));
        textArea.setText("\n\n Terms: \n\n 1: don't distribute" );
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 40, 575, 200);
        add(scrollPane);

        checkBox = new JCheckBox( Login.userName + " accept terms & conditions");
        checkBox.setBounds(10, 250, 300, 30);
        checkBox.addChangeListener(this);
        add(checkBox);

        btn1 = new JButton("Continue");
        btn1.setBounds(10, 290, 100, 30);
        btn1.addActionListener(this);
        btn1.setEnabled(false);
        add(btn1);

        btn2 = new JButton("No accept");
        btn2.setBounds(120, 290, 100, 30);
        btn2.addActionListener(this);
        btn2.setEnabled(true);
        add(btn2);

        ImageIcon img = new ImageIcon(Login.class.getResource("/images/coca-cola.png"));
        label2 = new JLabel(img);
        label2.setBounds(315, 135, 300, 300);
        add(label2);
    }

    public void stateChanged(ChangeEvent event){
        if (checkBox.isSelected()){
            btn1.setEnabled(true);
            btn2.setEnabled(false);
        } else {
            btn1.setEnabled(false);
            btn2.setEnabled(true);
        }
    }

    public void actionPerformed(ActionEvent event){
        if (event.getSource() == btn1){
            Main main = new Main();
            main.setBounds(0, 0, 640, 535);
            main.setVisible(true);
            main.setResizable(false);
            main.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if (event.getSource() == btn2){
            Login login1 = new Login();
            login1.setBounds(0, 0, 350, 450);
            login1.setVisible(true);
            login1.setResizable(false);
            login1.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }

    public static void main(String[] args){
        Terms terms = new Terms();
        terms.setBounds(0, 0, 605, 360);
        terms.setVisible(true);
        terms.setResizable(false);
        terms.setLocationRelativeTo(null);
    }

}
