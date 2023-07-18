import javax.swing.*;
import java.awt.*;

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


    public LoginFrame() throws FontFormatException {
        //LABEL KISMI
        loginFrame = new JFrame("Log In");
        loginFrame.setSize(1920, 1080);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setLayout(null);
        loginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //IMAGE
        loginImageIcon = new ImageIcon(this.getClass().getResource("0ceb061a0d640e622783b43ac04bec14.jpg"));
        loginBaseLabel = new JLabel(loginImageIcon);
        loginBaseLabel.setBounds(-200,-100,1920, 1080);
        loginFrame.add(loginBaseLabel);

        //LOGIN BUTTON
        loginButton = new JButton("LOG IN");
        loginButton.setBounds(1173, 600, 150, 40);
        loginButton.setFont(new Font("Dubai",Font.BOLD,25));
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(95, 57, 11));
        loginBaseLabel.add(loginButton);

        //SIGN UP
        signUpButton = new JButton("SIGN UP");
        signUpButton.setBounds(800, 600, 150, 40);
        signUpButton.setFont(new Font("Dubai",Font.BOLD,25));
        signUpButton.setForeground(Color.WHITE);
        signUpButton.setBackground(new Color(95, 57, 11));
        loginBaseLabel.add(signUpButton);

        //EMAIL
        loginEmailLabel = new JLabel("Email");
        loginEmailLabel.setBounds(800, 400, 100, 25);
        loginEmailLabel.setFont(new Font("Dubai",Font.BOLD ,30));
        loginEmailLabel.setForeground(Color.WHITE);
        loginBaseLabel.add(loginEmailLabel);

        loginEmail = new JTextField();
        loginEmail.setBounds(970, 395, 350, 35);
        loginEmail.setFont(new Font("Dubai",Font.BOLD ,30));
        loginEmail.setForeground(Color.BLACK);
        loginBaseLabel.add(loginEmail);

        //PASSWORD
        loginPasswordLabel = new JLabel("Password");
        loginPasswordLabel.setBounds(800, 470, 350, 35);
        loginPasswordLabel.setFont(new Font("Dubai",Font.BOLD ,30));
        loginPasswordLabel.setForeground(Color.WHITE);
        loginBaseLabel.add(loginPasswordLabel);

        loginPassword = new JTextField();
        loginPassword.setBounds(970, 472, 350, 35);
        loginPassword.setFont(new Font("Dubai",Font.BOLD ,30));
        loginPassword.setForeground(Color.BLACK);
        loginBaseLabel.add(loginPassword);

        signUpButton = new JButton("SIGN UP");

        loginBaseLabel.add(loginEmailLabel);


        loginFrame.setVisible(true);
    }
}

