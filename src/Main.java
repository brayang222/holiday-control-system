import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener{
    private JMenuBar menuBar;
    private JMenu menuOpt, menuCalc, menuAbout, menuColor;
    private JMenuItem calc, red, black, violet, creator, exit, newContent;
    private  JLabel logo, welcome, title, name, surName, lastName,
            department, ancient, result, footer;
    private JTextField workerName, workerSurname, workerLastname;
    private JComboBox<String> comboDepart, comboAncient;
    private JScrollPane scrollPane;
    private JTextArea textArea;

    public Main(){
        setLayout(null);
        setTitle("Main Screen");
        getContentPane().setBackground(new Color(255, 0, 0));
        setIconImage(new ImageIcon(Login.class.getResource("/images/icon.png")).getImage());

        menuBar = new JMenuBar();
        menuBar.setBackground(new Color(255, 0 ,0));
        setJMenuBar(menuBar);

        menuOpt = new JMenu("Options");
        menuOpt.setBackground(new Color(255, 0 ,0));
        menuOpt.setFont(new Font("Andale Mono", 1, 14));
        menuOpt.setForeground(new Color(255, 255, 255));
        menuBar.add(menuOpt);

        menuCalc = new JMenu("Calc");
        menuCalc.setBackground(new Color(255, 0 ,0));
        menuCalc.setFont(new Font("Andale Mono", 1, 14));
        menuCalc.setForeground(new Color(255, 255, 255));
        menuBar.add(menuCalc);

        menuAbout = new JMenu("About");
        menuAbout.setBackground(new Color(255, 0 ,0));
        menuAbout.setFont(new Font("Andale Mono", 1, 14));
        menuAbout.setForeground(new Color(255, 255, 255));
        menuBar.add(menuAbout);

        menuColor = new JMenu("Background Color");
        menuColor.setBackground(new Color(255, 0 ,0));
        menuColor.setFont(new Font("Andale Mono", 1, 14));
        menuColor.setForeground(new Color(255, 0, 0));
        menuOpt.add(menuColor);

        calc = new JMenuItem("Vacations");
        calc.setFont(new Font("Andale Mono", 1, 14));
        calc.setForeground(new Color(255, 0, 0));
        menuCalc.add(calc);
        calc.addActionListener(this);

        red = new JMenuItem("Red");
        red.setFont(new Font("Andale Mono", 1, 14));
        red.setForeground(new Color(255, 0, 0));
        menuColor.add(red);
        red.addActionListener(this);

        black = new JMenuItem("Black");
        black.setFont(new Font("Andale Mono", 1, 14));
        black.setForeground(new Color(255, 0, 0));
        menuColor.add(black);
        black.addActionListener(this);

        violet = new JMenuItem("Violet");
        violet.setFont(new Font("Andale Mono", 1, 14));
        violet.setForeground(new Color(255, 0, 0));
        menuColor.add(violet);
        violet.addActionListener(this);

        creator = new JMenuItem("Creator");
        creator.setFont(new Font("Andale Mono", 1, 14));
        creator.setForeground(new Color(255, 0, 0));
        menuAbout.add(creator);
        creator.addActionListener(this);

        newContent  = new JMenuItem("new Content");
        newContent.setFont(new Font("Andale Mono", 1, 14));
        newContent.setForeground(new Color(255, 0, 0));
        menuOpt.add(newContent);
        newContent.addActionListener(this);

        exit = new JMenuItem("Exit");
        exit.setFont(new Font("Andale Mono", 1, 14));
        exit.setForeground(new Color(255, 0, 0));
        menuOpt.add(exit);
        exit.addActionListener(this);
// ---------------------------- END NAVBAR --------------------------------

        ImageIcon img = new ImageIcon(Login.class.getResource("/images/logo-coca.png"));
        logo = new JLabel(img);
        logo.setBounds(5, 5, 250, 100);
        add(logo);

        welcome = new JLabel("Welcome " + Login.userName + "!");
        welcome.setBounds(280, 30, 300, 50);
        welcome.setFont(new Font("Andale Mono", 1, 32));
        welcome.setForeground(new Color(255, 255, 255));
        add(welcome);

        title = new JLabel("Worker days to Holiday vacations");
        title.setBounds(45, 140, 900, 35);
        title.setFont(new Font("Andale Mono", 1, 30));
        title.setForeground(new Color(255, 255, 255));
        add(title);
// ---------------------------- LABEL STYLE ------------------------------------
        name = new JLabel("Full name");
        name.setBounds(25, 188, 180, 25);
        name.setFont(new Font("Andale Mono", 1, 12));
        name.setForeground(new Color(255, 255, 255));
        add(name);

        workerName = new JTextField();
        workerName.setBounds(25, 213, 150, 25);
        workerName.setBackground(new Color(224, 224, 224));
        workerName.setFont(new Font("Andale Mono", 1, 14));
        workerName.setForeground(new Color(255, 0, 0));
        add(workerName);

        surName = new JLabel("Sur name");
        surName.setBounds(25, 265, 180, 25);
        surName.setFont(new Font("Andale Mono", 1, 12));
        surName.setForeground(new Color(255, 255, 255));
        add(surName);

        workerSurname = new JTextField();
        workerSurname.setBounds(25, 295, 150, 25);
        workerSurname.setBackground(new Color(224, 224, 224));
        workerSurname.setFont(new Font("Andale Mono", 1, 14));
        workerSurname.setForeground(new Color(255, 0, 0));
        add(workerSurname);

        lastName = new JLabel("Last name");
        lastName.setBounds(25, 350, 180, 25);
        lastName.setFont(new Font("Andale Mono", 1, 12));
        lastName.setForeground(new Color(255, 255, 255));
        add(lastName);

        workerLastname = new JTextField();
        workerLastname.setBounds(25, 370, 150, 25);
        workerLastname.setBackground(new Color(224, 224, 224));
        workerLastname.setFont(new Font("Andale Mono", 1, 14));
        workerLastname.setForeground(new Color(255, 0, 0));
        add(workerLastname);

        department = new JLabel("Select department");
        department.setBounds(220, 188, 180, 25);
        department.setFont(new Font("Andale Mono", 1, 12));
        department.setForeground(new Color(255, 255, 255));
        add(department);

        comboDepart = new JComboBox<>();
        comboDepart.setBounds(220, 213, 220, 25);
        comboDepart.setBackground(new Color(224, 224, 224));
        comboDepart.setFont(new Font("Andale Mono", 1, 14));
        comboDepart.setForeground(new Color(255, 0, 0));
        add(comboDepart);
        comboDepart.addItem("");
        comboDepart.addItem("Client attention");
        comboDepart.addItem("Logistic Department");
        comboDepart.addItem("Management Department");

        ancient = new JLabel("Select department");
        ancient.setBounds(220, 248, 180, 25);
        ancient.setFont(new Font("Andale Mono", 1, 12));
        ancient.setForeground(new Color(255, 255, 255));
        add(ancient);

        comboAncient = new JComboBox<>();
        comboAncient.setBounds(220, 273, 220, 25);
        comboAncient.setBackground(new Color(224, 224, 224));
        comboAncient.setFont(new Font("Andale Mono", 1, 14));
        comboAncient.setForeground(new Color(255, 0, 0));
        add(comboAncient);
        comboAncient.addItem("");
        comboAncient.addItem("1 Year of service");
        comboAncient.addItem("From 2 to 6 years of service");
        comboAncient.addItem("7 or more years of service");

        result = new JLabel("Calc result:");
        result.setBounds(220, 307, 180, 25);
        result.setFont(new Font("Andale Mono", 1 ,12));
        result.setForeground(new Color(255,255,255));
        add(result);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setBackground(new Color(244,244,244));
        textArea.setFont(new Font("Andale Mono", 1, 11));
        textArea.setText("\n\n Here appear calc result of vacations:");
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(220,333,385,90);
        add(scrollPane);

        footer = new JLabel("©2023 Coca-Cola Company | all rights reserved");
        footer.setBounds(135, 445, 500, 30);
        footer.setFont(new Font("Andale Mono", 1, 12));
        footer.setForeground(new Color(255, 255, 255));
        add(footer);
    }

    public void actionPerformed(ActionEvent event){
        if (event.getSource() == red){
            getContentPane().setBackground(new Color(255, 0, 0));
        }
        if (event.getSource() == black){
            getContentPane().setBackground(new Color(0, 0, 0));
        }
        if (event.getSource() == violet){
            getContentPane().setBackground(new Color(150, 0, 200));
        }
        if (event.getSource() == exit){
            Login login1 = new Login();
            login1.setBounds(0, 0, 350, 450);
            login1.setVisible(true);
            login1.setResizable(false);
            login1.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if (event.getSource() == newContent){
            workerName.setText("");
            workerSurname.setText("");
            workerLastname.setText("");
            comboDepart.setSelectedItem("");
            comboAncient.setSelectedItem("");
            textArea.setText("\n\n Here appear calc result of vacations:");
        }
        if (event.getSource() == calc){
            String name = workerName.getText();
            String surname = workerSurname.getText();
            String lastname = workerLastname.getText();
            String fullName = name + " " + surname + " " + lastname;
            if (name.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter your name");
            }else if (surname.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter your Sur name");
            } else if (lastname.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter your Last name");
            } else {
                if (comboDepart.getSelectedIndex() == 1){
                    if (comboAncient.getSelectedIndex() == 1){
                        textArea.setText("\n\n The worker " + fullName + "\n with username: "
                                + Login.userName + "\n have the right to 6 days");
                    }
                    if (comboAncient.getSelectedIndex() == 2){
                        textArea.setText("\n\n The worker " + fullName + "\n with username: "
                                + Login.userName + "\n have the right to 14 days");
                    }
                    if (comboAncient.getSelectedIndex() == 3){
                        textArea.setText("\n\n The worker " + fullName + "\n with username: "
                                + Login.userName + "\n have the right to 20 days");
                    }
                }
                if (comboDepart.getSelectedIndex() == 2){
                    if (comboAncient.getSelectedIndex() == 1){
                        textArea.setText("\n\n The worker " + fullName + "\n with username: "
                                + Login.userName + "\n have the right to 7 days");
                    }
                    if (comboAncient.getSelectedIndex() == 2){
                        textArea.setText("\n\n The worker " + fullName + "\n with username: "
                                + Login.userName + "\n have the right to 15 days");
                    }
                    if (comboAncient.getSelectedIndex() == 3){
                        textArea.setText("\n\n The worker " + fullName + "\n with username: "
                                + Login.userName + "\n have the right to 22 days");
                    }
                }
                if (comboDepart.getSelectedIndex() == 3){
                    if (comboAncient.getSelectedIndex() == 1){
                        textArea.setText("\n\n The worker " + fullName + "\n with username: "
                                + Login.userName + "\n have the right to 10 days");
                    }
                    if (comboAncient.getSelectedIndex() == 2){
                        textArea.setText("\n\n The worker " + fullName + "\n with username: "
                                + Login.userName + "\n have the right to 20 days");
                    }
                    if (comboAncient.getSelectedIndex() == 3){
                        textArea.setText("\n\n The worker " + fullName + "\n with username: "
                                + Login.userName + "\n have the right to 30 days");
                    }
                }
                if (comboDepart.getSelectedIndex() == 0){
                    textArea.setText("\n\n The worker " + fullName + "\n with username: "
                            + Login.userName + " you are not entitled to vacation days");
                }
                if (comboAncient.getSelectedIndex() == 0){
                    textArea.setText("\n\n The worker " + fullName + "\n with username: "
                            + Login.userName + " you are not entitled to vacation days");
                }
            }
        }
        if (event.getSource() == creator){
            String message = "<html>Designed & developed by: Brayan Gómez <br>" +
                    "<a href=\"https://github.com/brayang222\">GitHub</a><br>" +
                    "<a href=\"https://www.linkedin.com/in/brayan-g%C3%B3mez-064192281/\">LinkedIn</a></html>";
            JOptionPane.showMessageDialog(null, new JLabel(message));
        }
    }

    public static void main(String[] args){
        Main main = new Main();
        main.setBounds(0, 0, 640, 535);
        main.setVisible(true);
        main.setResizable(false);
        main.setLocationRelativeTo(null);
    }

}
