import javax.swing.*;
import java.awt.*;
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
        payImageLabel.setBounds(250, 40, 250, 250);
        payPanel.add(payImageLabel);

        cafeName = new JLabel(" A M E T H Y S T   C A F E ");
        cafeName.setBounds(250, 200, 600, 100);
        cafeName.setFont(new Font("Niagara Solid", Font.ITALIC, 35));
        cafeName.setForeground(Color.BLACK);
        payPanel.add(cafeName);

        textName = new JLabel("Thank you for choosing us");
        textName.setBounds(220, 600, 600, 100);
        textName.setFont(new Font("Niagara Solid", Font.ITALIC, 45));
        textName.setForeground(Color.BLACK);
        payPanel.add(textName);

        //Menu sınıfındaki toplam fiyat kısmını çekip burada kullandık
        toplamFiyat = new JLabel(menu.sonuncuToplam + " $");
        toplamFiyat.setBounds(320, 280, 600, 100);
        toplamFiyat.setFont(new Font("Niagara Solid", Font.ITALIC, 45));
        toplamFiyat.setForeground(new Color(194, 116, 176));
        payPanel.add(toplamFiyat);
        payFrame.setVisible(true);

        //CREDİT CARD

    }
}
