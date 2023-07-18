import javax.swing.*;

public class SignUpFrame {
    public JFrame signUpFrame;
    public ImageIcon signUpImageIcon;
    public JLabel signUpBaseLabel;
    public JButton signUpLoginButton;
    public JButton signUpSaveButton;
    public JTextField signUpEmail;
    public JTextField signUpPassword;
    public JTextField signUpName;
    public JTextField signUpSurname;
    public JTextField signUpPhone;
    public JLabel signUpEmailLabel;
    public JLabel signUpPasswordLabel;
    public JLabel signUpNameLabel;
    public JLabel signUpSurnameLabel;
    public JLabel signUpPhoneLabel;


    public SignUpFrame() {

        //LABEL KISMI
        signUpFrame = new JFrame("Log In");
        signUpFrame.setSize(800, 600);
        signUpFrame.setLocationRelativeTo(null);
        signUpFrame.setLayout(null);
        signUpFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //IMAGE
        signUpImageIcon = new ImageIcon(this.getClass().getResource("/mellow-lane-thumb.jpg"));
        signUpBaseLabel = new JLabel(signUpImageIcon);
        signUpBaseLabel.setSize(800, 600);
        signUpFrame.add(signUpBaseLabel);

        //LOGIN BUTTON
        signUpLoginButton = new JButton("LOG IN");
        signUpLoginButton.setBounds(250, 500, 100, 30);
        signUpBaseLabel.add(signUpLoginButton);

        //SIGN UP
        signUpSaveButton = new JButton("SIGN UP");
        signUpSaveButton.setBounds(450, 500, 100, 30);
        signUpBaseLabel.add(signUpSaveButton);

        //EMAIL PASSWORD
        signUpEmailLabel = new JLabel("Email");
        signUpEmailLabel.setBounds(300, 150, 100, 25);
        signUpBaseLabel.add(signUpEmailLabel);

        signUpEmail = new JTextField();
        signUpEmail.setBounds(375, 150, 100, 25);
        signUpBaseLabel.add(signUpEmail);

        signUpPasswordLabel = new JLabel("Password");
        signUpPasswordLabel.setBounds(300, 200, 100, 25);
        signUpBaseLabel.add(signUpPasswordLabel);

        signUpPassword = new JTextField();
        signUpPassword.setBounds(375, 200, 100, 25);
        signUpBaseLabel.add(signUpPassword);

        signUpSaveButton = new JButton("SIGN UP");

        signUpBaseLabel.add(signUpEmailLabel);


        signUpFrame.setVisible(true);
    }

}
