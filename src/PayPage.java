import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class PayPage {
    public JFrame payFrame;
    public JLabel cafeName;
    public JLabel textName;
    JLabel toplamFiyat;
    Menu menu = new Menu();

    public PayPage() {
        payFrame = new JFrame("PAY PAGE");
        menu.menuFrame.setVisible(false);
        payFrame.getContentPane().setBackground(new Color(145, 52, 130));//GetContentPane metodu frame ekler ve kolaylık sağlar düzenlemede
        payFrame.setBounds(0, 0, 1920, 1080);
        payFrame.setLayout(null);
        payFrame.setLocationRelativeTo(null);
        payFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // PAY PANEL
        JPanel payPanel = new JPanel();
        payPanel.setLayout(null);
        payPanel.setBounds(0, 0, 800, 1080);
        payPanel.setBackground(new Color(162, 84, 157, 255));
        payFrame.add(payPanel);

        //PAY IMAGE
        String imageAmet = "/Images/s.png";
        ImageIcon imageCon = new ImageIcon(getClass().getResource(imageAmet));
        Image imageAmethyst = imageCon.getImage().getScaledInstance(180, 130, Image.SCALE_SMOOTH);
        JLabel payImageLabel = new JLabel(new ImageIcon(imageAmethyst));
        payImageLabel.setBounds(260, 40, 250, 250);
        payPanel.add(payImageLabel);

        cafeName = new JLabel(" A M E T H Y S T   C A F E ");
        cafeName.setBounds(250, 220, 600, 100);
        cafeName.setFont(new Font("Niagara Solid", Font.ITALIC, 35));
        cafeName.setForeground(Color.BLACK);
        payPanel.add(cafeName);

        textName = new JLabel("Thank you for choosing us");
        textName.setBounds(220, 450, 600, 100);
        textName.setFont(new Font("Niagara Solid", Font.ITALIC, 45));
        textName.setForeground(Color.BLACK);
        payPanel.add(textName);

        //Menu sınıfındaki toplam fiyat kısmını çekip burada kullandık
        toplamFiyat = new JLabel(menu.sonuncuToplam + " $");
        toplamFiyat.setBounds(320, 320, 600, 100);
        toplamFiyat.setFont(new Font("Niagara Solid", Font.ITALIC, 45));
        toplamFiyat.setForeground(new Color(255, 188, 235));
        payPanel.add(toplamFiyat);
        payFrame.setVisible(true);

        //CREDİT CARD
        JLabel creditName = new JLabel("NAME : ");
        creditName.setBounds(910, 100, 600, 100);
        creditName.setFont(new Font("Niagara Solid", Font.BOLD, 35));
        creditName.setForeground(Color.BLACK);
        payFrame.add(creditName);

        JLabel creditSurname = new JLabel("SURNAME : ");
        creditSurname.setBounds(910, 180, 600, 100);
        creditSurname.setFont(new Font("Niagara Solid", Font.BOLD, 35));
        creditSurname.setForeground(Color.BLACK);
        payFrame.add(creditSurname);

        JLabel creditNo = new JLabel("Credit Card NO : ");
        creditNo.setBounds(910, 260, 600, 100);
        creditNo.setFont(new Font("Niagara Solid", Font.BOLD, 35));
        creditNo.setForeground(Color.BLACK);
        payFrame.add(creditNo);

        JLabel cVV = new JLabel("CVV : ");
        cVV.setBounds(910, 340, 600, 100);
        cVV.setFont(new Font("Niagara Solid", Font.BOLD, 35));
        cVV.setForeground(Color.BLACK);
        payFrame.add(cVV);

        JTextField creditNameText = new JTextField();
        creditNameText.setBounds(1100, 130, 350, 35);
        creditNameText.setFont(new Font("Dubai", Font.ITALIC, 17));
        creditNameText.setForeground(Color.BLACK);
        payFrame.add(creditNameText);

        JTextField creditSurnameText = new JTextField();
        creditSurnameText.setBounds(1100, 210, 350, 35);
        creditSurnameText.setFont(new Font("Dubai", Font.ITALIC, 17));
        creditSurnameText.setForeground(Color.BLACK);
        payFrame.add(creditSurnameText);

        JTextField creditNoText = new JTextField();
        creditNoText.setBounds(1100, 290, 350, 35);
        creditNoText.setFont(new Font("Dubai", Font.ITALIC, 17));
        creditNoText.setForeground(Color.BLACK);
        payFrame.add(creditNoText);

        JTextField creditCvvText = new JTextField();
        creditCvvText.setBounds(1100, 370, 350, 35);
        creditCvvText.setFont(new Font("Dubai", Font.ITALIC, 17));
        creditCvvText.setForeground(Color.BLACK);
        payFrame.add(creditCvvText);

        JButton oK = new JButton("ACCEPT");
        oK.setBounds(1300, 460, 150, 40);
        oK.setFont(new Font("Dubai", Font.BOLD, 22));
        oK.setForeground(Color.WHITE);
        oK.setBackground(new Color(0, 0, 0, 252));
        payFrame.add(oK);

        //Butonun İşlevi
        oK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = creditNameText.getText();
                String surname = creditSurnameText.getText();
                String creditCardNo = creditNoText.getText();
                String cvv = creditCvvText.getText();

                if (name.isEmpty() || surname.isEmpty() || creditCardNo.isEmpty() || cvv.isEmpty()) {
                    JOptionPane.showMessageDialog(payFrame, "Please fill in all the credit card detail!!!.",
                            "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(payFrame, "Payment information accepted. Thank you!",
                            "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });


    }
}
