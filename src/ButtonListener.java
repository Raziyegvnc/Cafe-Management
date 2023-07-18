import javax.print.attribute.standard.MediaSize;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import static javax.swing.JOptionPane.showMessageDialog;
public class ButtonListener implements ActionListener {
    public JTextField t1;
    public JTextField t2;
    ControlPanel controlPanel;
    public ButtonListener(JTextField t1_field , JTextField t2_field , ControlPanel panel) {
        t1 = t1_field;
        t2 = t2_field;
        controlPanel = panel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Email: " + t1.getText());
        System.out.println("Password: " + t2.getText());

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "15062001");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from user");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("username"));

                String userName = resultSet.getString("username");
                String password = resultSet.getString("password");

                if (userName.equals(t1.getText()) || password.equals(t2.getText())) {
                    OtherClass otherClass = new OtherClass();
                    otherClass.run();
                    controlPanel.setVisible(false);
                } else {
                    String msj = "Please Check Your Email or Password";
                    JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

//        if ("".equals(t1.getText()) || "".equals(t2.getText())){
//            OtherClass otherClass = new OtherClass();
//            otherClass.run();
//            controlPanel.setVisible(false);
//        }
//        else {
//            String msj = "Please Check Your Email or Password";
//            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
//        }
//        //if (e.getActionCommand().equals())
//    }
    }}



