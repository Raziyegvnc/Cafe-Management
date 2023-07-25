import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LoginFrame {
    public JFrame loginFrame;
    public ImageIcon loginImageIcon;
    public JLabel loginBaseLabel;
    public JButton loginButton;
    public JButton signUpButton;
    public JTextField loginEmail;
    public JTextField loginPassword;
    public JLabel loginEmailLabel;
    public JLabel loginPasswordLabel;
    public JLabel loginTitle;
    public JLabel littleTitle;


    public LoginFrame() throws FontFormatException {
        //LABEL KISMI
        loginFrame = new JFrame("Log In");
        loginFrame.setSize(1920, 1080);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setLayout(null);
        loginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //IMAGE
        loginImageIcon = new ImageIcon(this.getClass().getResource("Images/cafes.jpg"));
        loginBaseLabel = new JLabel(loginImageIcon);
        loginBaseLabel.setBounds(-200, -100, 1920, 1080);
        loginFrame.add(loginBaseLabel);

        //LOGIN BUTTON
        loginButton = new JButton("LOG IN");
        loginButton.setBounds(1073, 593, 150, 40);
        loginButton.setFont(new Font("Dubai", Font.BOLD, 25));
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(138, 18, 72));
        loginBaseLabel.add(loginButton);

        //SIGN UP
        signUpButton = new JButton("SIGN UP");
        signUpButton.setBounds(700, 600, 150, 40);
        signUpButton.setFont(new Font("Dubai", Font.BOLD, 25));
        signUpButton.setForeground(Color.WHITE);
        signUpButton.setBackground(new Color(138, 18, 72));
        loginBaseLabel.add(signUpButton);

        //EMAIL
        loginEmailLabel = new JLabel("Email :");
        loginEmailLabel.setBounds(700, 400, 100, 25);
        loginEmailLabel.setFont(new Font("Dubai", Font.BOLD, 30));
        loginEmailLabel.setForeground(Color.WHITE);
        loginBaseLabel.add(loginEmailLabel);

        loginEmail = new JTextField();
        loginEmail.setBounds(870, 385, 350, 35);
        loginEmail.setFont(new Font("Dubai", Font.ITALIC, 17));
        loginEmail.setForeground(Color.BLACK);
        loginBaseLabel.add(loginEmail);

        //PASSWORD
        loginPasswordLabel = new JLabel("Password :");
        loginPasswordLabel.setBounds(700, 473, 350, 35);
        loginPasswordLabel.setFont(new Font("Dubai", Font.BOLD, 30));
        loginPasswordLabel.setForeground(Color.WHITE);
        loginBaseLabel.add(loginPasswordLabel);

        loginPassword = new JPasswordField();
        loginPassword.setBounds(870, 472, 350, 35);
        loginPassword.setFont(new Font("Dubai", Font.ITALIC, 17));
        loginPassword.setForeground(Color.BLACK);
        loginBaseLabel.add(loginPassword);

        //MAIN TITLE
        loginTitle = new JLabel("C A F E   M A N A G E M E N T");
        loginTitle.setBounds(620, 180, 1000, 80);
        loginTitle.setFont(new Font("Niagara Solid", Font.BOLD, 100));
        loginTitle.setForeground(Color.WHITE);
        loginBaseLabel.add(loginTitle);

        //LITTLE TITLE
        littleTitle = new JLabel("---LOG IN---");
        littleTitle.setBounds(850, 280, 750, 80);
        littleTitle.setFont(new Font("Dubai", Font.BOLD, 40));
        littleTitle.setForeground(new Color(196, 23, 104, 255));
        loginBaseLabel.add(littleTitle);

        loginBaseLabel.add(loginEmailLabel);

        //FRAMELERİ BAĞLAMA
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "15062001");
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery("select * from user");
                    boolean isLogin = false;

                    while (resultSet.next()) {
                        String userName = resultSet.getString("name");
                        String password = resultSet.getString("password");

                        if (userName.equals(loginEmail.getText()) || password.equals(loginPassword.getText())) {
                            Menu menu = new Menu();
                            menu.menuFrame.setVisible(true);
                            isLogin = true;
                            break;
                        }
                    }
                    //if ( isLogin == false) { Böylede doğru olur
                    if (!resultSet.next() && isLogin == false) {
                        String msj = "Please Check Your Email or Password";
                        JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SignUpFrame signUpFrame = new SignUpFrame();
                signUpFrame.signUpFrame.setVisible(true);
                loginFrame.setVisible(false);
            }
        });

        loginFrame.setVisible(true);
    }
}

