import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignUpFrame {
    public JFrame signUpFrame;
    public ImageIcon signUpImageIcon;
    public JLabel signUpBaseLabel;
    public JButton signUpLoginButton;
    public JButton signUpSaveButton;
    public JTextField signUpEmail;
    public JPasswordField signUpPassword;
    public JTextField signUpName;
    public JTextField signUpSurname;
    public JTextField signUpPhone;
    public JLabel signUpEmailLabel;
    public JLabel signUpPasswordLabel;
    public JLabel signUpNameLabel;
    public JLabel signUpSurnameLabel;
    public JLabel signUpPhoneLabel;
    public JLabel mainTitle;
    public JLabel signlittleTitle;

    public SignUpFrame() {

        //LABEL KISMI
        signUpFrame = new JFrame("Log In");
        signUpFrame.setSize(1920, 1080);
        signUpFrame.setLocationRelativeTo(null);
        signUpFrame.setLayout(null);
        signUpFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //IMAGE
        signUpImageIcon = new ImageIcon(this.getClass().getResource("Images/0ceb061a0d640e622783b43ac04bec14.jpg"));
        signUpBaseLabel = new JLabel(signUpImageIcon);
        signUpBaseLabel.setSize(1920, 1080);
        signUpFrame.add(signUpBaseLabel);

        //SIGN UP
        signUpSaveButton = new JButton("SIGN UP");
        signUpSaveButton.setBounds(550, 580, 150, 40);
        signUpSaveButton.setFont(new Font("Dubai", Font.BOLD, 25));
        signUpSaveButton.setForeground(Color.WHITE);
        signUpSaveButton.setBackground(new Color(93, 57, 11));
        signUpBaseLabel.add(signUpSaveButton);

        //LOGIN BUTTON
        signUpLoginButton = new JButton("LOG IN");
        signUpLoginButton.setBounds(933, 580, 150, 40);
        signUpLoginButton.setFont(new Font("Dubai", Font.BOLD, 25));
        signUpLoginButton.setForeground(Color.WHITE);
        signUpLoginButton.setBackground(new Color(93, 57, 11));
        signUpBaseLabel.add(signUpLoginButton);

        //NAME
        signUpNameLabel = new JLabel("NAME :");
        signUpNameLabel.setBounds(550, 240, 100, 25);
        signUpNameLabel.setFont(new Font("DUBAI", Font.BOLD, 23));
        signUpNameLabel.setForeground(Color.WHITE);
        signUpBaseLabel.add(signUpNameLabel);

        signUpName = new JTextField();
        signUpName.setBounds(730, 230, 350, 35);
        signUpName.setFont(new Font("Dubai", Font.ITALIC, 17));
        signUpName.setForeground(Color.BLACK);
        signUpBaseLabel.add(signUpName);

        //SURNAME
        signUpSurnameLabel = new JLabel("SURNAME :");
        signUpSurnameLabel.setBounds(550, 300, 300, 25);
        signUpSurnameLabel.setFont(new Font("DUBAI", Font.BOLD, 23));
        signUpSurnameLabel.setForeground(Color.WHITE);
        signUpBaseLabel.add(signUpSurnameLabel);

        signUpSurname = new JTextField();
        signUpSurname.setBounds(730, 290, 350, 35);
        signUpSurname.setFont(new Font("Dubai", Font.ITALIC, 17));
        signUpSurname.setForeground(Color.BLACK);
        signUpBaseLabel.add(signUpSurname);

        //EMAIL
        signUpEmailLabel = new JLabel("Email");
        signUpEmailLabel.setBounds(550, 360, 300, 23);
        signUpEmailLabel.setFont(new Font("DUBAI", Font.BOLD, 23));
        signUpEmailLabel.setForeground(Color.WHITE);
        signUpBaseLabel.add(signUpEmailLabel);

        signUpEmail = new JTextField();
        signUpEmail.setBounds(730, 350, 350, 35);
        signUpEmail.setFont(new Font("Dubai", Font.ITALIC, 17));
        signUpEmail.setForeground(Color.BLACK);
        signUpBaseLabel.add(signUpEmail);

        //PASSWORD
        signUpPasswordLabel = new JLabel("Password");
        signUpPasswordLabel.setBounds(550, 420, 300, 23);
        signUpPasswordLabel.setFont(new Font("DUBAI", Font.BOLD, 23));
        signUpPasswordLabel.setForeground(Color.WHITE);
        signUpBaseLabel.add(signUpPasswordLabel);

        signUpPassword = new JPasswordField();
        signUpPassword.setBounds(730, 410, 350, 35);
        signUpPassword.setFont(new Font("Dubai", Font.ITALIC, 17));
        signUpPassword.setForeground(Color.BLACK);
        signUpBaseLabel.add(signUpPassword);

        //PHONE
        signUpPhoneLabel = new JLabel("PHONE");
        signUpPhoneLabel.setBounds(550, 480, 300, 23);
        signUpPhoneLabel.setFont(new Font("DUBAI", Font.BOLD, 23));
        signUpPhoneLabel.setForeground(Color.WHITE);
        signUpBaseLabel.add(signUpPhoneLabel);

        signUpPhone = new JTextField();
        signUpPhone.setBounds(730, 470, 350, 35);
        signUpPhone.setFont(new Font("Dubai", Font.ITALIC, 17));
        signUpPhone.setForeground(Color.BLACK);
        signUpBaseLabel.add(signUpPhone);

        //MAIN TITLE
        mainTitle = new JLabel("CAFE MANAGEMENT");
        mainTitle.setBounds(550, 50, 750, 80);
        mainTitle.setFont(new Font("Dubai", Font.BOLD, 60));
        mainTitle.setForeground(Color.WHITE);
        signUpBaseLabel.add(mainTitle);

        //LITTLE TITLE
        signlittleTitle = new JLabel("---SIGN IN---");
        signlittleTitle.setBounds(800, 130, 750, 80);
        signlittleTitle.setFont(new Font("Dubai", Font.BOLD, 40));
        signlittleTitle.setForeground(new Color(0, 0, 0, 255));
        signUpBaseLabel.add(signlittleTitle);

        signUpSaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PreparedStatement preparedStatement = null;
                Connection connection = null;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    // Veritabanına bağlanmak için kullandığım kod
                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "15062001");

                    // INSERT sorgusu için PreparedStatement oluşturdum
                    String insertQuery = "INSERT INTO user (name, surname, email, password, phone) VALUES (?, ?, ?, ?, ?)";
                    preparedStatement = connection.prepareStatement(insertQuery);
                    preparedStatement.setString(1, signUpName.getText());
                    preparedStatement.setString(2, signUpSurname.getText());
                    preparedStatement.setString(3, signUpEmail.getText());
                    preparedStatement.setString(4, new String(signUpPassword.getPassword()));
                    preparedStatement.setString(5, signUpPhone.getText());

                    int rowsAffected = 0;
                    if (signUpName.getText().length() < 5) {
                        JOptionPane.showMessageDialog(signUpFrame, "isim en az 5 karakter olacak!");
                    } else if (signUpSurname.getText().length() < 5) {
                        JOptionPane.showMessageDialog(signUpFrame, "soy isim en az 5 karakter olacak!");
                    } else if (signUpEmail.getText().length() < 10) {
                        JOptionPane.showMessageDialog(signUpFrame, "Email en az 10 karakter olacak!");
                    } else if (signUpPassword.getText().length() < 5) {
                        JOptionPane.showMessageDialog(signUpFrame, "şifre en az 5 karakter olacak!");
                    } else if (signUpPhone.getText().length() != 10) {
                        JOptionPane.showMessageDialog(signUpFrame, "numara 10 karakter olacak!");
                    } else {
                        rowsAffected = preparedStatement.executeUpdate();
                    }

                    connection.close();


                    //  Kayıt işlemini kontrol ediyor
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(signUpFrame, "Kayıt başarıyla tamamlandı!");
                    } else {
                        JOptionPane.showMessageDialog(signUpFrame, "Kayıt işlemi başarısız oldu!");
                    }

                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } finally {
                    if (preparedStatement != null) {
                        try {
                            preparedStatement.close();
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }

                    if (connection != null) {
                        try {
                            connection.close();
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }
                }

            }
        });


        signUpLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                LoginFrame loginFrame = null;
                try {
                    loginFrame = new LoginFrame();
                } catch (FontFormatException ex) {
                    throw new RuntimeException(ex);
                }
                loginFrame.loginFrame.setVisible(true);
                signUpFrame.setVisible(false);

            }
        });

        signUpFrame.add(signUpBaseLabel);

        signUpFrame.setVisible(true);
    }

}
